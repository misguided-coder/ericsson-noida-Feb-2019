package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteDemo {

	public static void main(String[] args) {

		String filePath = "./files/movies.txt";
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(filePath,true);
			System.out.println("File opened successfully!!!!!");
			
			outputStream.write(65);
			
			System.out.println("File writing done!!!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (outputStream != null) {
					outputStream.close();
					System.out.println("\nFile closed successfully!!!!!");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
