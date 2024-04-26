package com.file.streams;

import java.io.FileReader;
import java.io.IOException;

public class fileRead {

	public static void main(String[] args) {

		try {

			FileReader fileReader = new FileReader("src\\Files\\notes.txt");

			int letter = fileReader.read();

			while (fileReader.ready()) {
				System.out.println((char) letter);
				letter = fileReader.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
