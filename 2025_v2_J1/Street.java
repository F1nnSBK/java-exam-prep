import java.util.ArrayList;
import java.util.Collections;

public class Street {

    public final ArrayList<House> houses;

    public Street(int numberOfHouses) {
        this.houses = new ArrayList<>();

        for (int i = 0; i < numberOfHouses; i++) {
            int houseNumber = i + 1;
            if (houseNumber % 2 == 0) {
                this.houses.add(new House(houseNumber, 5));
            } else {
                this.houses.add(new House(houseNumber, 0, 2000));
            }
        }
    }

    public void rentHouse(Person person) {
        for (House h : houses) {
            try {
                h.rent(person);
            } catch (TooLowBudgetException tl) {
                System.out.println(
                    "Es wird " + tl.missingMoney + " Geld benötigt"
                );
            } catch (NotRentableException nl) {
                System.out.println(
                    "Hausnummer " +
                    h.getNumber() +
                    " kann nicht gemietet werden"
                );
            }
        }
    }

    public boolean rentFlat(Person person) {
        for (House h : houses) {
            for (int i = 0; i < h.flats.size(); i++) {
                Flat f = h.flats.get(0);
                try {
                    f.rent(person);
                    return true;
                } catch (Exception e) {
                    if (e instanceof TooLowBudgetException) {
                        System.out.println(
                            "Zu wenig Geld für Wohnung. Kosten: " + f.fee
                        );
                    }
                    if (e instanceof NotRentableException) {
                        System.out.println(
                            "Wohnung " + (i + 1) + " nicht mietbar"
                        );
                    }
                }
            }
        }
        return false;
    }

    public void sortByFee() {
        Collections.sort(houses, new HouseFeeComparator());
    }

    public void sort() {
        Collections.sort(houses);
    }
}
