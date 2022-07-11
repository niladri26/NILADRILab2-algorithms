package com.gl.main;

import java.util.Scanner;

import com.gl.services.calculation.NotesCount;
import com.gl.services.mergeSort.MergeSort;

public class DriverClass {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the number of currency denominatons ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		int notes[] = new int[number];
		System.out.println("enter the currency denomination value ");
		for (int i = 0; i < number; i++) {
			notes[i] = in.nextInt();
		}
		
		System.out.println("Enter the amount of payment ");
		int amount = in.nextInt();

		ms.sort(notes, 0, notes.length - 1);
		notesCount.notesCountImpl(notes, amount);
	}
}
