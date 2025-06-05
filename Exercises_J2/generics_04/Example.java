package generics_04;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {

        ArrayList<Club> clubs = new ArrayList<>();
        clubs.add(new Club("SC Freiburg", 50));
        clubs.add(new Club("Borussia Dortmund", 50));
        clubs.add(new Club("Bayern Muenchen", 50));
        clubs.add(new Club("SV Haslach", 1));

        Tournament tournament = new Tournament("Rookie Cup", clubs, new ArrayList<>());

        tournament.pairs().forEach(System.out::println);
    }
}
