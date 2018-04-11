package uni;

/**
 *
 * @author Piotr Socha
 * @author Bartosz Sadowski
 * @author Lysik Mateusz
 */
public interface IStudent extends Comparable<Student> {
    String getName();
    void setName(String name);
    float getGrade();
    void setGrade(float grade);
    void evaluate();
}