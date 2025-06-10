package Lambdas;

import java.util.List;

public enum Usk {
    ZERO,
    SIX,
    TWELVE,
    SIXTEEN,
    EIGHTEEN;


    public static List<Usk> getChildUsks() {
        return List.of(Usk.ZERO, Usk.SIX);
    }
}