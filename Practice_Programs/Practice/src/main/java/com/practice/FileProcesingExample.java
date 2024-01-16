package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcesingExample {
	public static void main(String[] args) {
		String inputfile = "C:\\Users\\samrsawant\\Documents\\WorkSpace\\Practice_Programs\\Practice\\src\\main\\java\\inputfile.txt";
		String outputfile = "C:\\Users\\samrsawant\\Documents\\WorkSpace\\Practice_Programs\\Practice\\src\\main\\java\\outputfile.txt";
		
		try(FileReader fileReader = new FileReader(inputfile);
			BufferedReader bufferreader = new BufferedReader(fileReader);
				
			FileWriter fileWriter = new FileWriter(outputfile);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
				){
			
			String line;
			while((line = bufferreader.readLine()) != null) {
				int number = Integer.parseInt(line);
				int square = number * number;
				
				bufferWriter.write(String.valueOf(square));
				  bufferWriter.newLine();
				
			}
			 System.out.println("Processing complete. Results written to " + outputfile);
		}
		catch (IOException e) {
            // Handle IOException
            e.printStackTrace();
        }
	}
}
