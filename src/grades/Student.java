package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double averageGrade = 0;
        for (int grade: this.grades){
            averageGrade += grade;
        }
        return averageGrade/grades.size();
    }




}
