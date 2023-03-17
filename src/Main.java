import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        String tekst;
        System.out.print("input number here: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("number printed: " + number);
        String str = Integer.toString(number);
        System.out.println("changed from integer to string: " + str);
        input.close();

        newClass outputFromDifferentClass = new newClass();
        tekst = outputFromDifferentClass.metoda();

        System.out.println(tekst);

    }
}