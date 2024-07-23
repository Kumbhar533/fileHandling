
/**
		 * In Java, InputStreamReader is used to read bytes from an InputStream and
		 * decode them into characters using a specified charset or the default charset
		 * if not specified.
		 **/
package com.file.streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderUse {

	public static void input() {

		// Create a FileInputStream to read the file as a byte stream
		try (FileInputStream fileInputStream = new FileInputStream("notes.txt");

				// Create an InputStreamReader to convert the byte stream to a character stream
				InputStreamReader isr = new InputStreamReader(fileInputStream);

				BufferedReader br = new BufferedReader(isr);) {

			String line;

			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}

		} catch (IOException e) {

			System.err.println(e.getMessage());
		}

		catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws IOException {

		InputStreamReaderUse.input();

	}
}
