package optionals_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.HashMap;


public record BookCollection(HashMap<Author, List<Book>> collection) {

    public void addAuthor(Author author) throws DuplicateKeyException {
        if (collection.containsKey(author)) {
        throw new DuplicateKeyException();
        }

        collection.put(author, new ArrayList<>());
    }
    
    public void addBook(Author author, Book book) {
        collection.get(author).add(book);
    }

    public Optional<Book> getBookByTitle(String title) {
        for (List<Book> books : collection.values()) {
        for (Book b : books) {
            if (b.title().equals(title)) {
            return Optional.ofNullable(b);
            }
        }
        }
        return null;
    }
    
    public Optional<Author> getMostDiligentAuthor() {
        Author mostDiligentAuthor = null;
        int mostBooks = 0;
        for(java.util.Map.Entry<Author, List<Book>> entry : collection.entrySet()) {
            if (entry.getValue().size() > mostBooks) {
                mostDiligentAuthor = entry.getKey();
                mostBooks = entry.getValue().size();
            }
        }
        return Optional.of(mostDiligentAuthor);
    }
}
