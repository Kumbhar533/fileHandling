package com.file.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PalindromeFileCheck {

	public static void main(String[] args) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes.txt"));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("newNotes.txt"))) {

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				if (isPalindrome(line)) {
					System.err.println(line);
					bufferedWriter.write(line);
					bufferedWriter.newLine();
				}
			}

		} catch (Exception e) {

			e.getCause();
		}

	}

	private static boolean isPalindrome(String line) {
		String clean = line.replace("\\s", "").toLowerCase().trim();
		System.out.println(clean);
		return clean.equals(new StringBuilder(line.trim()).reverse().toString());
	}

}
