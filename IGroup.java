package uni;

public interface IGroup {
    int getGroupSize();
    boolean addStudent(Student s);
    boolean removeStudent(Student s);
    int indexOf(Student s);
    Student studentAt(int index);
    boolean isMember(Student s);
    void evaluateStudent(Student s);
    void evaluateStudent(int index);
    void evaluateAll();
}
