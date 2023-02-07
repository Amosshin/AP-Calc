import java.util.Scanner;
public class cal {
    public static void StyleOne(){
        Scanner input = new Scanner(System.in);
        double[] grade = new double[8];
        double[] credit = new double[8];
        for (int k = 0; k < grade.length; k++) {
            int period = k + 1;
            System.out.print("Enter your grade for period" + period + "--> ");
            grade[k] = input.nextDouble();
            double AP = 1.09;
            double Honors = 1.06;
            double ACP = 1.02;
            double CP = 1;
            System.out.print("Enter the weighted value( No class as 0, CP as 1, ACP as 2, Honors as 3, AP as 4) -->  ");
            int w = input.nextInt();
            System.out.print("Enter the credit ");
            credit[k] = input.nextInt();
            if (w == 4) {
               grade[k] = grade[k] * AP * credit[k];
            }
            if (w == 3) {
               grade[k] = grade[k] * Honors * credit[k];
            }
            if (w == 2) {
               grade[k] = grade[k] * ACP * credit[k];
            }
            if (w == 1) {
                grade[k] =grade[k] * CP * credit[k];
            }
            if (w==0){
                grade[k] = 0;
            }
          if(w>=5){
                System.out.println("error number, please enter the correct weighted value");
               grade[0] = 333;
              break;
           }
        }
        double tc = 0;
        for (int g = 0; g < credit.length; g++) {
            tc += credit[g];
        }
        double sum = 0;
        for (int t = 0; t < grade.length; t++) {
            sum += grade[t];
        }
       double gpa = sum / tc;
        double RoundGpa = gpa * 100;
        if (grade[0] != 333) {
            System.out.print("Final gpa: " + gpa);
            gpa = Math.round(RoundGpa)/100;
            System.out.print("Rounded gpa: " + gpa);
        }
    }
    public static void StyleTwo(){
        Scanner input = new Scanner(System.in);
        double[] grade = new double[8];
        double[] credit = new double[8];
        for (int k = 0; k < grade.length; k++) {
            int period = k + 1;
            System.out.print("Enter your grade for period" + period + "--> ");
            grade[k] = input.nextDouble();
            double AP = 1.09;
            double Honors = 1.06;
            double ACP = 1.02;
            double CP = 1;
            System.out.print("Enter the weighted value( No class as 0, CP as 1, ACP as 2, Honors as 3, AP as 4) -->  ");
            int w = input.nextInt();
            System.out.print("Enter the credit ");
            credit[k] = input.nextInt();
            if (w == 4) {
                grade[k] = grade[k] * AP * credit[k];
            }
            if (w == 3) {
                grade[k] = grade[k] * Honors * credit[k];
            }
            if (w == 2) {
                grade[k] = grade[k] * ACP * credit[k];
            }
            if (w == 1) {
                grade[k] =grade[k] * CP * credit[k];
            }
            if (w==0){
                grade[k] = 0;
            }
            else{
                System.out.println("error number, please enter the correct weighted value");
                grade[0] = 333;
                break;
            }
        }
        double tc = 0;
        for (int g = 0; g < credit.length; g++) {
            tc += credit[g];
        }
        double sum = 0;
        for (int t = 0; t < grade.length; t++) {
            sum += grade[t];
        }
        double gpa = sum / tc;
        double RoundGpa = gpa * 100;
        if (grade[0] != 333) {
            System.out.print("Final gpa: " + gpa);
            gpa = Math.round(RoundGpa)/100;
            System.out.print("Rounded gpa: " + gpa);
        }
    }
}






