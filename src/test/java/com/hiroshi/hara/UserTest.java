package com.hiroshi.hara;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void インスタンス化テスト() throws Exception {
		// Exercise
		User instance = new User("001", "userName", "password");
		// Verify
		assertThat(instance.getId(), is("001"));
		assertThat(instance.getUserName(), is("userName"));
		assertThat(instance.getPassword(), is("password"));
	}
	
	@Test
	public void インスタンス化時にフィールドをnull値に設定する() throws Exception {
		// Exercise
		User instance = new User(null, null, null);
		// Verify
		assertThat(instance.getId(), is(nullValue()));
		assertThat(instance.getUserName(), is(nullValue()));
		assertThat(instance.getPassword(), is(nullValue()));
	}
	
	@Test
	public void 異なる参照でもidが同値なら同一のインスタンスとみなす() throws Exception {
		// SetUp
		User instance = new User("001", "userName", "password");
		User other = new User("001", "otherName", "otherPassword");
		// Exercise
		boolean actual = instance.equals(other);
		// Verify
		assertThat(actual, is(true));
	}
	
	@Test
	public void equalsの5大ルールテスト() throws Exception {
		// SetUp
		User instance = new User("001", "userName", "password");
		User other = new User("001", "otherName", "otherPassword");
		User thirdParty = new User("001", "thirddParty", "thirdPassword");
		// Exercise
		boolean actualReflexive = instance.equals(instance);
		boolean actualSymmetric = instance.equals(other) && other.equals(instance);
		boolean actualTransitive = instance.equals(other) 
				                             && other.equals(thirdParty) 
				                             && instance.equals(thirdParty);
		boolean actualConsistent = instance.equals(other) && instance.equals(other);
		boolean actualNullValue = instance.equals(null);
		// Verify
		// 反射性(reflexive)
		assertThat(actualReflexive, is(true));
		// 対称性(symmetric)
		assertThat(actualSymmetric, is(true));
		// 推移性(transitive)
		assertThat(actualTransitive, is(true));
		// 一貫性(consistent)
		assertThat(actualConsistent, is(true));
		// null値との比較はfalse
		assertThat(actualNullValue, is(false));
	}
	
	@Test
	public void equalsがtrueならhashCodeの戻り値も等しくなる() throws Exception {
		// SetUp
		User instance = new User("001", "userName", "password");
		User other = new User("001", "otherName", "otherPassword");
		// Exercise
		int instanceHash = instance.hashCode();
		int otherHash = other.hashCode();
		boolean actual = instanceHash == otherHash;
		// Verify
		assertThat(actual, is(true));
	}

}
