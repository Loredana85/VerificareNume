import java.util.ArrayList;

public class LibrarySystem {
     private ArrayList<Librarian> librarianList;
    private ArrayList<Books> booksList;
    private ArrayList<Customers> customersList;
    private int numberBooks;
    private int numarAngajati;
   private int numarCartiImprumutate;

    public LibrarySystem (ArrayList<Librarian> librarianList,ArrayList<Books> booksList, ArrayList<Customers> customersList,int numberBooks,int numarAngajati,int numarCartiImprumutate) {

        this.librarianList = librarianList;
        this.booksList = booksList;
        this.customersList = customersList;
        this.numberBooks = numberBooks;
        this.numarAngajati = numarAngajati;
        this.numarCartiImprumutate = numarCartiImprumutate;
    }

    public LibrarySystem(Librarian librarian,Books book,Customers customer){
        this.librarianList.add(librarian);
        this.booksList.add(book);
        this.customersList.add(customer);

    }
}

