package com.greatlearning.services;

public class Services {
	public void result(int transactionArray[], int targetValue) {

		int n = transactionArray.length;
		int sum = 0;
		int i = 0;
		while (sum <= targetValue && i < n) {
			sum = sum + transactionArray[i];
			i++;
		}
		if (sum >= targetValue) {
			System.out.println("target achieved after " + i + " transactions ");
		} else {
			System.out.println("Target not acieved !!!");
		}
	}
}
