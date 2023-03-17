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

        Methods outputFromDifferentClass = new Methods();
        tekst = outputFromDifferentClass.metoda();

        System.out.println(tekst);

//        Classes classes = new Classes();
        Classes.Fox foxPrint = new Classes.Fox();
        Classes.Animal animalPrint = new Classes.Animal();
        animalPrint.animalSounds();
        foxPrint.animalSounds();
        System.out.println(animalPrint.animalStr + " ||| " + foxPrint.foxStr);
    }
}