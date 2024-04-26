package com.file.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer_reader {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// byte to char then read the char
			System.out.println("enter the string");
			String readLine = br.readLine();
			System.out.println("you typed :->" + readLine);

		} catch (IOException e) {
			e.getMessage();
		}

		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\Files\\notes.txt"));

			while (br.ready()) {
				String readLine = br.readLine();
				System.out.println(readLine);
			}

		} catch (IOException e) {
			e.getMessage();
		}
	}

}
