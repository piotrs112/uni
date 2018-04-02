package uni;

import javafx.scene.control.SelectionMode;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class gui2 extends JFrame {
    private JList groupList;
    private JList studentsList;
    private JButton addGroup;
    private JButton removeGroup;
    private JButton addStudent;
    private JButton removeStudent;
    private JPanel groupPanel;
    private JPanel main;
    private JPanel studentsPanel;
    private JToolBar studentsTools;
    private JToolBar groupTools;
    private JLabel groupLabel;
    private JLabel studentLabel;

    public gui2() {
        //setup
        newButton(addGroup, "Dodaj grupe", 'k');
        newButton(removeGroup, "Usun grupe", 'l');
        newButton(addStudent, "Dodaj studenta", 'n');
        newButton(removeStudent, "Usun studenta", 'm');

        ArrayList list = new ArrayList<Group>();
        list.add(new Group("pierwsza"));
        list.add(new Group("druga"));
        list.add(new Group("trzecia"));

        newList(groupList, list);
        this.add(groupList);


        //ustawia minimalny rozmiar okna
        this.setMinimumSize(new Dimension(400, 300));

        //action listenery przyciskow + -
        addGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        removeGroup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        removeStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //action listenery wyboru list
        groupList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });

        studentsList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String s = studentLabel.getText();
                JOptionPane.showMessageDialog(null, s);
            }
        });

    }


    private void newButton(JButton b, String desc, char key) {
        b = new JButton(desc);
        b.setMnemonic(key);
    }

    private void newList(JList l, ArrayList list) {
        Object[] data = list.toArray();
        l = new JList(data);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        l.setLayoutOrientation(JList.VERTICAL);
    }


    public static void main(String args[]) {
        try {
            // Set OS-native look and feel
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // handle possible exceptions
            System.out.println(e.getMessage());
        }




        JFrame frame = new JFrame("GUI_test");
        frame.setContentPane(new gui2());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
