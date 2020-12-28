package com.hemebiotech.analytics.utils;

import java.io.IOException;
import java.util.Map;

/**
 * Anything that will write symptom data into a source file
 */
public interface ISymptomWriter {
    /**
     * Write symptom data inside a file
     */
    public void writeSymptomData (String filename, Map<String, Integer> symptoms) throws IOException;
}
