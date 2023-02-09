import java.util.Scanner;
public class overall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What gpa scale do you use?");
        System.out.println("1. 100 scale and 2. 4.0 scale");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                cal.StyleOne();break;
            case 2:
                cal.StyleTwo();break;
            default: System.out.println("Error, please try it again");


        }

        }
    }
