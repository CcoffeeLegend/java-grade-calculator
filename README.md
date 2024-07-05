# java-grade-calculator
Takes user inputs and outputs their grades.

Depending upon whether a student is input as an undergrad(UG), grad(G), or distance learner(DL), the program will provide the user with the student's grade, adjusting each type of coursework's weighting appropriately, then outputting the student's final grades.

Category averages are calculated considering maximum points for homework (800), quizzes (400), midterm exam (150), and final exam (200).

Weightings:

Category: UG, G, DL

Homework: 20%,	15%,	5%

Quizzes: 20%,	5%,	5%

Midterm: 30%,	35%,	40%

Final Exam:	30%,	45%,	50%


Example:
If the input is:
G   800.0   400.0   100.0   100.0

Then the output is:
Homework: 100.0%
Quizzes: 100.0%
Midterm: 66.7%
Final Exam: 50.0%
G average: 65.8%
