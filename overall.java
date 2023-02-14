import java.util.Scanner;
public class overall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What gpa scale do you use?");
        System.out.println("1. 100 scale 2. 4.0 scale");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
               System.out.println( "How many classes do you take?");
                cal.StyleOne(input.nextInt());break;
            case 2:
                System.out.println( "How many classes do you take?");
                cal.StyleTwo(input.nextInt());break;
            default: System.out.println("Error, please try it again");
        }
        System.out.println();

        }
    }
