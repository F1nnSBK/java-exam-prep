package maps_01;

import java.util.Map;

public record TelephoneBook(Map<Person, TelephoneNumber> entries) {
    
    public void addEntry(Person person, TelephoneNumber telephoneNumber) {
        entries.put(person, telephoneNumber);
    }

    public TelephoneNumber getTelephoneNumber(String name) {
        for(Person person : entries.keySet()) {
            if(person.name().equals(name)){
                return entries.get(person);
            }
        }
        return null;
    }

}
