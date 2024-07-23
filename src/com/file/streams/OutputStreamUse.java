package com.file.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamUse {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("notes.txt");
				InputStreamReader inputStreamReader = new InputStreamReader(fis);

				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

				FileOutputStream fos = new FileOutputStream("newNotes.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bufferedWriter = new BufferedWriter(osw);) {

			String line;
			while ((line = bufferedReader.readLine()) != null) {

				bufferedWriter.write(line);
				bufferedWriter.newLine();

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
