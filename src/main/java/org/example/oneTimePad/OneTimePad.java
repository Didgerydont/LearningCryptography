package org.example.oneTimePad;

public class OneTimePad {

    public String encrypt(String plainText, int[] key){
        // make the algorithm case sensitive
        plainText = plainText.toUpperCase();
        String cipherText = "";

        // consider all of the letters in the plaintext
        for(int i=0; i<plainText.length();++i){
            // the formula is quite simple because the numOfLettersInPlainText == numOfRandNums
            int keyIndex = key[i];
            int characterIndex = Constants.ALPHABET.indexOf(plainText.charAt(i));

            // encryptedLetter = (characterIndex + randomShiftIndex) mod 27
            cipherText += Constants.ALPHABET.charAt(Math.floorMod(
                    characterIndex + keyIndex, Constants.ALPHABET.length()));
        }

        return cipherText;

    }

    public String decrypt(String cipherText, int[] key){
        cipherText = cipherText.toUpperCase();
        String plainText = "";

        for(int i=0; i<cipherText.length(); ++i) {
            int keyIndex = key[i];
            int characterIndex = Constants.ALPHABET.indexOf(cipherText.charAt(i));

            plainText += Constants.ALPHABET.charAt(Math.floorMod(
                    characterIndex - keyIndex, Constants.ALPHABET.length()));

        }
        return plainText;
    }
}
