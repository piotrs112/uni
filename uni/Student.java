/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

/**
 *
 * @author Piotr Socha, Bartosz Sadowski, Łysik Mateusz
 */
import java.util.Random;

public class Student implements IStudent {
    private String name;
    private String surname;
    private static int index = 0;
    private float grade = 0;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.index = ++index;
    }

    public int getIndex(){return index;}

    @Override
    public String getName() {
        return name + " " + surname;
    }

    @Override
    public void setName(String name) {

    }


    /**
     * Przypisuje ocenę używając funkcji pseudolosowej Gaussa
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

