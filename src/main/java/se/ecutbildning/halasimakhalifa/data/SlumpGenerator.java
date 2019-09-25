package se.ecutbildning.halasimakhalifa.data;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SlumpGenerator {
    static Random random = new Random();
    //static ThreadLocalRandom localRandom = new ThreadLocalRandom();

    public int getNumber(int n){
        int number = random.nextInt(n);
        return number;
    }
}
