package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kombucha {

//    private String kombuchaAppleReview;
//    private String kombuchaGrapeReview;
    private String kombuchaReview;
    private String kombuchaFlavor;
    private static ArrayList<Kombucha> instance = new ArrayList<>();
//    private static ArrayList<Kombucha> grape = new ArrayList<>();

    public Kombucha(String kombuchaReview, String kombuchaFlavor) {
            this.kombuchaReview = kombuchaReview;
            this.kombuchaFlavor = kombuchaFlavor;
            instance.add(this);
    }

    public static ArrayList<Kombucha> getAllApple() {
        return instance;
    }

    public static ArrayList<Kombucha> getAllGrape() {
        return instance;
    }

    public String getKombuchaReview() {
        return kombuchaReview;
    }

    public String getKombuchaFlavor() {
        return kombuchaFlavor;
    }


    //apples

    public String getApples() {
        return kombuchaReview;
    }

    public String getReview() {
        return kombuchaReview;
    }
}
