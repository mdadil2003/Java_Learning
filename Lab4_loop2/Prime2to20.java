package Lab4_loop2;

public class Prime2to20 {
    public static void main(String[] args) {
        Prime2to20 r=new Prime2to20();
        r.prime();
    }
    void prime()
    {
        for(int i=2; i<=20;i++){
            int count=0;
            for (int j = 1; j <= i; j++)
            {
                  if (i % j == 0)
                           count++;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}
