package Lab7_ClassAndObject;
import java.util.Scanner;
//wap to ask 5 books record from user and display them
public class Book
{
    String bname;
    int price;
    Book(){    }
    Book (String bname, int price)
    {
        this.bname= bname;
        this.price=price;

    }
    void display()     { System.out.println( bname+ " "+ price);     }
    int search(Book k[],String searchbook)
    {
        for(Book x:k)
        {
            if(x.bname.equals(searchbook))
            {
                System.out.println(" record found");
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Book e[]= new Book[5];
        for(int i=0;i<5;i++)
        { System.out.println("enter book name");
            String a= s.next();
            System.out.println("enter book price");
            int b= s.nextInt();
            e[i]= new Book(a,b);
        }
        // e[0].show(e);
        for(int i=0;i<5;i++)
        {
            e[i].display();
        }
        int found=0;
        Book k= new Book();
        for(int i=0;i<5;i++)
        {
            found=k.search(e,"php");
            if(found==1)break;
        }

        if(found==0)
            System.out.println("book not found");
    }



}
