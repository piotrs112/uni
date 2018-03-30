/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Piotr Socha, Bartosz Sadowski, Łysik Mateusz
 */
public class Group implements IGroup {

    private String gName;
    private List<Student> list;
    //todo: add a Set/List/ArrayList of students

    public Group (String gName)
    {
        this.gName = gName;
        this.list = new ArrayList<>();
    }

    public String getgName()
    {
        return gName;
    }

    @Override
    public int getGroupSize() {
        return list.size();
    }

    @Override
    public boolean addStudent(Student s)
    {
        if(list.contains(s))
        {
            return false;
        }
        else if(!list.add(s))
        {
            return false;
        }
        else
        {
            return true;
        }
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
