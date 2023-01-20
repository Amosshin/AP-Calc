import java.util.Scanner;
public class cal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[8];
        for (int k = 0; k < array.length; k++) {
            int a = k+1;
            System.out.print("Enter your grade for period"+ a+"--> " );
            array[k] = input.nextDouble();
            double AP = 1.09;
            double Honors = 1.06;
            double ACP = 1.02;
            double CP = 1;
            System.out.print("Enter the weighted value( AP as 1.09, Honors as 1.06, ACP as 1.02, CP as 1 -->  ");
            double w = input.nextDouble();
            System.out.print("Enter the credit ");
            int credit = input.nextInt();
            if (w == 1.09) {
                array[k] = array[k] * AP * credit;
            }
            if (w == 1.06) {
                array[k] = array[k] * Honors* credit;
            }
            if (w == 1.02) {
                array[k] = array[k] * ACP * credit;}
            if (w == 1) {
                array[k] = array[k] * CP * credit;
            }
            else{ System.out.print("error number, please enter the right number");
                break;}
            int TotalCredit = 0;
            TotalCredit += credit;
        }

        double sum = 0;
        for(int t = 0; t < array.length; t++) {
            sum += array[t];
            System.out.print(sum);
        }
        double gpa = sum/

    }






}

