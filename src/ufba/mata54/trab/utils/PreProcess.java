package ufba.mata54.trab.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PreProcess {
	public static String read(File file ) {
		String fileContents = "";
		
		try {
			FileInputStream inputStream;
			inputStream = new FileInputStream(file);
			
			int byteRead;
			char charRead;
			
			while((byteRead = inputStream.read()) != -1) {
				charRead = (char) byteRead;
				fileContents = fileContents + charRead;
			}
			
			inputStream.close();
			
			return fileContents;
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.");
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return fileContents;
	}
}
