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

public class AnalyticsCounter {
	
	private ISymptomReader reader;
    private ISymptomWriter writer;
	
 // Constructeur avec deux paramètres
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
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

    
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) { 
    	
    	Map<String, Integer> sortedMap = new TreeMap<>(symptoms);
    	
    	return sortedMap;
    	
    }
    
    
    
	
}
