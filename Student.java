public class Student implements IStudent {
    private String imie;
    private String nazwisko;
    private int index;
    private float grade;

    public Student(String imie, String nazwisko, int index, float ocena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
        this.grade = ocena;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void evaluate() {

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    @Override
    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
