package maps_01;

import java.util.HashMap;

public class Example {
    
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook(new HashMap<>());

        telephoneBook.addEntry(new Person("Rainer"), new TelephoneNumber("53275032"));
        telephoneBook.addEntry(new Person("Steffen"), new TelephoneNumber("423523523"));
        telephoneBook.addEntry(new Person("Mario"), new TelephoneNumber("9475376436"));
        telephoneBook.addEntry(new Person("Andreas"), new TelephoneNumber("798473537"));

        System.out.println(telephoneBook.getTelephoneNumber("Mario").value());
    }
}
