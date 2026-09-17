package Lab4_loop2;

public class Divisible {
    static void main(String[] args) {
        Divisible d = new Divisible();
        d.sumDiv();
    }
    void sumDiv()
    {
        int sum=0;
        for(int i=100;i<=200;i++)
        {
            if(i%7==0)
                sum+=i;
        }
        System.out.println("Sum of integer  between 100 and 200 divisible by 7: "+sum);
    }
}
