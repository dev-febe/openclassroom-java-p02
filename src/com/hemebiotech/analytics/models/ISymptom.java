package com.hemebiotech.analytics.models;

// A supprimer
public interface ISymptom {
    /**
     * @return the name of a symptom
     */
    public String getName();

    /**
     * @return the count of a symptom
     */
    public int getCount();

    /**
     * @param name, the symptom name
     */
    public void setName(String name);

    /**
     * @param count, the symptom count
     */
    public void setCount(int count);

    /**
     * This function consist to add occurrence to each symptom
     *
     * @param name symptom name
     */
    public void addSymptomOccurrence(String name);
}
