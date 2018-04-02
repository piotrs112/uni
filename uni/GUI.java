package uni;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
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

    public GUI() {
        this.setMinimumSize(new Dimension(400,300));

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
        frame.setContentPane(new GUI().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
