package uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * <code>Uni</code> class is hearth of our project. In it all methods from other classes are presented.
 * 
 * @author Piotr Socha
 * @author Bartosz Sadowski
 * @author Mateusz Lysik
 */

public class Uni {
    public static void main(String args[]){
        List<Group> all = new ArrayList<>();
        Group pierwsza = new Group("Pierwsza");
        all.add(pierwsza);
        Group druga = new Group("Druga");
        Group trzecia = new Group("Trzecia");
        all.add(druga);
        all.add(trzecia);
        System.out.println("Najpierw zaprezentujemy pierwsze stworzone grupy");
        for(Group group: all)
        {
            System.out.println(group.toString());
        }
        Student michal = new Student("Michal", "Bogoslawski");
        if(pierwsza.addStudent(michal))
        {
            System.out.println("Do grupy 1 został dodany student. Teraz jej liczebność to: ");
            System.out.println(pierwsza.getGroupSize());
        }
        Student bartosz = new Student("Bartosz", "Sadowski");
        Student piotr = new Student("Piotr", "Socha");
        Student mateusz = new Student("Mateusz", "Lysik");
        pierwsza.addStudent(bartosz);
        pierwsza.addStudent(piotr);
        druga.addStudent(mateusz);
        System.out.println("Aktalna liczba istniejacych studentów: " + Student.getNumberOfStudents() + ". Liczebność grup po kolei to: ");
        for(Group group: all)
        {
            System.out.println(group.toString() + " " + group.getGroupSize());
        }
        Student klaudiusz = new Student("Klaudiusz", "Marzanna");
        System.out.println(klaudiusz.getName() + " " + klaudiusz.getIndex() + " " + klaudiusz.getGrade());
        klaudiusz.setName("Klaudiusz Wiosna");
        klaudiusz.evaluate();
        System.out.println(klaudiusz.getName() + " " + klaudiusz.getIndex() + " " + klaudiusz.getGrade());
        klaudiusz.setGrade((float)3.5);
        System.out.println(klaudiusz.getGrade());
        for(int i=1; i<=Student.getNumberOfStudents(); i++)
        {
            try{
                System.out.println(pierwsza.studentAt(i).getName());
            }
            catch (NullPointerException npe) {
                System.out.println("Student o indeksie " + i + "nie nalezy do grupy pierwszej");
            }                    
        }
        druga.addStudent(klaudiusz);
        for(Group group: all)
        {
           if(group.isMember(klaudiusz))
           {
               System.out.println(klaudiusz.getName() + "należy do grupy:" + group.toString());
           }
        }
        for(int i=0; i<pierwsza.getGroupSize(); i++)
        {
            System.out.println(pierwsza.getStudent(i).getName());
        }
        pierwsza.removeStudent(michal);
        System.out.println();
        for(int i=0; i<pierwsza.getGroupSize(); i++)
        {
            System.out.println(pierwsza.getStudent(i).getName());
        }
        System.out.println("W grupie pierwszej są studenci o numerach indeksu: ");
        for(int i=1; i<=Student.getNumberOfStudents();i++){
            if(pierwsza.isMember(pierwsza.studentAt(i)))
            {
                System.out.println(i);
            }
        }
        druga.evaluateStudent(klaudiusz);
        System.out.println(klaudiusz.getGrade());
        druga.evaluateStudent(5);
        System.out.println(klaudiusz.getGrade());
        pierwsza.evaluateAll();
        for(int i=0; i<pierwsza.getGroupSize(); i++)
        {
            System.out.println( pierwsza.getStudent(i).getName() + " " + pierwsza.getStudent(i).getGrade());
        }
        System.out.println("Dziękuję za uwagę.");
    }
}
