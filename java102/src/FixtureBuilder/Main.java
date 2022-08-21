package FixtureBuilder;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        FixtureBuilder fb = new FixtureBuilder();
        fb.addTeam("Galatasaray");
        fb.addTeam("Bursaspor");
        fb.addTeam("Fenerbahce");
        fb.addTeam("Besiktas");
        fb.addTeam("Basaksehir");
        fb.addTeam("Trabzonspor");

        fb.getFixture();

    }
}
