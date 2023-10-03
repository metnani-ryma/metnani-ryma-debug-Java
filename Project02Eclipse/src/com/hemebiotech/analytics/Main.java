package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
	
	
	
	

public static void main(String args[]) throws Exception {

 String  path = "Project02Eclipse/symptoms.txt";
 String  sortie = "Project02Eclipse/result.out";
 
	
ISymptomReader reader = new ReadSymptomDataFromFile(path); 

ISymptomWriter writer = new WriteSymptomDataToFile(sortie); 
// Instanciation d'un objet AnalyticsCounter
AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
   
	
		List<String> liste=reader.GetSymptoms();
		
		Map<String, Integer> mape= counter.countSymptoms(liste);
		mape=counter.sortSymptoms(mape);
		writer.writeSymptoms(mape);
	
		


		
	}

}
