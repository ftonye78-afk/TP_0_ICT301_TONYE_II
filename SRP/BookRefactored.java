package ict301.solid.srp;

public class BookRefactored {
    private String title, author, text;
    public String getTitle() { return title; }
    public String getText() { return text; }
}

class BookPrinter {
    public void print(BookRefactored book) {
        System.out.println(book.getText());
    }
}

class BookPersistence {
    public void save(BookRefactored book) {
        // code pour sauvegarder dans un fichier ou BD
    }
}
