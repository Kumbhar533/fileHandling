package com.file.streams;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RemoveVowelFromFile {

	public static void main(String[] args) {

		try (FileInputStream is = new FileInputStream("newNotes.txt");
				InputStreamReader isr = new InputStreamReader(is);

		) {

			StringBuffer buffer = new StringBuffer();

			while (isr.ready()) {

				int letter = isr.read();
				char new_letter = (char) letter;

				if (new_letter == 'a' || new_letter == 'i' || new_letter == 'o' || new_letter == 'e'
						|| new_letter == 'u') {

				} else {
					buffer.append(new_letter);
				}
			}
			System.out.println(buffer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
