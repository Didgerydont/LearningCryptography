package org.example.oneTimePad;

public class App {

    public static void main(String[] args) {
        String plainText = "I love cryptography It is awesome and not complicated at all";
        RandomGenerator random = new RandomGenerator();


        int[] key = random.generate(plainText.length());

        OneTimePad algorithm = new OneTimePad();
        String cipher = algorithm.encrypt(plainText, key);

        System.out.println(cipher);
        System.out.println(algorithm.decrypt(cipher, key));
    }
}
