import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final double HOMEWORK_MAX = 800.0;
        final double QUIZZES_MAX = 400.0;
        final double MIDTERM_MAX = 150.0;
        final double FINAL_MAX = 200.0;    

        double ugHwMult = 0.20;
        double ugQMult = 0.20;
        double ugMMult = 0.30;
        double ugFMult = 0.30;

        double gHwMult = 0.15;
        double gQMult = 0.05;
        double gMMult = 0.35;
        double gFMult = 0.45;

        double dlHwMult = 0.05;
        double dlQMult = 0.05;
        double dlMMult = 0.40;
        double dlFMult = 0.50;
       
        

        String studentStatus  = scnr.next();
        double homeworkGrade = scnr.nextDouble();
        double quizGrade = scnr.nextDouble();
        double midtermGrade = scnr.nextDouble();
        double finalExamGrade = scnr.nextDouble();

        

        double homeworkFinal = (homeworkGrade / HOMEWORK_MAX) * 100;
        double quizFinal = (quizGrade / QUIZZES_MAX) * 100;
        double midtermFinal = (midtermGrade / MIDTERM_MAX) * 100;
        double finalFinal = (finalExamGrade / FINAL_MAX) * 100;

        
        
        if (homeworkFinal > 100.0) {
            homeworkFinal = 100.0;
        }
        if (quizFinal > 100.0) {
            quizFinal = 100.0;
        }
        if (midtermFinal > 100.0) {
            midtermFinal = 100.0;
        }
        if (finalFinal > 100.0) {
            finalFinal = 100.0;
        }



        if (studentStatus.equals("UG") || studentStatus.equals("G") || studentStatus.equals("DL")) {
            System.out.printf("Homework: %.1f%%\n", homeworkFinal);
            System.out.printf("Quizzes: %.1f%%\n", quizFinal);
            System.out.printf("Midterm: %.1f%%\n", midtermFinal);
            System.out.printf("Final Exam: %.1f%%\n", finalFinal);
        }
        else {
            System.out.println("Error: student status must be UG, G or DL");
        }

       

        if (studentStatus.equals("UG")) {
            double ugHomework = (homeworkFinal * ugHwMult);
            double ugQuiz = (quizFinal * ugQMult);
            double ugMidterm = (midtermFinal * ugMMult);
            double ugFinal = (finalFinal * ugFMult);
            double ugAverage = ugHomework + ugQuiz + ugMidterm + ugFinal;
            System.out.printf("UG average: %.1f", ugAverage);
            System.out.print("%\n");

            if(ugAverage >= 90){
                System.out.println("Course grade: A");
            }
            else if(ugAverage < 90 && ugAverage >= 80){
                System.out.println("Course grade: B");
            }
            else if(ugAverage < 80 && ugAverage >= 70){
                System.out.println("Course grade: C");
            }
            else if(ugAverage < 70 && ugAverage >= 60){
                System.out.println("Course grade: D");
            }
            else if(ugAverage < 60){
                System.out.println("Course grade: F");
            }
        }



        if (studentStatus.equals("G")) {
            double gHomework = (homeworkFinal * gHwMult);
            double gQuiz = (quizFinal * gQMult);
            double gMidterm = (midtermFinal * gMMult);
            double gFinal = (finalFinal * gFMult);
            double gAverage = gHomework + gQuiz + gMidterm + gFinal;
            System.out.printf("G average: %.1f", gAverage);
            System.out.print("%\n");

            if(gAverage >= 90){
                System.out.println("Course grade: A");
            }
            else if(gAverage < 90 && gAverage >= 80){
                System.out.println("Course grade: B");
            }
            else if(gAverage < 80 && gAverage >= 70){
                System.out.println("Course grade: C");
            }
            else if(gAverage < 70 && gAverage >= 60){
                System.out.println("Course grade: D");
            }
            else if(gAverage < 60){
                System.out.println("Course grade: F");
            }
        }


        
        if (studentStatus.equals("DL")) {
            double dlHomework = (homeworkFinal * dlHwMult);
            double dlQuiz = (quizFinal * dlQMult);
            double dlMidterm = (midtermFinal * dlMMult);
            double dlFinal = (finalFinal * dlFMult);
            double dlAverage = dlHomework + dlQuiz + dlMidterm + dlFinal;
            System.out.printf("DL average: %.1f", dlAverage);
            System.out.print("%\n");

            if(dlAverage >= 90){
                System.out.println("Course grade: A");
            }
            else if(dlAverage < 90 && dlAverage >= 80){
                System.out.println("Course grade: B");
            }
            else if(dlAverage < 80 && dlAverage >= 70){
                System.out.println("Course grade: C");
            }
            else if(dlAverage < 70 && dlAverage >= 60){
                System.out.println("Course grade: D");
            }
            else if(dlAverage < 60){
                System.out.println("Course grade: F");
            }
        }
   }
}
