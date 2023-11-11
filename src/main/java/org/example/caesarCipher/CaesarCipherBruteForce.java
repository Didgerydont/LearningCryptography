package org.example.caesarCipher;// crack the CaesarCipher using the brute force method

import org.example.languageDetection.LanguageDetector;

public class CaesarCipherBruteForce {

	private String ALPHABET = " .,!%()-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private LanguageDetector languageDetector = new LanguageDetector();

	public void crack(String cipherText){
		// try all of the possible key values using the length of ALPHABET
		for(int key=0; key<ALPHABET.length(); key++){
			String plainText = "";

			for(int i=0; i<cipherText.length();i++){
				char character = cipherText.charAt(i);
				int charIndex = ALPHABET.indexOf(character);
				int decryptedIndex = Math.floorMod(charIndex-key, ALPHABET.length());
				plainText += ALPHABET.charAt(decryptedIndex);
			}

			// print the actual decrypted string with the given key
			//System.out.format("Cracking the Caesar-cipher with %s key the result is: %s%n", key, plainText +"\n");

			// use languageDetector to determine the language and print the key
			if(languageDetector.isEnglish(plainText)){
				System.out.format("Caesar-cipher cracked successfully with key: %s. The cipher is English. The result is: %s%n", key, plainText);
			}

		}
	}

}