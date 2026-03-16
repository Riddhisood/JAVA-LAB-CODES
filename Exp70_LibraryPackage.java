class Library {

    void showBooks() {
        System.out.println("Books available in library");
    }
}

public class Exp70_LibraryPackage {

    public static void main(String[] args) {

        Library l = new Library();
        l.showBooks();
    }
}