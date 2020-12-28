package com.hemebiotech.analytics.utils;

import com.hemebiotech.analytics.models.Symptom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Symptom reader implementation
 * Anything that will read symptom data from a source
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private final String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void readSymptoms() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        if (filepath != null) {
            try {
                fileReader = new FileReader(filepath);
                bufferedReader = new BufferedReader(fileReader);

                String line = bufferedReader.readLine();
                while (line != null) {
                    new Symptom(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            } finally {
                try {
                    if (bufferedReader != null)
                        bufferedReader.close();
                    if (fileReader != null)
                        fileReader.close();
                } catch (IOException ex) {
                    System.err.format("IOException: %s%n", ex);
                }
            }
        }
    }

}
