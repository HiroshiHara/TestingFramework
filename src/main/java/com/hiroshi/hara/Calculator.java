package com.hiroshi.hara;

public class Calculator {
	
	/**
	 * 引数で与えられた2値の和を返すメソッドです。
	 * 引数、戻り値は共に整数です。
	 * @param x 
	 * @param y
	 * @return x + y
	 */
	public int addtion(int x, int y) {
		return x + y;
	}
	
	/**
	 * 引数で与えられた2値の差を返すメソッドです。
	 * 引数、戻り値は共に整数です。
	 * @param x
	 * @param y
	 * @return x - y
	 */
	public int subtraction(int x, int y) {
		return x - y;
	}
	
	/**
	 * 引数で与えられた2値の乗を返すメソッドです。
	 * 引数、戻り値は共に整数です。
	 * @param x
	 * @param y
	 * @return x * y
	 */
	public int multiplication(int x, int y) {
		return x * y;
	}
	
	/**
	 * 引数で与えられた2値の除を返すメソッドです。
	 * 引数は整数、戻り値は浮動小数点数です。
	 * @param x
	 * @param y
	 * @return x / y
	 * @throws IllegalArgumentException
	 */
	public double division(int x, int y) throws IllegalArgumentException {
		if (y == 0) {
			throw new IllegalArgumentException("ゼロ除算が発生しました");
		}
		return x / y;
	}
	
	/**
	 * 引数で与えられた2値の除算の余りを返すメソッドです。
	 * 引数、戻り値は共に整数です。
	 * @param x
	 * @param y
	 * @return x % y
	 * @throws IllegalArgumentException
	 */
	public int remainder(int x, int y) throws IllegalArgumentException {
		if (y == 0) {
			throw new IllegalArgumentException("ゼロ除算が発生しました");
		}
		return x % y;
	}
	
}

