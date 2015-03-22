package com.company;

public class BaseballPlayer implements Comparable<BaseballPlayer> {

    int playerNumber;
    String playerLastname;
    String playerFirstname;
    float battingAverage;

    public BaseballPlayer(String number, String average, String playerLastname, String playerFirstname) {
        float avg     = Float.parseFloat(average);
        int   num     = Integer.parseInt(number);
        if (!isOk(avg, num)) {
            throw new IllegalArgumentException("this cannot be true");
        }
        this.playerLastname  = playerLastname;
        this.playerFirstname = playerFirstname;
        this.playerNumber    = num;
        this.battingAverage  = avg;

    }

    public static boolean isOk(float average, int number) {

        if (number < 0 || number > 100) {
            System.out.println("fail 1");
            return false;
        } else if (average > 1.0f || average  < 0.0f) {
            System.out.println("fail 2");
            return false;
        }
        return true;
    }

    public int compareTo(BaseballPlayer somePlayer){
       return  this.playerLastname.toLowerCase().compareTo(somePlayer.playerLastname.toLowerCase());
    }
}

