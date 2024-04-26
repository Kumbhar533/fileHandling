package com.file.streams;

import java.io.IOException;
import java.io.InputStreamReader;

public class input_stream_reader {

	public static void main(String[] args) {

		try {

			InputStreamReader isr = new InputStreamReader(
					System.in); /*
								 * In Java, InputStreamReader is used to read bytes from an InputStream and
								 * decode them into characters using a specified charset or the default charset
								 * if not specified.
								 */

			System.out.println("enter the letter");
			int input = isr.read();

			while (isr.ready()) {
				System.out.println((char) input);
				input = isr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
