package com.company;

public class PlayingCat {
    public static boolean isCatPlaying(boolean isSummer, int temperature){

        boolean isCatPlaying = false;

        if(!isSummer){
            if(temperature >= 25 && temperature <= 35){
                isCatPlaying = true;
            }
        } else {
            if(temperature >= 25 && temperature <= 45) {
                isCatPlaying = true;
            }
        }

        return isCatPlaying;
    }
}
