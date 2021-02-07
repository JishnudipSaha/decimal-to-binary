import java.util.*;
class abc
{
    long toBinary(int n) 
    {
        String str = "";
        int t = n;
        while (t > 0) {
            int d = t % 2;
            str = d + str;
            t /= 2;
        }
        
        long b = Long.parseLong(str);
        return b;
    }
    public static void main(String []args)
    {
        abc Math=new abc();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number in binary:-");
        int n=sc.nextInt();
        long show=Math.toBinary(n);
        System.out.println("The answer is:-"+show);
    }
}