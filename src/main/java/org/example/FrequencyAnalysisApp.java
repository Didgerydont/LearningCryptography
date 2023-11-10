package org.example;

public class FrequencyAnalysisApp {

	public static void main(String[] args){
		String text = "My name is Billy and I love software";

		FrequencyAnalysis analysis = new FrequencyAnalysis();

		analysis.showFrequencies(text);
	}
}