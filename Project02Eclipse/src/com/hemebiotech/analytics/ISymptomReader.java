package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that reads symptom data from a source.
 * The important part is the return value of the operation, which is a list of strings,
 * that may contain many duplicates.
 *
 * The implementation does not need to sort the list.
 */

public interface ISymptomReader {
	/**
	 * If no data is available, return an empty list.
	 *
	 * @return a raw list of all symptoms obtained from a data source,
	 * duplications are possible/probable.
	 */

	List<String> getSymptoms ();
}
