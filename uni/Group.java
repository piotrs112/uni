/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author Piotr Socha, Bartosz Sadowski, Lysik Mateusz
 */
public class Group implements IGroup {


    private List<Student> list;

    public Group ()
    {
        this.list = new ArrayList<>();
    }

    @Override
    public int getGroupSize() {
        return list.size();
    }

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

    @Override
    public int indexOf(Student s) {
        return s.getIndex();
    }

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

    @Override
    public void evaluateStudent(Student s) {
        s.evaluate();
    }

    @Override
    public void evaluateStudent(int index) {
        studentAt(index).evaluate();
    }

    @Override
    public void evaluateAll() {
        for(Student student : list)
        {
            student.evaluate();
        }
    }
}
