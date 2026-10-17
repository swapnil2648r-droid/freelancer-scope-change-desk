import java.util.Scanner;

class Library{

        String bookname;
        String author;
        int bookprice;
        int copies;

        Library(){

               bookname = "The subtle at=rt of not giving a f*ck";
               author = "Mark Manson";
               bookprice= 500;
               copies= 10;
             }

             void display(){
                System.out.println("Book Name:"+bookname);
                System.out.println("Author:"+author);
                System.out.println("Book Price:"+bookprice);
                System.out.println("Copies Available:"+copies);
             }

             Search(Library a[]){
                Scanner sc = new Scanner (Sytem.in);
                System.out.println("Enetr the book name to search:");
             }
        

        
        }



