import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int b = scn.nextInt();
        System.out.println(Math.round(a*(Math.pow(10,b)))/Math.pow(10,b));

    }
}
