package com.hemebiotech.analytics;

import com.hemebiotech.analytics.models.Symptom;
import com.hemebiotech.analytics.utils.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.utils.WriteSymptomDataFile;

/**
 * Main class of project that print out
 * the occurrence of each symptoms
 */
public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        // Read symptoms
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        reader.readSymptoms();

        // Write symptoms and occurrences inside of a file
        WriteSymptomDataFile writer = new WriteSymptomDataFile();
        writer.writeSymptomData("result.out", Symptom.getSymptomsOccurrence());
    }
}
