package com.solid.SRP.model;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;


    public void addEntry(String text)
    {
        this.entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index)
    {
        this.entries.remove(index);
        count--;
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}
