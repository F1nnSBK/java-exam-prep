package generics_04;

import java.util.List;

public record Tournament(String title, List<Club> clubs, List<Pair<Club>> pairs) {
    
    public void addClub(Club club) {
        clubs.add(club);
    }

    public List<Pair<Club>> pairs() {
        for (int i = 0; i < clubs.size(); i++) {
            for (int j = 0; j < clubs.size(); j++) {
                if (i != j) {
                pairs.add(new Pair<Club>(clubs.get(i), clubs.get(j)));
                }
            }
        }
        return pairs;
    }

}
