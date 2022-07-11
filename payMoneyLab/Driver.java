package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.Services;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the no. of targets to be achieved");
		int targetno = sc.nextInt();
		for (int i = 0; i < targetno; i++) {
			System.out.println("Enter the value of target ");
			int target = sc.nextInt();
			Services obj = new Services();
			obj.result(arr, target);
		}

	}

}
