package com.gl.services.calculation;

public class NotesCount {

	public void notesCountImpl(int[] notes, int amount) {
		// TODO Auto-generated method stub
		int counter[] = new int[notes.length];

		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					counter[i] = amount / notes[i];
					amount = amount - counter[i] * notes[i];

				}
			}
			if (amount > 0) {
				System.out
						.println("exact amount cannot be given with the highest demonstration");
			} else {
				System.out
						.println("The payment approach in order to give min no of notes as follows ");
				for (int i = 0; i < notes.length; i++) {
					if (counter[i] != 0) {
						System.out.println(notes[i] + " --> " + counter[i]);
					}
				}

			}
		} catch (ArithmeticException e) {
			System.out.println(e + "notes of demonstration 0 is invalid ");
		}
	}

}
