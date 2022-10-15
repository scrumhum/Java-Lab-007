import java.util.Scanner;

public class WhileLoops {
    private final static Scanner sc = new Scanner(System.in);

    public static void eoCount() {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;

        System.out.println("Enter number to determine whether even or odd: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " even \n");
                even++;

            } else {
                System.out.println(num + " odd \n");
                odd++;
            }
            num = sc.nextInt();
        }
        System.out.println("There are " + even + " even numbers: ");
        System.out.println("There are " + odd + " even numbers: ");
    }


    public static void mean() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to calculate mean: ");
        int score = 0;
        int num = 0;
        int sum = 0;
        score = scan.nextInt();
        while (score != -1) {
            sum += score;
            score = scan.nextInt();
            num++;
        }
        System.out.println(" The average is :" + (sum / num));
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
