package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Main class that allows launching the program.
 */

public class Main {





	public static void main(String args[]) throws Exception {
		// The path of the input file for symptom data
		String  inPath = "Project02Eclipse/symptoms.txt";
		// The path of the output file for symptoms with their occurrences
		String  outPath = "Project02Eclipse/result.out";	
		// Instantiation of a reader object
		ISymptomReader reader = new ReadSymptomDataFromFile(inPath); 
		// Instantiation of a  writer object
		ISymptomWriter writer = new WriteSymptomDataToFile(outPath); 
		// Instantiation of a AnalyticsCounter object
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer);
		// Creating the list of symptoms
		analyticsCounter.getSymptoms();
		// Creating the map of symptoms
		Map<String, Integer> symptomsMap = analyticsCounter.countSymptoms();
		// Sorting the map
		symptomsMap = analyticsCounter.sortSymptoms();
		// Creating the output file
		analyticsCounter.writeSymptoms(symptomsMap);






	}

}
