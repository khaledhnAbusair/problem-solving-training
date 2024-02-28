package com.abusair.training.hackerrank;

public class GradingStudents {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    static int[] gradingStudents(int[] grades) {
        int[] newGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38) {
                int modeResult = grade % 5;
                int result = grade - modeResult;
                int modeGrade = result + 5;
                int finalResult = modeGrade - grade;
                if (modeResult == 0)
                    newGrades[i] = grade;
                else if (finalResult < 3)
                    newGrades[i] = modeGrade;
                else if (finalResult == 3)
                    newGrades[i] = grade;
                else
                    newGrades[i] = grade;

            } else
                newGrades[i] = grade;
        }

        return newGrades;
    }
}
