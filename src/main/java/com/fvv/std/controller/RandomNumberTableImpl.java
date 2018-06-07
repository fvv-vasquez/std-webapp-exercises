package com.fvv.std.controller;

import java.util.Random;

public class RandomNumberTableImpl {

	Random random = new Random();
	
	public int generateRandomColumnOne() {
		int random1 = 0;
		for (int i = 0; i < 25; i++) {
			random1 = random.nextInt(11);
		}
		return random1;
	}
	
	public int generateRandomColumnTwo() {
		int random2 = 0;
		for (int i = 0; i < 25; i++) {
			random2 = random.nextInt(11);
		}
		return random2;
	}
	
	public int generateRandomColumnThree() {
		int random3 = 0;
		for (int i = 0; i < 25; i++) {
			random3 = random.nextInt(11);
		}
		return random3;
	}
	
	/*int verticalSum1 = 0;
	int verticalSum2 = 0;
	int verticalSum3 = 0;
	int verticalSum4 = 0;
	double verticalSum5 = 0;
	double verticalAverage1 = 0;
	double verticalAverage2 = 0;
	double verticalAverage3 = 0;
	double verticalAverage4 = 0;
	double verticalAverage5 = 0;

	for (int i = 0; i < 25; i++) {
		int random1 = random.nextInt(11);
		int random2 = random.nextInt(11);
		int random3 = random.nextInt(11);
		int horizontalSum = random1 + random2 + random3;
		double horizontalAverage = horizontalSum / 3.0;
		verticalSum1 += random1;
		verticalSum2 += random2;
		verticalSum3 += random3;
		verticalSum4 += horizontalSum;
		verticalSum5 += horizontalAverage;
		verticalAverage1 = verticalSum1 / 25.0;
		verticalAverage2 = verticalSum2 / 25.0;
		verticalAverage3 = verticalSum3 / 25.0;
		verticalAverage4 = verticalSum4 / 25.0;
		verticalAverage5 = verticalSum5 / 25.0;*/
}
