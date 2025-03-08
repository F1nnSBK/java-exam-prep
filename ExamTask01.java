public class ExamTask01 {

    public static void main(String[] args) {
        Street street = new Street(20);
        street.sortByFee();

        Flat cheapestFlat = null;
        for (House h : street.houses) {
            for (Flat f : h.flats) {
                if (cheapestFlat == null) {
                    cheapestFlat = f;
                } else if (f.fee < cheapestFlat.fee) {
                    cheapestFlat = f;
                }
            }
        }

        System.out.println(cheapestFlat.fee);
    }
}
