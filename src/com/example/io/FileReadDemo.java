package com.example.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadDemo {

	public static void main(String[] args) {

		String filePath = "./files/holidays1111.txt";
		InputStream inputStream = null;
		try {

			inputStream = new FileInputStream(filePath);
			System.out.println("File opened successfully!!!!!");

			int asciiCode = inputStream.read();

			while (asciiCode != -1) {
				System.out.print((char) asciiCode);
				asciiCode = inputStream.read();
			}

			System.out.println("\nFile reading done!!!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
					System.out.println("\nFile closed successfully!!!!!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
