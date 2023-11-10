package org.example;// crack the CaesarCipher using the brute force method

public class CaesarCipherBruteForce {

	private String ALPHABET = " .,!%()-ABCDEFGHIJKLMNOPQRSTUVWXYZ";

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
			System.out.format("Cracking the Caesar-cipher with %s key the result is: %s%n", key, plainText +"\n");
		}
	}

}