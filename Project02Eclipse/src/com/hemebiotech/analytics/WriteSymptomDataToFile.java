package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}
	
	
	@Override
	 public void writeSymptoms(Map<String, Integer> symptoms) {
		 try (FileWriter writer = new FileWriter ("filepath")) {
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
