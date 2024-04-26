package com.file.streams;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class output_stream_writer {

	public static void main(String[] args) {

		try (OutputStreamWriter osw = new OutputStreamWriter(
				System.out)) {/*
								 * In Java, OutputStreamWriter is used to write characters to an OutputStream,
								 * converting the characters into bytes using a specified charset or the default
								 * charset if not specified. and system.out helps to covert into byte
								 */

			osw.write("Hello");
			osw.write("\n");
			osw.write('S');
			osw.write(33);

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
	}

}
