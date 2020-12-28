package com.hemebiotech.analytics.models;

import java.util.Hashtable;

public class Symptom {
    private String name;
    private int count = 0;
    private final static Hashtable<String, Integer> symptomsOccurrence = new Hashtable<>();

    public Symptom(String name) {
        this.name = name;
        this.addSymptomOccurrence(name);
    }


    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addSymptomOccurrence(String name) {
        int previous = symptomsOccurrence.get(name) != null
                ? symptomsOccurrence.get(name) : 0;

        setCount(previous + 1);

        symptomsOccurrence.put(name, getCount());
    }

    public static Hashtable<String, Integer> getSymptomsOccurrence() {
        return  symptomsOccurrence;
    }
}
