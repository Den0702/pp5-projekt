package util;

import java.util.Random;

public class IdGenerator {

    private static Random random = new Random();

    public static Long getnextAvailLongId(){
        return random.nextLong();
    }
}
