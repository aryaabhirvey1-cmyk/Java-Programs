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

    //constructor overloading - book , author 
    Book(String book ,String author){
        this.book = book;
        this.id = 0;
        this.author = author;
    }

    //constructor overloading - id , author
    Book(int id,String author){
        this.book = null;
        this.id = id;
        this.author = author;
    }

    //constructor overloading - id , name
    Book(String name , int id){
        this.book = name;
        this.id = id;
        this.author = author;
    }
    

    //creating method to enter values
    void display(){
        System.out.println(" ");
        System.out.println("BOOK NAME IS: "+book );
        System.out.println("BOOK ID IS: "+id );
        System.out.println("BOOK AUTHOR IS: "+author);
        System.out.println("----------------------------------------------------");
    }
}

//MAIN METHOD ------------------------------------------------------------------
public class SimpleClass{
    public static void main(String[] args){
        Book b1 = new Book("EGO IS THE ENEMY",93,"RYAN REYNOLDS");
        b1.display();

        Book b2 = new Book("HEALTHY HABITS","REKHA");
        b2.display();

        Book b3 = new Book(21,"JAMES CLEAR");
        b3.display();

        Book b4 = new Book("ATOMIC HABITS",22);
        b4.display();
    }
}