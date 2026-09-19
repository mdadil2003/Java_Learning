package Lab6_Array;

// in case if do not enter data then exception is
//ArrayIndexOutOfBoundsException
public class PersonData {

    void display(String name, int age,float salary)
    {
        System.out.println(name +" "+ age+" "+ salary);
    }
    public static void main(String[] args)
    {
        String name=args[0];
        //age = "23sdsd"
        //java.lang.NumberFormatException:
        int age = Integer.parseInt(args[1]);
        float sal= Float.parseFloat(args[2]) ;
        PersonData p= new PersonData();
        p.display(name, age, sal);


    }

}