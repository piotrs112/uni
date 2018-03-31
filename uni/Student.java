/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

/**
 * @author Piotr Socha, Bartosz Sadowski, Lysik Mateusz
 */
import java.util.Random;

public class Student implements IStudent {
    private String name;
    private String surname;
    private int index;
    private float grade = (float) 0.0;
    private static int numberOfStudents = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.index = ++numberOfStudents;
    }

    public int getIndex(){
        return index;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Przypisuje ocenę studentowi używając funkcji pseudolosowej Gaussa
     */
    @Override
    public void evaluate() {
        Random r = new Random();
        do {
            grade = (float) (Math.round((r.nextGaussian() + 3.5) * 2) / 2.);
        } while (grade < 2.0 || grade > 5.0);
    }

    @Override
    public int compareTo(Student s) {
       int comparator = surname.compareTo(s.surname);
       if(comparator==0)
       {
           return name.compareTo(s.name);
       }
       else
       {
           return comparator;
       }
    }

    @Override
    public float getGrade() {
        return grade;
    }

    @Override
    public void setGrade(float grade) {
        this.grade = grade;
    }
}

