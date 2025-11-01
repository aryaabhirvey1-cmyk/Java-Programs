class Book{
    String book;
    int id;
    String author;

    //creating constructor
    Book(String book , int id , String author){
        this.book = book;
        this.id = id;
        this.author = author;
    }

    void display() {
        System.out.println("Book Name: " + book);
        System.out.println("Book ID: " + id);
        System.out.println("Book Author: " + author);
        System.out.println("-------------------------------------");
    }

    //creating method to enter values
    void display(String book, int id){
        System.out.println(" ");
        System.out.println("BOOK NAME IS: "+book );
        System.out.println("BOOK ID IS: "+id );

        System.out.println("----------------------------------------------------"); 
    }

    void display(int id){
        System.out.println(" ");
        System.out.println("BOOK ID IS: "+id );
        System.out.println("----------------------------------------------------");
    }

    void display( int id,String author){
        System.out.println(" ");
        System.out.println("BOOK ID IS: " + id );
        System.out.println("BOOK AUTHOR IS: " + author);
        System.out.println("----------------------------------------------------");
    }
}

//MAIN METHOD ------------------------------------------------------------------
public class MethodOverloading{
    public static void main(String[] args){
        Book b1 = new Book("EGO IS THE ENEMY" , 99,"Greg aurthor");
        b1.display("EGO IS THE ENEMY" , 99);
        b1.display(99);
        b1.display(99,"Greg aurthor");

    }
}