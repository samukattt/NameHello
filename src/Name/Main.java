package Name;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("Как тебя зовут?");
        Scanner v = new Scanner(System.in);
        String n = v.next();
        System.out.println("Привет, " + n + "!");
    }
}
