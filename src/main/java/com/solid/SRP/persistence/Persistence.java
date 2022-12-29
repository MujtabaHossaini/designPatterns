package com.solid.SRP.persistence;

import com.solid.SRP.model.Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws IOException {
        if(overwrite && new File(fileName).exists()) {
            this.writeToFile(fileName, journal.toString());
        }
        else {
            File file = new File(fileName);
            file.getParentFile().mkdirs();
            if(file.exists() || file.createNewFile()) {
                this.writeToFile(fileName, journal.toString());
            }
        }
    }

    public Journal loadJournal(String fileName) {return null;}
    public Journal loadJournal(URL fileUrl) {return null;}

    private void writeToFile(String fileName, String value) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(fileName)){
            out.println(value);
        }
    }

}
