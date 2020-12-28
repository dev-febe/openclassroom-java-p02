package com.hemebiotech.analytics.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Anything that will write symptom data into a source file
 */
public class WriteSymptomDataFile implements ISymptomWriter {
    @Override
    public void writeSymptomData(String filename, Map<String, Integer> symptoms) throws IOException {
        FileWriter writer = new FileWriter(filename);
        symptoms.forEach((name, count) -> {
            System.out.println("Item : " + name + " Count : " + count);
            try {
                writer.write(name + " : " + count + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
