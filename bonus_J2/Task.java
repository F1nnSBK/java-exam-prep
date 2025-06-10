public class Task {
    
    public static void main(String[] args) {
        MovieAnalytics data = DataProvider.getSampleData();
        System.out.println(data.getActorWithMostDiverseGenres().toString());
    }

}
