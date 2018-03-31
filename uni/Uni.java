/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;
/**
 *
 * @author Piotr Socha
 * @author Bartosz Sadowski
 * @author Łysik Mateusz
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.*;

public class Uni extends JFrame implements ActionListener{

    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600; 
    
    
    private JButton bAddGroup = new JButton("+");
    private JButton bRemoveGroup = new JButton("-");
    private JButton bAddStudent = new JButton("+");
    private JButton bRemoveStudent = new JButton("-");
    private JButton bExit = new JButton("Exit");
    private JButton bEvaluate = new JButton("Evaluate");
    private JButton bEvaluateAll = new JButton("Evaluate all");
    private JLabel lStudent = new JLabel("Students:");
    private JLabel lGroup = new JLabel("Group:");
    private JTextArea tStudentScreen = new JTextArea();
    private JScrollPane spGroup =new JScrollPane();;
    
    public Uni(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("University");
        setLayout(null);
        
        //Buttons
        createAddRemoveButton(bAddGroup, 90,15, "Add Group");
        createAddRemoveButton(bRemoveGroup, 140,15, "Remove Group");
        createAddRemoveButton(bAddStudent, 320,15, "Add Student");
        createAddRemoveButton(bRemoveStudent,370,15, "Remove Student");
        
        createButton(bExit,450,500);
        createButton(bEvaluate,325,400);
        createButton(bEvaluateAll,450,400);
        
       //TextField
       createTextArea(tStudentScreen, 200,40,350,350);
       
       //Label
       createLabel(lStudent,200,10,100,25);
       createLabel(lGroup,10,10,100,25);
       
       //ScrollPane
       createScrollPane(spGroup,20,40,120,200);


    }
    
    public static void createAndShowGUI(){
        Uni uni = new Uni();
        uni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uni.setVisible(true);
    }
    
    public static void main(String[] args){
        createAndShowGUI();
    } 
    private void createAddRemoveButton(JButton name, int x, int y, String ToolTip){
       name.setBounds(x,y,41,20);
       name.setToolTipText(ToolTip);
       add(name);
       name.addActionListener(this);
       }
    
    private void createButton(JButton name, int x, int y){
       name.setBounds(x,y,100,20);
       add(name);
       name.addActionListener(this);
       }
    
    private void createTextArea(JTextArea name,int xp, int yp, int xk,int yk){
       name.setBounds(xp,yp,xk,yk);
       name.setEditable(false);
       name.setText("");
       add(name);
    }
    
    private void createLabel(JLabel name, int xp, int yp, int xk,int yk){
       name.setBounds(xp,yp,xk,yk);
       name.setForeground(new Color(0,180,180));
       name.setFont(new Font("SansSerif",Font.BOLD,20));
       add(name);
    }
    
    private void createScrollPane(JScrollPane name, int xp, int yp, int xk,int yk){
       name.setBounds(xp,yp,xk,yk);
       add(spGroup);

    }
    
    /// to odpowiada za reakcje guzikow
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source == bAddStudent){
            System.out.println("cos");
            String imie= showInputDialog("Podaj imie:");
            Student student = new Student(imie, imie);
            
            String text = tStudentScreen.getText();
            tStudentScreen.setText(text+ student.getName() + "\n");
        }
        else if(source == bRemoveStudent){
            
        }
        else if(source == bExit){
          dispose();
        }
    }
    
}
