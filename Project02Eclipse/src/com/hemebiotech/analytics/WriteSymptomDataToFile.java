package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Class that allows writing symptoms and their occurrences to a file.
 */

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to a file containing
	 * symptom strings, one per line
	 */

	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}



	/**
	 * Method that allows writing symptoms and their occurrences to an output file.
	 * @param the Map of symptoms and their occurrence
	 */

	public void writeSymptoms(Map<String, Integer> symptoms) {
		try (FileWriter writer = new FileWriter (filepath)) {
			for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
				String cle = entry.getKey();
				Integer valeur = entry.getValue();

				writer.write(cle+":"+valeur+"\n");
			}
			writer.close();
			System.out.println("Le fichier a été généré avec succès !");

		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
