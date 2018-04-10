package uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * A group is set of students who, have something in common.
 *<p>
 *The <code>Group</code> is a list of objects from
 * <code>Student</code>class. There are operations, that
 * can be applied to all of these objects.
 *
 * @author Piotr Socha
 * @author Bartosz Sadowski
 * @author Mateusz Lysik
 *
 * @see Student
 */
public class Group implements IGroup {
    /**
     * It's a name of <code>Group</code> object.
     */
    public String groupName;
    /**
     * Contains a list of <code>Student</code> objects.
     */
    private List<Student> list;

    /**
     * Constructs a new Group.
     * @param name Name of the Group.
     */
    public Group (String name)
    {
        groupName = name;
        this.list = new ArrayList<>();
    }

    /**
     * Tells how many students are in a group.
     * @return Number of students.
     */
    @Override
    public int getGroupSize() {
        return list.size();
    }

    /**
     * Adds student to a group. If object trying to be
     * added is already a member of a group, it gets rejected.
     * <p>
     * After student is added, group is sorted.
     * @param s Student who joins the group.
     * @return true if successful
     */
    @Override
    public boolean addStudent(Student s)
    {
        if(isMember(s))
        {
            return false;
        }
        else if(!list.add(s))
        {
            return false;
        }
        else
        {
            Collections.sort(list);
            return true;
        }
    }

    /**
     * Removes student from the group.
     * @param s Student who leaves the group.
     * @return true if successful.
     */
    @Override
    public boolean removeStudent(Student s) {
        if(!isMember(s))
        {
            return false;
        }
        else if(!list.remove(s))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Checks index number of selected student.
     * @param s Student whose index number is checked.
     * @return index number.
     */
    @Override
    public int indexOf(Student s) {
        return s.getIndex();
    }

    /**
     * Looks for the Student based on ones index number.
     * <p>
     * Checks if the group contains a student with given
     * index number. If there is, returns the student.
     * If there is no such student returns null.
     * @param index Index number given.
     * @return null if there is no matching student or
     * Student object matching given index number.
     */
    @Override
    public Student studentAt(int index) {
        for(Student student : list)
        {
            if(student.getIndex()==index)
            {
                return student;
            }
        }
        return null;
    }

    /**
     * Checks if student is a part of the group.
     * @param s Student who is checked.
     * @return true if one is contained
     */
    @Override
    public boolean isMember(Student s) {
        if(list.contains(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Given student is evaluated.
     * <p>
     * Based on normal distribution, student gets
     * a grade, from 2 to 5.
     * @param s Evaluated student.
     * @see Student#evaluate()
     */
    @Override
    public void evaluateStudent(Student s) {
        s.evaluate();
    }

    /**
     * Given student is evaluated.
     * <p>
     * Based on normal distribution, student gets
     * a grade, from 2 to 5.
     * @param index Evaluated student based on index number.
     * @see Student#evaluate()
     */
    @Override
    public void evaluateStudent(int index) {
        studentAt(index).evaluate();
    }

    /**
     * All students gets evaluated.
     * <p>
     * Based on normal distribution, every student in the group
     * gets a grade, from 2 to 5.
     * @see Student#evaluate() 
     */
    @Override
    public void evaluateAll() {
        for(Student student : list)
        {
            student.evaluate();
        }
    }

    @Override
    public String toString(){
        return groupName;
    }

    public List getStudentList(){
    return list;
    }
}
