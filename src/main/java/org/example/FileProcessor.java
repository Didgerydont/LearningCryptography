package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// used to process file containing all English words for EnglishLanguageDetector
public class FileProcessor {

    private List<String> words;

    public FileProcessor() {
        this.words = new ArrayList<>();
        getData();
    }

    private void getData() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(new File("src/main/resources/EnglishWords.txt"));
            bufferedReader = new BufferedReader(fileReader);

            String line = "";

            while((line=bufferedReader.readLine()) != null){
                words.add(line.toUpperCase());
                System.out.println(line);
            }

            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public List<String> getWords() {
        return this.words;
    }


}
