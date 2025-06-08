package streams_02;

public class Example {
    public static void main(String[] args) {
        FootballerQueries queries = new FootballerQueries(DataProvider.getFootballers());

        System.out.println(queries.getTotalOfAllGoalsByMidfielders());
    }
}
