public class HouseFeeComparator implements Comparator<House> {

    public int compare(House h1, House h2) {
        if (h1.fee > h2.fee) {
            return 1;
        } else if (h1.fee < h2.fee) {
            return -1;
        } else {
            return 0;
        }
    }
}
