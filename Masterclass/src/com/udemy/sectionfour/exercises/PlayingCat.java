package com.udemy.sectionfour.exercises;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
//        return temperature >= 25 && (temperature <= 45 && summer || temperature <= 35);
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }

    //  summer  temp35  temp45  result
    //  true    ----    true    ----
    //  true    ----    false   ----
    //  false   true    ----    true
    //  false   false   ----    false
}
