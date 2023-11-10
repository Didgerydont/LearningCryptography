package org.example;

public class CaesarCipherApp{
	public static void main(String[] args){

		// Random piece of text taken from the interwebs
		String text = "Compiling a Java program. A compiler is an application that translates programs from the Java language to a language more suitable for executing on the computer. It takes a text file with the .java extension as input (your program) and produces a file with a .class extension (the computer-language version). To compile HelloWorld.java type the boldfaced text below at the terminal. (We use the % symbol to denote the command prompt, but it may appear different depending on your system.)";
		System.out.println("Plain text input : " + text + "\n");
		// create new CaesarCipher object.
		CaesarCipher cipher = new CaesarCipher();

		// Test Encrypt/Decrypt

		// text == plainText arg, 3 == key arg
		String cipherText = cipher.encrypt(text, 3);
		// print encrypted text
		System.out.println("Text after encryption with key 3: " + cipherText + "\n");
		// print decrypted text
		System.out.println("Text after decryption : " + cipher.decrypt(cipherText, 3)+ "\n");


		// Test BruteForce Crack
		CaesarCipherBruteForce cracker = new CaesarCipherBruteForce();
		// run the crack with the encrypted text
		cracker.crack("FRPSLOLQJ!D!MDYD!SURJUDP%!D!FRPSLOHU!LV!DQ!DSSOLFDWLRQ!WKDW!WUDQVODWHV!SURJUDPV!IURP!WKH!MDYD!ODQJXDJH!WR!D!ODQJXDJH!PRUH!VXLWDEOH!IRU!H HFXWLQJ!RQ!WKH!FRPSXWHU%!LW!WDNHV!D!WH W!ILOH!ZLWK!WKH!%MDYD!H WHQVLRQ!DV!LQSXW!A.RXU!SURJUDPB!DQG!SURGXFHV!D!ILOH!ZLWK!D!%FODVV!H WHQVLRQ!AWKH!FRPSXWHUCODQJXDJH!YHUVLRQB%!WR!FRPSLOH!KHOORZRUOG%MDYD!W.SH!WKH!EROGIDFHG!WH W!EHORZ!DW!WKH!WHUPLQDO%!AZH!XVH!WKH!-!V.PERO!WR!GHQRWH!WKH!FRPPDQG!SURPSW(!EXW!LW!PD.!DSSHDU!GLIIHUHQW!GHSHQGLQJ!RQ!.RXU!V.VWHP%B");



	}

}