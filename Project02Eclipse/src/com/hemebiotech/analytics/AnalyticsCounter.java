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
 * Classe qui lit et analyse les symptomes et les compte
 */
public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;


	/**
	 *  Constructeur avec deux paramètres
	 * @param reader
	 * @param writer
	 */
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}


	/**
	 * Methode qui lit un tableau contenant tous les symptomes pour ensuite les placer 
	 * dans une Map avec pour chaque symptome son nombre d'occurence
	 *  @param liste de tous les symptomes
	 *  @return Map de chasue symptome avec son nombre d'occurence
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		// Initialiser la Map pour stocker les symptômes et leurs occurrences
		Map<String, Integer> symptomCount = new HashMap<>();
		// Parcourir la liste de symptômes
		for (String symptom : symptoms) {
			if (symptomCount.containsKey(symptom)) {
				int currentCount = symptomCount.get(symptom);
				symptomCount.put(symptom, currentCount + 1);
			} else {
				// Mettre à jour le compteur d'occurrences pour chaque symptôme
				symptomCount.put(symptom, 1);
			}
		}
		return symptomCount;

	}

	/**
	 * Méthode qui range la Map où sont stockés les symptomes et 
	 * leur nombre d'occurence par ordre alphabetique
	 * @param la map des symptomes et de leur occurence
	 * @return la meme map rangée par odre alphabetique
	 * 
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 

		Map<String, Integer> sortedMap = new TreeMap<>(symptoms);

		return sortedMap;

	}




}
