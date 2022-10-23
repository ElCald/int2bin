import java.util.Scanner;

class int2bin{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt(), i=0, bin=0;

        while(n!=0){
            if(n%2!=0)
                bin += Math.pow(10, i);
            i++;
            n/=2;
        }

        System.out.println(bin);
    }
}//fin class

