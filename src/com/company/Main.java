package com.company;
import java.util.*;

public class Main {

    public static WordGUI GUI;
    public static TextSorter TextReader;
    public static List<BaseballPlayer> left;
    public static List<BaseballPlayer> right;

    //Goals
    // 1) Create a GUI Object That Extends JFrame
    // 2) Reads input text file and prints it in first column
    // 3) Takes the input and sort it alphabetically and then print it in the second column

    public static void main(String[] args)
{

        GUI        = new WordGUI("Project 2",1000,600);
        TextReader = new TextSorter("words.txt");

        left = TextReader.getWords();

        for (int i = 0; i < left.size() ; i++) {

            BaseballPlayer somePlayer = left.get(i);
            GUI.text1.append(somePlayer.playerNumber +","+ somePlayer.playerLastname  +"," + somePlayer.playerFirstname  +","+ somePlayer.battingAverage + "" +
                    "\n");
        }


        right = TextReader.ordered(left);

        for (int p = 0; p < right.size() ; p++) {
            BaseballPlayer somePlayer = right.get(p );
            GUI.text2.append(somePlayer.playerNumber +","+ somePlayer.playerLastname +"," + somePlayer.playerFirstname  +","+ somePlayer.battingAverage + "" +
                    "\n");

        }


    }

}