public class Group implements IGroup {

    //todo: add a Set/List/ArrayList of students
    
    @Override
    public int getGroupSize() {
        return 0;
    }

    @Override
    public boolean addStudent(Student s) {
        return false;
    }

    @Override
    public boolean removeStudent(Student s) {
        return false;
    }

    @Override
    public int indexOf(Student s) {
        return 0;
    }

    @Override
    public Student studentAt(int index) {
        return null;
    }

    @Override
    public boolean isMember(Student s) {
        return false;
    }

    @Override
    public void evaluateStudent(Student s) {

    }

    @Override
    public void evaluateStudent(int index) {

    }

    @Override
    public void evaluateAll() {
        //todo: enhanced for, run evaluate() on every student object
    }
}
