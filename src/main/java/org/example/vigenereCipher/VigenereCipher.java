package org.example.vigenereCipher;

// https://brilliant.org/wiki/vigenere-cipher/#:~:text=The%20Vigen%C3%A8re%20cipher%20is%20a,is%20much%20harder%20to%20crack.
public class VigenereCipher {

    private static final String ALPHABET = " ,!.?ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String key = "example secret key";

    public String encrypt(String plainText, String key){
        plainText = plainText.toUpperCase();
        // make the algorithm case-insensitive
        key = key.toUpperCase();
        StringBuilder cipherText = new StringBuilder();
        // keyIndex represents the index for the key
        int keyIndex = 0;

        // all characters in the plainText need to be considered.
        for(int i=0; i<plainText.length(); i++){
            char c = plainText.charAt(i);
            // number of shifts = (index of character in the alphabet + index of the character in the key) % ALPHABET.length()
            int index = Math.floorMod(ALPHABET.indexOf(c)+ALPHABET.indexOf(key.charAt(keyIndex)), ALPHABET.length());

            cipherText.append(ALPHABET.charAt(index));
            // increment the key index because we consider the next letter in the key
            keyIndex++;

            // if the index reaches the end of the key, restart from the beginning
            if(keyIndex == key.length()){
                keyIndex = 0;
            }

        }
        return cipherText.toString();
    }

    public String decrypt(String encryptedText){
        return "";
    }
}
