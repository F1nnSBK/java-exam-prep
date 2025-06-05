package optionals_02;

import java.util.Map;
import java.util.Optional;

public record TelephoneBook(Map<Person, TelephoneNumber> entries) {
    
    public void addEntry(Person person, TelephoneNumber telephoneNumber) {
        entries.put(person, telephoneNumber);
    }

    public Optional<TelephoneNumber> getTelephoneNumber(String name) {
        for(Person person : entries.keySet()) {
            if(person.name().equals(name)){
                return Optional.ofNullable(entries.get(person));
            }
        }
        return Optional.empty();
    }

}
