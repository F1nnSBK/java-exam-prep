import java.util.ArrayList;

public class Street {

    public final ArrayList<House> houses;

    punlic Street(int numberOfHouses) {
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
        for (House h : this.houses) {
            try {
                h.rent(person);
                break;
            } catch (Exception e) {
                if (e instanceof TooLowBudgetException l) {
                    System.out.println(
                        "Es wird " + l.missingMoney + " mehr Geld gebraucht"
                    );
                } else if (e instanceof NotRentableException n) {
                    System.out.println(
                        "Die Hausnummer " +
                        h.number +
                        "kann nicht gemietet werden"
                    );
                }
            }
        }
    }

    public boolean rentFlat(Person person) {
        for (House h : this.houses) {
            for (int i = 0; i < h.flats.size(); i++) {
                Flat f = h.flats.get(i);
                try {
                    f.rent(person);
                    return true;
                } catch (TooLowBudgetException l) {
                    System.out.println(
                        "Zu wenig Geld für Wohnung. Gebühr: " + f.fee
                    );
                } catch (NotRentableException n) {
                    System.out.println("Wohnung " + i + 1 + " nicht mietbar");
                }
            }
        }
        return false;
    }

    public void sortByFee() {
        Collections.sort(this.houses, new HouseFeeComparator());
    }

    public void sort() {
        Collections.sort(this.houses);
    }
}
