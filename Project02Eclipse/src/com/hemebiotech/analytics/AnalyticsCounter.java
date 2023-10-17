package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



/**
 * Class that reads and analyzes symptoms and counts them.
 */
public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;
	private List<String> symptomsList;
	private Map<String, Integer> symptomsMap;
	


	/**
	 * Constructor with two parameters.
	 * @param reader
	 * @param writer
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}


	/**
	 * Method that reads an array containing all symptoms and then places them
	 * in a Map with each symptom and its occurrence count.
	 * @param list of all symptoms
	 * @return Map of each symptom with its occurrence count
	 */

	public Map<String, Integer> countSymptoms() {
		// Initialiser la Map pour stocker les symptômes et leurs occurrences
		Map<String, Integer> symptomCount = new HashMap<>();
		// Parcourir la liste de symptômes
		for (String symptom : symptomsList) {
			if (symptomCount.containsKey(symptom)) {
				int currentCount = symptomCount.get(symptom);
				symptomCount.put(symptom, currentCount + 1);
			} else {
				// Mettre à jour le compteur d'occurrences pour chaque symptôme
				symptomCount.put(symptom, 1);
			}
		}
		symptomsMap=symptomCount;
		return symptomsMap;

	}

	/**
	 * Method that sorts the Map where symptoms and their occurrence counts are stored
	 * in alphabetical order.
	 * @param the map of symptoms and their occurrence counts
	 * @return the same map sorted in alphabetical order
	 */

	public Map<String, Integer> sortSymptoms() { 

		Map<String, Integer> sortedMap = new TreeMap<>(symptomsMap);

		return sortedMap;

	}

	/**
	 *  Method  that retrieves the list of entries
	 * from the file using the instance of ISymptomReader already
	 * created.
	 * @return a list containing all symptoms
	 */
	
	public List<String> getSymptoms() {
		symptomsList=reader.getSymptoms();
		return symptomsList;
	}
	
	/**
	 *  Method  that writes the result to the
	 * output file using the instance of ISymptomWriter already
	 * created.
	 */
	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}


}
