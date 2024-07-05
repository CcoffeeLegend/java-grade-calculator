import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        final double HOMEWORK_MAX = 800.0;
        final double QUIZZES_MAX = 400.0;
        final double MIDTERM_MAX = 150.0;
        final double FINAL_MAX = 200.0;    
        double homeworkGrade;
        double quizGrade;
        double midtermGrade;
        double finalExamGrade;
        double homeworkFinal;
        double quizFinal;
        double midtermFinal;
        double finalFinal;

        double ugHomework;
        double ugQuiz;
        double ugMidterm;
        double ugFinal;
        double ugHwMult = 0.20;
        double ugQMult = 0.20;
        double ugMMult = 0.30;
        double ugFMult = 0.30;
        double ugAverage;

        double gHomework;
        double gQuiz;
        double gMidterm;
        double gFinal;
        double gHwMult = 0.15;
        double gQMult = 0.05;
        double gMMult = 0.35;
        double gFMult = 0.45;
        double gAverage;

        double dlHomework;
        double dlQuiz;
        double dlMidterm;
        double dlFinal;
        double dlHwMult = 0.05;
        double dlQMult = 0.05;
        double dlMMult = 0.40;
        double dlFMult = 0.50;
        double dlAverage;
       
        
        //following section assigns following variables with user input
        String studentStatus  = scnr.next();
        homeworkGrade = scnr.nextDouble();
        quizGrade = scnr.nextDouble();
        midtermGrade = scnr.nextDouble();
        finalExamGrade = scnr.nextDouble();

        //following section calculates percent grade for each part of coursework
        homeworkFinal = (homeworkGrade / HOMEWORK_MAX) * 100;
        quizFinal = (quizGrade / QUIZZES_MAX) * 100;
        midtermFinal = (midtermGrade / MIDTERM_MAX) * 100;
        finalFinal = (finalExamGrade / FINAL_MAX) * 100;

        //following section normalizes the max grade to 100%
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

        //System.out.print(studentStatus); //testing to see the string value

        //following section outputs grade per coursework part if user is UG, G, or DL
        if (studentStatus.equals("UG") || studentStatus.equals("G") || studentStatus.equals("DL")) {
            System.out.printf("Homework: %.1f%%\n", homeworkFinal);
            System.out.printf("Quizzes: %.1f%%\n", quizFinal);
            System.out.printf("Midterm: %.1f%%\n", midtermFinal);
            System.out.printf("Final Exam: %.1f%%\n", finalFinal);
        }
        else {
            System.out.println("Error: student status must be UG, G or DL");
        }

        //following sections output final number and letter grade based on whether the user is UG, G, or DL
        if (studentStatus.equals("UG")) {
            ugHomework = (homeworkFinal * ugHwMult);
            ugQuiz = (quizFinal * ugQMult);
            ugMidterm = (midtermFinal * ugMMult);
            ugFinal = (finalFinal * ugFMult);
            ugAverage = ugHomework + ugQuiz + ugMidterm + ugFinal;
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
            gHomework = (homeworkFinal * gHwMult);
            gQuiz = (quizFinal * gQMult);
            gMidterm = (midtermFinal * gMMult);
            gFinal = (finalFinal * gFMult);
            gAverage = gHomework + gQuiz + gMidterm + gFinal;
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
            dlHomework = (homeworkFinal * dlHwMult);
            dlQuiz = (quizFinal * dlQMult);
            dlMidterm = (midtermFinal * dlMMult);
            dlFinal = (finalFinal * dlFMult);
            dlAverage = dlHomework + dlQuiz + dlMidterm + dlFinal;
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
