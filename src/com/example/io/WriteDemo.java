package com.example.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteDemo {

	public static void main(String[] args) {

		String filePath = "./files/movies.txt";
		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		try {
			outputStream = new FileOutputStream(filePath,true);
			outputStreamWriter = new OutputStreamWriter(outputStream);
			
			System.out.println("File opened successfully!!!!!");
			
			outputStreamWriter.write("Movies are fun.\n");
			outputStreamWriter.write("Movies are time pass.\n");
			
			System.out.println("File writing done!!!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (outputStreamWriter != null) {
					outputStreamWriter.close();
					System.out.println("\nFile closed successfully!!!!!");
				}
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
