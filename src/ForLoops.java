import java.util.Scanner;

public class ForLoops {
    private final static Scanner sc = new Scanner(System.in);
    static int i = 0;
    public static void forSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int sum = 0;
        int n = 0;
        int num = sc.nextInt();
        for
            ( int i =0;
            i <= n;
            i++){
            sum = sum + i;

        }

        System.out.println("Sum is: " + sum);
    }

    public static void rangeSum() {
        System.out.println("Enter first number: ");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int x=0, y=0;
        while (i < num) {
            i++;
            x = x + i;
        }
        int n = i;
        i = 0;
        while ( i < num2){
            i++;
            y=y+i;
        }
        System.out.println(num+" "+num2);
        System.out.println("Range: "+(Math.abs(x-y)+Math.min(n,i)));

    }

    public static void factorial() {
        System.out.println("Enter a number: ");
        int x=1;
        int num = sc.nextInt();
        while (i < num){
            i++;
            x=x*i;
        }
        i = 0;
        System.out.println("Factored: ");
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
