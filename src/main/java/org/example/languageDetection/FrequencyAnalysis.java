package org.example.languageDetection;

import java.util.Map;
import java.util.HashMap;

public class FrequencyAnalysis {

	private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// the method to do frequency analysis
	// count occurences of given characters
	private Map<Character, Integer> run(String text){
		// the text to analyze
		text = text.toUpperCase();

		// use a HashMap to store the letter-frequency pairs
		Map<Character, Integer> frequencies = new HashMap<>();

		// initialise the HashMap with all of the letters of all of the ALPHABET.
		for(int i=0; i<ALPHABET.length(); i++){
			frequencies.put(ALPHABET.charAt(i),0);
		}

		for(int i=0; i<text.length();i++){
			char c = text.charAt(i);

			// keep incrementing the occurence of the given letter if it is present in ALPHABET
			if(ALPHABET.indexOf(c) != -1){
				frequencies.put(c, frequencies.get(c)+1);
			}

		}

		return frequencies;
	}

	public void showFrequencies(String text){
		Map<Character, Integer> frequencies = run(text);

		for(Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
			System.out.format("Characeter %s has frequency: %s%n", entry.getKey(), entry.getValue());
		}
	}
}