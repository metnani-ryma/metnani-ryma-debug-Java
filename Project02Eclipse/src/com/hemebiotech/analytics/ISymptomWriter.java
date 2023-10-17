package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface for writing data to a file from the Map containing symptoms
 * and their respective occurrences.
 */


public interface ISymptomWriter {

	/**
	 * Write symptoms and their occurrences to an output file.
	 * @param the Map of symptoms and their occurrences
	 */

	void writeSymptoms(Map<String, Integer> symptoms) ;

}
