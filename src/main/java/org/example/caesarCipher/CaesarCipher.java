package org.example.caesarCipher;

public class CaesarCipher{

	// 26 Characters in Alphabet + WhiteSpace + some special characters.
	private String ALPHABET = " .,!%()-ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// encrypt function
	public String encrypt(String plainText, int key){
		String cipherText = "";
		// make the algorithm case insensitive
		plainText = plainText.toUpperCase();

		// consider all the letters in plainText
		for(int i=0; i<plainText.length(); i++){
			char character = plainText.charAt(i);
			// find the numerial representation (index) associated with that character in the alphabet
			int charIndex = ALPHABET.indexOf(character);
			// caesar encrytpion is just a simple shift of characters according to the key
			// use of mod arithmetic to transform the values within the range
			// [0, num_of_letters_in_alphabet]
			int encryptedIndex = (charIndex+key) % ALPHABET.length();
			// keep appending the encrypted character to the cipherText
			cipherText += ALPHABET.charAt(encryptedIndex);
		}

		return cipherText;
	}

	// decrypt function
	public String decrypt(String cipherText, int key){
		// the input cipherText is already upper case from the previous function
		String plainText = "";

		for(int i=0; i<cipherText.length(); ++i){
			char character = cipherText.charAt(i);
			int charIndex = ALPHABET.indexOf(character);
			// Math.floorMod has to be used to keep the lowest value as 0. Otherwise the program will throw index out of bounds.
			int decryptedIndex = Math.floorMod(charIndex-key, ALPHABET.length());
			plainText += ALPHABET.charAt(decryptedIndex);
		}

		return plainText;

	}

}