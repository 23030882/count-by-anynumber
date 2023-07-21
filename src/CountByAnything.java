import java.util.Scanner;

public class CountByAnything {

    public static void main(String[] args) {
        int r, c, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("please input value you would like to Count by");
            b = scanner.nextInt();
        System.out.println();
        for (r = 1; r <= 10; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 50) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 11; r <= 20; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 100) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 21; r <= 30; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 150) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 31; r <= 40; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 200) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 41; r <= 50; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 250) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 51; r <= 60; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 300) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 61; r <= 70; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 350) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 71; r <= 80; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 400) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 81; r <= 90; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 450) {
                System.out.println();
            }
        }
        System.out.println();
        for (r = 91; r <= 100; r++) {
            c = r * b;
            System.out.print(c + ",");
            if (c == 500) {
                System.out.println();
            }
        }
        System.out.println();

    }
}



