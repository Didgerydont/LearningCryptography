package org.example.vigenereCipher;

public class VigenereCipherApp {

    public static void main(String[] args){
        VigenereCipher cipher = new VigenereCipher();
        String plainText = "Cryptography is very important";
        String key = "banana";
        String cipherText = cipher.encrypt(plainText, key);

        System.out.println("Text to be encrypted: " + plainText);
        System.out.println("Key: " + key);

        System.out.println("\nText after encryption: " + cipherText);
        System.out.println("Text after decryption: " + cipher.decrypt(cipherText, key));

    }


}
