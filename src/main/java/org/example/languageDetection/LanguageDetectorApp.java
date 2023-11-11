package org.example.languageDetection;

public class LanguageDetectorApp {

    public static void main(String[] args){
        // experiment sentances
        String englishText = "The curious cat quietly observed the bustling street from her cozy perch by the sunlit window, tail twitching contentedly.";
        String spanishText = "La curiosa gata observaba tranquilamente la calle bulliciosa desde su acogedor rincón junto a la ventana soleada, moviendo la cola contenta.";

        LanguageDetector languageDetector = new LanguageDetector();
        System.out.println("Test English Language Detector with English text: " + languageDetector.isEnglish(englishText));
        System.out.println("Test English Language Detector with Spanish text: " + languageDetector.isEnglish(spanishText));


    }
}
