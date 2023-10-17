package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that reads the symptom file.
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * 
     * @param filepath a full or partial path to a file containing symptom strings, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * Method that reads the file containing symptoms and
     * returns a list of strings containing these symptoms.
     * @return a list containing all symptoms
     */

    public List<String> getSymptoms() {
        ArrayList<String> result = new ArrayList<String>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}





