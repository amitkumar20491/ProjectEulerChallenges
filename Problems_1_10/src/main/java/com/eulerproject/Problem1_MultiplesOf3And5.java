package com.eulerproject;

/*
 * https://projecteuler.net/problem=1
 */
public class Problem1_MultiplesOf3And5 {
	public int findMutiplesOf3And5(int N) {
		int x = 3, y = 5;
		int SX = x * findSumOfNIntegers(N-- / x);
		int SY = y * findSumOfNIntegers(N-- / y);
		int SLCM = (LCM(x , y)) * findSumOfNIntegers(N-- / LCM(x , y));
		return SX + SY - SLCM;
	}

	public int findSumOfNIntegers(int N) {
		return ((N * (N +1)) / 2);
	}

	public int LCM(int x, int y) {
		return (x * y) / GCD(x, y);
	}

	public int GCD(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; ++i) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		return gcd;
	}
}
