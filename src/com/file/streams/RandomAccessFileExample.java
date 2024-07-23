package com.file.streams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		String filePath = "notes.txt";

		// Write data to the file
		try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
			// Write UTF strings
			raf.writeUTF("hello java");
			raf.writeUTF("by byy java");

			// Move the file pointer to the beginning and write an integer
			raf.seek(0); // Move to the start
			raf.writeInt(123); // Write integer at the beginning

			// Move the file pointer to the end and write another UTF string
			raf.seek(raf.length()); // Move to the end
			raf.writeUTF("now end happen"); // Write at the end

			System.out.println("Data is written to the file.");
		} catch (IOException e) {
			e.printStackTrace(); // Print stack trace for debugging
		}

		// Read data from the file
		try (RandomAccessFile r = new RandomAccessFile(filePath, "r")) {
			// Read the integer first
			System.out.println("Integer: " + r.readInt());

			// Read the UTF strings
			System.out.println("First UTF String: " + r.readUTF());
			System.out.println("Second UTF String: " + r.readUTF());

			// Read the last UTF string
			System.out.println("Last UTF String: " + r.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
