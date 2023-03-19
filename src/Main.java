import java.util.Scanner;
// -- self-explanatory code via string names or what to input --
public class Main {
    public static int X;
    public static int Y;
    public static int sum;
    public static int sumOfAddition;
    public static int sumOfSubtraction;
    public static int sumOfMultiplication;
    public static int sumOfDivision;
    public static int sumOfModulus;
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

        //-- code to copy --
//        Methods outputFromDifferentClass = new Methods(X, Y, sum);


//        Classes classes = new Classes();

        Classes.Fox foxPrint = new Classes.Fox();
        Classes.Animal animalPrint = new Classes.Animal();
        animalPrint.animalSounds();
        foxPrint.animalSounds();
        System.out.println(animalPrint.animalStr + " ||| " + foxPrint.foxStr);

        // -- user input --
        Scanner inputMath = new Scanner(System.in);
        System.out.print("number X = ");
        X = inputMath.nextInt();
        System.out.print("number Y = ");
        Y = inputMath.nextInt();

        // -- after calculation, system output --
        Methods outputFromDifferentClass = new Methods(X, Y, sum);
        sumOfAddition = outputFromDifferentClass.addition();
        System.out.println("sum of addition = " + sumOfAddition);
        sumOfSubtraction = outputFromDifferentClass.subtraction();
        System.out.println("sum of subtraction = " + sumOfSubtraction);
        sumOfMultiplication = outputFromDifferentClass.multiplication();
        System.out.println("sum of multiplication = " + sumOfMultiplication);
        sumOfDivision = outputFromDifferentClass.division();
        System.out.println("sum of division = " + sumOfDivision);
        sumOfModulus = outputFromDifferentClass.modulus();
        System.out.println("sum of modulus = " + sumOfModulus);

        tekst = outputFromDifferentClass.metoda();
        System.out.println(tekst);

    }
}