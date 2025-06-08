package streams_02; // Oder das entsprechende Paket

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    // --- FootballClub Instanzen ---
    // Bundesliga-Clubs (mit realen Werten für Beispiel)
    public static final FootballClub BAYERN_MUNICH = new FootballClub("FC Bayern München", 1, 4000);
    public static final FootballClub BORUSSIA_DORTMUND = new FootballClub("Borussia Dortmund", 2, 3500);
    public static final FootballClub VFL_WOLFSBURG = new FootballClub("VfL Wolfsburg", 8, 1500); // Hinzugefügt
    public static final FootballClub RB_LEIPZIG = new FootballClub("RB Leipzig", 12, 800); // Hinzugefügt
    public static final FootballClub EINTRACHT_FRANKFURT = new FootballClub("Eintracht Frankfurt", 7, 1800); // Hinzugefügt

    // Internationale Top-Clubs (werden nicht als "Bundesliga" im Sinne der -1-Regel behandelt,
    // es sei denn, man definiert es explizit anders. Wir halten uns an den -1-Hinweis.)
    public static final FootballClub REAL_MADRID = new FootballClub("Real Madrid CF", -1, -1); // Nicht in Bundesliga, daher -1 Werte
    public static final FootballClub MANCHESTER_UNITED = new FootballClub("Manchester United", -1, -1); // Nicht in Bundesliga, daher -1 Werte
    public static final FootballClub JUVENTUS = new FootballClub("Juventus FC", -1, -1); // Nicht in Bundesliga, daher -1 Werte
    public static final FootballClub FC_BARCELONA = new FootballClub("FC Barcelona", -1, -1); // Nicht in Bundesliga, daher -1 Werte
    public static final FootballClub LIVERPOOL = new FootballClub("Liverpool FC", -1, -1); // Nicht in Bundesliga, daher -1 Werte
    public static final FootballClub ARSENAL = new FootballClub("Arsenal FC", -1, -1); // Nicht in Bundesliga, daher -1 Werte


    // --- Methode zum Abrufen von Footballer-Daten ---
    public static ArrayList<Footballer> getFootballers() {
        return new ArrayList<>(List.of(
            // Stürmer
            new Footballer("Robert Lewandowski", Position.STRIKER, LocalDate.of(1988, 8, 21), 185, BAYERN_MUNICH, 600, 450),
            new Footballer("Erling Haaland", Position.STRIKER, LocalDate.of(2000, 7, 21), 194, BORUSSIA_DORTMUND, 200, 180),
            new Footballer("Karim Benzema", Position.STRIKER, LocalDate.of(1987, 12, 19), 185, REAL_MADRID, 700, 380),
            new Footballer("Mohamed Salah", Position.STRIKER, LocalDate.of(1992, 6, 15), 175, LIVERPOOL, 450, 250),
            // Kleiner Spieler mit Toren für die isFootballerWithSizeInCmLT170AndNumbreOfGoalsBT0() Aufgabe
            new Footballer("Lionel Messi", Position.STRIKER, LocalDate.of(1987, 6, 24), 170, FC_BARCELONA, 900, 850), // Genau 170cm, keine Übung, aber gut zu haben
            new Footballer("Mathieu Valbuena", Position.MIDFIELDER, LocalDate.of(1984, 9, 28), 167, ARSENAL, 500, 80), // Beispiel für <170cm und Tore

            // Mittelfeldspieler
            new Footballer("Toni Kroos", Position.MIDFIELDER, LocalDate.of(1990, 1, 4), 183, REAL_MADRID, 650, 80),
            new Footballer("Joshua Kimmich", Position.MIDFIELDER, LocalDate.of(1995, 2, 8), 177, BAYERN_MUNICH, 350, 50),
            new Footballer("Bruno Fernandes", Position.MIDFIELDER, LocalDate.of(1994, 9, 8), 179, MANCHESTER_UNITED, 300, 100),
            new Footballer("Frenkie de Jong", Position.MIDFIELDER, LocalDate.of(1997, 5, 12), 180, FC_BARCELONA, 280, 30),
            // Spieler für VfL Wolfsburg Aufgabe
            new Footballer("Maximilian Arnold", Position.MIDFIELDER, LocalDate.of(1994, 5, 27), 184, VFL_WOLFSBURG, 350, 40),
            new Footballer("Lovro Majer", Position.MIDFIELDER, LocalDate.of(1998, 8, 17), 178, VFL_WOLFSBURG, 200, 25), // Weniger Spiele
            new Footballer("Xaver Schlager", Position.MIDFIELDER, LocalDate.of(1997, 9, 28), 174, RB_LEIPZIG, 220, 15),

            // Verteidiger
            new Footballer("Sergio Ramos", Position.DEFENDER, LocalDate.of(1986, 3, 30), 184, REAL_MADRID, 750, 100),
            new Footballer("Matthijs de Ligt", Position.DEFENDER, LocalDate.of(1999, 8, 11), 189, BAYERN_MUNICH, 250, 20),
            new Footballer("Virgil van Dijk", Position.DEFENDER, LocalDate.of(1991, 7, 8), 193, LIVERPOOL, 400, 35),
            new Footballer("Ronald Araújo", Position.DEFENDER, LocalDate.of(1999, 3, 7), 188, FC_BARCELONA, 150, 10),
            new Footballer("Maxence Lacroix", Position.DEFENDER, LocalDate.of(2000, 4, 6), 190, VFL_WOLFSBURG, 180, 5), // Für VfL Wolfsburg

            // Torhüter
            new Footballer("Manuel Neuer", Position.GOALKEEPER, LocalDate.of(1986, 3, 27), 193, BAYERN_MUNICH, 700, 0),
            new Footballer("Koen Casteels", Position.GOALKEEPER, LocalDate.of(1992, 6, 25), 196, VFL_WOLFSBURG, 300, 0), // Für VfL Wolfsburg
            new Footballer("Alisson Becker", Position.GOALKEEPER, LocalDate.of(1992, 10, 2), 191, LIVERPOOL, 300, 0),
            new Footballer("Bernd Leno", Position.GOALKEEPER, LocalDate.of(1992, 3, 4), 190, ARSENAL, 450, 0) // Kleiner Torwart für <170cm Test, aber hat 0 Tore
        ));
    }
}