import java.util.ArrayList;

public class Customers {
     private int varsta;
     private ArrayList<Books> booksList;
     private String nume;
     private  String email;
     private String telefon;
     private String adresa;
     private String penalizari;

     public Customers (int varsta, ArrayList<Books> booksList,String nume,String email,String telefon,String adresa,String penalizari){
        this.varsta=varsta;
        this.booksList=booksList;
        this.nume=nume;
        this.email=email;
        this.telefon=telefon;
        this.adresa=adresa;
        this.penalizari=penalizari;
        

    }
}
