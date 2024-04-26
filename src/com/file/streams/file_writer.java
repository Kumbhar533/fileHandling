package com.file.streams;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {

	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("src\\Files\\notes.txt")) {

			fileWriter.write("java"); // this is override the previous sentence if you want to append the sentence
										// FileWriter fileWriter = new FileWriter("src\\Files\\notes.txt") here add true

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
