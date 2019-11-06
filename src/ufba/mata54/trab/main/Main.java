package ufba.mata54.trab.main;

import java.io.File;

import ufba.mata54.trab.utils.InsufficientArgumentsException;
import ufba.mata54.trab.utils.PreProcess;

public class Main {

	public static void main(String[] args) throws InsufficientArgumentsException {
		String op = "";
		String filename = "";
		
		if(args.length <= 1) {
			throw new InsufficientArgumentsException("Numero insuficiente de argumentos.");
		} else {
			op = args[0];
			filename = "test_files\\" + args[1];
			System.out.println("Op: " + op + "\nFilename: " + filename);
		}

		File f = new File(filename);
		
		System.out.println(PreProcess.read(f));
	}

}
