package streams_01;

public class Example {
    public static void main(String[] args) {
        ConsoleQueries queries = new ConsoleQueries(DataProvider.getConsoles());

        System.out.println(queries.getTotalSoldUnitsInMillions());
    }
}
