package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface permettant d'ecrire dans un fichier les données contenues dans 
 * la Map contentnat les symptomes et leur occurences respectives
 */

public interface ISymptomWriter {

	/**
	 * 
	 * ecrire les symptomes et leur occurences dans un fichier en sortie
	 * @param la Map des symptomes et leur occurence
	 */
	void writeSymptoms(Map<String, Integer> symptoms) ;

}
