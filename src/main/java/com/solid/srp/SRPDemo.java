package com.solid.srp;

import com.solid.model.Journal;

import java.io.IOException;

public class SRPDemo {

    public static void main(String[] args) throws IOException {

        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");

        System.out.println(journal);

        Persistence persistence = new Persistence();
        persistence.saveToFile(journal, "temp/test2.txt", false);
    }

}
