package org.example.languageDetection;

import java.util.List;

public class LanguageDetector {

    private FileProcessor fileProcessor;
    // store the english words in ArrayList
    private List<String> englishWords;
    public LanguageDetector(){
        this.fileProcessor = new FileProcessor();
        this.englishWords = fileProcessor.getWords();
    }

    // count the number of English words into a given text
    public int countEnglishWordsInText(String text){
        // upper case letters are needed
        text = text.toUpperCase();

        // transform the text into a list of words (delimited by white space)
        String[] words = text.split(" ");
        int matches = 0;
        for(String s: words)
            if(englishWords.contains(s))
                matches++;

        return matches;

    }

    public boolean isEnglish(String text){
        // number of English words in the given text
        int numEnglishWords = countEnglishWordsInText(text);

        // assume that if 80% of the words match words in the text match
        // words from EnglishWords.txt that the text is in English

        if((float) numEnglishWords / text.split("\\s+").length * 100 >= 80){
            return true;
        }

        return false;
    }
}
