package com.file.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fileInputStream = new FileInputStream("notes.txt");
				FileOutputStream fileOutputStream = new FileOutputStream("newNotes.txt")) {

			byte[] a = new byte[1024];

			int s;
			while ((s = fileInputStream.read(a)) > 0) {

				fileOutputStream.write(a, 0, s);
			}
		}

	}

}
