package com.company;

import java.util.*;
/**
 * Created by briannuesi on 3/6/15.
 */
public class TextSorter {


    public TextFileInput reader;

    public TextSorter(String textFileLocation){

        reader = new TextFileInput(textFileLocation);


    }


    public List<BaseballPlayer> getWords() {

        String currentLine;
        List<BaseballPlayer> words = new ArrayList<BaseballPlayer>();

        while ((currentLine = reader.readLine()) != null) {

            String[] x  = currentLine.split(",");

            for(int c = 0; c < 1; c++) {
                BaseballPlayer P = new BaseballPlayer(x[0],x[3],x[1],x[2]);
                words.add(P);
            }
        }
        return words;
    }


    public List<BaseballPlayer> ordered(List<BaseballPlayer> currentColumn){

        Collections.sort(currentColumn);
        return currentColumn;

    }
}

