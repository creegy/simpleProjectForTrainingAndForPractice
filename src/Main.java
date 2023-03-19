import java.util.Scanner;
// -- self explanatory code via string names or what to input
public class Main {
    public static int X;
    public static int Y;
    public static int sum;
    public static int sumOfAddition;
    public static void main(String[] args) {
//        int number;
        String tekst;
//        System.out.print("input number here: ");
//        Scanner input = new Scanner(System.in);
//        number = input.nextInt();
//        System.out.println("number printed: " + number);
//        String str = Integer.toString(number);
//        System.out.println("changed from integer to string: " + str);
//        input.close();

        //-- code to copy
//        Methods outputFromDifferentClass = new Methods(X, Y, sum);


//        Classes classes = new Classes();
        Classes.Fox foxPrint = new Classes.Fox();
        Classes.Animal animalPrint = new Classes.Animal();
        animalPrint.animalSounds();
        foxPrint.animalSounds();
        System.out.println(animalPrint.animalStr + " ||| " + foxPrint.foxStr);


        Scanner inputMath = new Scanner(System.in);
        System.out.print("number X = ");
        X = inputMath.nextInt();
        System.out.print("number Y = ");
        Y = inputMath.nextInt();
        Methods outputFromDifferentClass = new Methods(X, Y, sum);
        sumOfAddition = outputFromDifferentClass.addition();
        System.out.println("sum of addition = " + sumOfAddition);
        tekst = outputFromDifferentClass.metoda();

        System.out.println(tekst);

    }
}