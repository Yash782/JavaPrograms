import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Subject out off 100");

        System.out.println("Enter Maths marks");
        float maths = sc.nextFloat();

        System.out.println("Enter English marks");
        float english = sc.nextFloat();

        System.out.println("Enter History marks");
        float history = sc.nextFloat();

        System.out.println("Enter Computer marks");
        float computer = sc.nextFloat();

        System.out.println("Enter Science marks");
        float science = sc.nextFloat();

        float sum = maths+science+history+computer+english;
        float total = (sum / 500) * 100;
        System.out.println("Total percentage is " +total);
        System.out.println("Your CGPA is "+ total/9.5);

        if(total>=90)
            System.out.println("You got A+ Grade");

        else if(total>=80)
            System.out.println("You got A Grade");

        else if(total>=70)
            System.out.println("You got B+ Grade");

        else if(total>=60)
            System.out.println("You got B Grade");

        else if(total>=50)
            System.out.println("You got C+ Grade");

        else if(total>=40)
            System.out.println("You got C Grade");

        else {
            System.out.println("Sorry you fail");
            System.out.println("But don't give up... Try again");
        }


    }
}
