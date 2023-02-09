import java.util.Scanner;
public class cal {
    public static void StyleOne(){
        Scanner input = new Scanner(System.in);
        double[] grade = new double[8];
        double[] credit = new double[8];
        int C;
        System.out.print("How many classes do you take? ");
        C = input.nextInt();
        for (int k = 0; k < C; k++) {
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
            gpa = (Math.round(RoundGpa))/100;
            System.out.print("Rounded gpa: " + gpa);
        }
    }
    public static void StyleTwo(){
        Scanner input = new Scanner(System.in);
        double[] grade = new double[8];
        double[] credit = new double[8];
        int C;
        System.out.print("How many classes do you take? ");
        C = input.nextInt();
        for (int k = 0; k < C; k++) {
            int period = k + 1;
            System.out.print("Enter your grade for period" + period + "--> ");
            grade[k] = input.nextDouble();
            System.out.print("Enter your Class level(Regular Class as 1, Honors as 2, AP as 3) -->  ");
            int w = input.nextInt();

            if (w == 3) {
                if(grade[k] >= 93 ){ grade[k] = 5.0;}
               else if((92 >=grade[k])&&(grade[k] >= 90)){ grade[k] = 4.7;}
               else if((89 >=grade[k])&&(grade[k] >= 87)){ grade[k] = 4.3;}
               else if((86 >=grade[k])&&(grade[k] >= 83)){ grade[k] = 4.0;}
               else if((82 >=grade[k])&&(grade[k] >= 80)){ grade[k] = 3.7;}
               else if((79 >=grade[k])&&(grade[k] >=77)){ grade[k] = 3.3;}
               else if((76 >=grade[k])&&(grade[k] >= 73)){ grade[k] = 3.0;}
               else if((72 >=grade[k])&&(grade[k] >= 70)){ grade[k] = 2.7;}
               else if((69 >=grade[k])&&(grade[k] >=67)){ grade[k] = 2.3;}
               else if((66 >=grade[k])&&(grade[k] >= 65)){ grade[k] = 2.0;}
               else if((65 >grade[k])){ grade[k] = 0.0;}
            }
            if (w == 2) {
                if(grade[k] >= 93 ){ grade[k] = 4.5;}
                else if((92 >=grade[k])&&(grade[k] >= 90)){ grade[k] = 4.2;}
                else if((89 >=grade[k])&&(grade[k] >= 87)){ grade[k] = 3.8;}
                else if((86 >=grade[k])&&(grade[k] >= 83)){ grade[k] = 3.5;}
                else if((82 >=grade[k])&&(grade[k] >= 80)){ grade[k] = 3.2;}
                else if((79 >=grade[k])&&(grade[k] >=77)){ grade[k] = 2.8;}
                else if((76 >=grade[k])&&(grade[k] >= 73)){ grade[k] = 2.5;}
                else if((72 >=grade[k])&&(grade[k] >= 70)){ grade[k] = 2.2;}
                else if((69 >=grade[k])&&(grade[k] >=67)){ grade[k] = 1.8;}
                else if((66 >=grade[k])&&(grade[k] >= 65)){ grade[k] = 1.5;}
                else if((65 >grade[k])){ grade[k] = 0.0;}
            }
            if (w == 1) {
                if(grade[k] >= 93 ){ grade[k] = 4.0;}
               else  if((92 >=grade[k])&&(grade[k] >= 90)){ grade[k] = 3.7;}
                else if((89 >=grade[k])&&(grade[k] >= 87)){ grade[k] = 3.3;}
                else if((86 >=grade[k])&&(grade[k] >= 83)){ grade[k] = 3.0;}
                else if((82 >=grade[k])&&(grade[k] >= 80)){ grade[k] = 2.7;}
                else if((79 >=grade[k])&&(grade[k] >=77)){ grade[k] = 2.3;}
                else if((76 >=grade[k])&&(grade[k] >= 73)){ grade[k] = 2.0;}
                else if((72 >=grade[k])&&(grade[k] >= 70)){ grade[k] = 1.7;}
                else if((69 >=grade[k])&&(grade[k] >=67)){ grade[k] = 1.3;}
                else if((66 >=grade[k])&&(grade[k] >= 65)){ grade[k] = 1.0;}
                else if((65 >grade[k])){ grade[k] = 0.0;}
            }
            if(w>3){
                System.out.println("error number, please enter the correct weighted value");
                grade[0] = 333;
                break;
            }
        }
        double sum = 0;
        for (int t = 0; t < C; t++) {
            sum += grade[t];
         System.out.println(grade[t]);
        }
        System.out.print(sum);
        double gpa = sum / C;
        double RoundGpa = gpa * 100;
        if (grade[0] != 333) {
            System.out.println("Final gpa: " + gpa);

        }
    }
}






