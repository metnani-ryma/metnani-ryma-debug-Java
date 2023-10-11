package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Class qui permet d'ecrire dans un fichier les symptomes et leur occurences
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;
	/**
	 * 
	 * @param filepath un chemin complet ou partiel vers un fichier contenant 
	 * des chaînes de symptômes, une par ligne
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}



	/**
	 * 
	 * Methode qui permet d'ecrire les symptomes et leur occurences dans un fichier en sortie
	 * @param la Map des symptomes et leur occurence
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
