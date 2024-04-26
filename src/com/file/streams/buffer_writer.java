package com.file.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class buffer_writer {

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			bw.write("this is my day");

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (BufferedWriter mq = new BufferedWriter(new FileWriter("src\\Files\\notes.txt", true))) {

			mq.write("This helps me more than you ok");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
