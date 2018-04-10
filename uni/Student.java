package uni;

import java.util.Random;
/**
 * Student is a person attending classes at University.
 * <p>
 * The <code>Student</code> class creates objects which
 * are represented by name, surname, number of index and
 * a grade.
 *
 * @author Piotr Socha
 * @author Bartosz Sadowski
 * @author Mateusz Lysik
 *
 */
import java.util.regex.Pattern;

public class Student implements IStudent {
    /**
     *  It's a name of the <object>Student</object>.
     */
    private String name;
    /**
     * It's a surname of the <object>Student</object>.
     */
    private String surname;
    /**
     * It's a unique number given to the <code>Student</code>
     * object.
     */
    private int index;
    /**
     * It's a final grade of the <code>Student</code>.
     * <p>
     * It's from the set of {2.0, 3.0, 3.5, 4.0, 4.5, 5.0}.
     * If equals 0.0, then no grade was yet given to the
     * <code>Student</code> object.
     */
    private float grade = (float) 0.0;
    /**
     * Number of Students already added.
     */
    private static int numberOfStudents = 0;

    /**
     * Constructs new Student, with Name, Surname, and
     * next index number, based on current number of Students.
     * @param name Name of the Student.
     * @param surname Surame of the Student.
     */
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.index = ++numberOfStudents;
    }

    /**
     * Getter for index number.
     * @return number of index.
     */
    public int getIndex(){
        return index;
    }

    /**
     * Getter for number of Students.
     * @return current number of Students.
     */
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
    /**
     * Getter for name of the Student.
     * @return String which is sum of name and surname of the Student.
     */
    public String getName() {
        return name + " " + surname;
    }

    /**
     * Setter for name of the Student.
     * @param name changes name of the Student.
     */
    public void setName(String name) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Boolean b = p.matcher(name).find();

        if (!b) {
            String[] s = name.split(" ");
            this.name = s[0];
            this.surname = s[1];

        }
    }

    /**
     * When activated evaluate method sets grade of the Student, based
     * on normal distribution.
     * @see Random#nextGaussian()
     */
    public void evaluate() {
        Random r = new Random();
        do {
            grade = (float) (Math.round((r.nextGaussian() + 3.5) * 2) / 2.);
        } while (grade < 2.0 || grade > 5.0 || grade == 2.5);
    }

    /**
     * Defines the method how two objects of <code>Student</code>
     * class.
     * @param s Object of Student class which is compared to current object.
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Student s) {
        int comparator = surname.compareTo(s.surname);
        if (comparator == 0) return name.compareTo(s.name);
        else return comparator;
    }

    /**
     * Getter for the grade of the Student.
     * @return grade.
     */
    @Override
    public float getGrade() {
        return grade;
    }

    /**
     * Setter for the grade of the Student.
     * @param grade new grade of the Student.
     */
    @Override
    public void setGrade(float grade) {
        if (grade >= 2.0 && grade <= 5.0 && grade != 2.5 && grade % 0.5 == 0) {
            this.grade = grade;
        }
    }

    @Override
    public String toString(){
        return getName();
    }
}

