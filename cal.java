import java.util.Scanner;
public class cal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[8];
        double[] credit;
        credit = new double[8];
        for (int k = 0; k < array.length; k++) {
            int a = k + 1;
            System.out.print("Enter your grade for period" + a + "--> ");
            array[k] = input.nextDouble();
            double AP = 1.09;
            double Honors = 1.06;
            double ACP = 1.02;
            double CP = 1;
            System.out.print("Enter the weighted value( AP as 1.09, Honors as 1.06, ACP as 1.02, CP as 1 -->  ");
            double w = input.nextDouble();
            System.out.print("Enter the credit ");
            credit[k] = input.nextInt();
            if (w == 1.09) {
                array[k] = array[k] * AP * credit[k];
            }
            if (w == 1.06) {
                array[k] = array[k] * Honors * credit[k];
            }
            if (w == 1.02) {
                array[k] = array[k] * ACP * credit[k];
            }
            if (w == 1) {
                array[k] = array[k] * CP * credit[k];
            } else {
                System.out.println("error number, please enter the correct weighted value");
                array[0] = 333;
                break;
            }

        }

        double tc = 0;
        for (int g = 0; g < credit.length; g++) {
            tc += credit[g];
        }


        double sum = 0;
        for (int t = 0; t < array.length; t++) {
            sum += array[t];
        }
       double gpa = sum / tc;
        if (array[0] != 333) {
            System.out.print("Final gpa: " + gpa);

        }
    }
}






