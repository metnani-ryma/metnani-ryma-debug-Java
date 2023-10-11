package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Class main qui permet de lire un fichier contenant les symptomes et qui 
 * retourne un fichier contenant les symptomes rangé par ordre alphabetique avc pour chaque ligne
 * le symptome et son nombre d'occurences
 */
public class Main {





	public static void main(String args[]) throws Exception {
		//le path du fichier de donnes de symptomes en entree
		String  path = "Project02Eclipse/symptoms.txt";
		//le path du fichier de symptomes en sortie avec les occurences
		String  sortie = "Project02Eclipse/result.out";	
		//instanciation d'un objet reader
		ISymptomReader reader = new ReadSymptomDataFromFile(path); 
		//instanciation d'un objet writer
		ISymptomWriter writer = new WriteSymptomDataToFile(sortie); 
		// Instanciation d'un objet AnalyticsCounter
		AnalyticsCounter counter = new AnalyticsCounter(reader, writer);
		//creation de la liste des symptomes
		List<String> liste=reader.GetSymptoms();
		//creation de la map des symptomes
		Map<String, Integer> mape= counter.countSymptoms(liste);
		//ordonnancement de la map
		mape=counter.sortSymptoms(mape);
		//creation du fichier de sortie
		writer.writeSymptoms(mape);





	}

}
