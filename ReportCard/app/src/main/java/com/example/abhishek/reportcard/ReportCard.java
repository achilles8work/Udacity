package com.example.abhishek.reportcard;

/**
 * Created by abhishek on 20/1/17.
 */

public class ReportCard {

    private String Subject;

    private String Grade;

    public ReportCard(String subjectName, String grade) {
        Subject = subjectName;
        Grade = grade;
    }

    public String getSubject(){
        return Subject;
    }

    public String getGrade(){
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String toString() {
        return "Grade: " + Grade;
    }
}
