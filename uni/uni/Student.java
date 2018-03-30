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
    private int index;
    private float grade;

    public Student(String name, String surname, int index, float grade) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        this.grade = grade;
    }

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
    public int compareTo(Student o) {
        return Float.compare(o.grade, grade);
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

