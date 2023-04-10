package io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

		public class IOEx {
		   public static void main(String[] args) {
		      try {
		         // Create a new file
		         File file = new File("example.txt");

		         // Create a new file writer and write a message to the file
		         FileWriter writer = new FileWriter(file);
		         writer.write("Hello, World!");
		         writer.close();

		         // Create a new file reader and read the message from the file
		         FileReader reader = new FileReader(file);
		         BufferedReader bufferedReader = new BufferedReader(reader);
		         String line = bufferedReader.readLine();
		         System.out.println(line);
		         bufferedReader.close();
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		   }
		}