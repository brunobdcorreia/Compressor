package ufba.mata54.trab.compress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compressor {
	public static List<Integer> compress(String text) {
		int dictSize = 256;
		Map<String, Integer> symbols = new HashMap<String, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < 256; i++) {
			symbols.put("" + (char) i, i);
		}
		
		String word = "";
		
		for(char character : text.toCharArray()) {
			String newWord = word + character;
			
			if(symbols.containsKey(newWord)) {
				word = newWord;
			} else {
				result.add(symbols.get(word));
				symbols.put(newWord, dictSize++);
				word = "" + character;
			}
		}
		
		if(!word.equals("")) {
			result.add(symbols.get(word));
		}
		
		return result;
	}
}
