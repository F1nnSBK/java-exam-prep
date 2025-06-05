public class ExamTask03 {

    public static void main(String[] args) {
        Person lilly = new Person("Lilly", 17, 'f');
        GiftBag giftbag = new GiftBag();

        giftbag.addPresent(
            new Present("Apfel", 5, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 2.5, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 22.5, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 21.5, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 2.111, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 22.5, new Person("Finn", 19, 'm'), lilly)
        );
        giftbag.addPresent(
            new Present("Stein", 242.5, new Person("Finn", 19, 'm'), lilly)
        );

        Present mostExpensive = giftbag.getMostExpensivePresent();
        System.out.println(mostExpensive.toString());
    }
}
