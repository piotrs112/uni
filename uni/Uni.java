/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;
/**
 *
 * @author Piotr Socha, Bartosz Sadowski, Łysik Mateusz
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import static javax.swing.JOptionPane.*;

public class Uni extends JFrame implements ActionListener{

    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600; 
    
    private int y=5, x=20;                            //do tworzenia przyciskow
    
    private JButton bAddGroup, bRemoveGroup, bAddStudent, bRemoveStudent, bExit;
    private JTextArea tStudentScreen;
    private JScrollPane spGroup;
    
    private Uni(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle("University");
        setLayout(null);
        
        //Buttons
        createButton(bAddGroup, "Add group", x,++y*50);
        createButton(bRemoveGroup, "Remove group", x,++y*50);
        createButton(bAddStudent, "Add student", x,++y*50);
        
        createButton(bRemoveStudent, "Remove student",x,++y*50);
        createButton(bExit, "Exit",x,++y*50);
        
       //TextField
       createTextArea(tStudentScreen, 200,20,FRAME_WIDTH-60,FRAME_HEIGHT-200);
       
       
       spGroup=new JScrollPane();
       spGroup.setBounds(20,20,120,200);
       add(spGroup);

    }
    
    private static void createAndShowGUI(){
        Uni uni = new Uni();
        uni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uni.setVisible(true);
    }
    
    public static void main(String[] args){
        createAndShowGUI();
    } 
    private void createButton(JButton name, String description, int x, int y){
       name= new JButton(description);
       name.setBounds(x,y,130,20);
       add(name);
       name.addActionListener(this);
       }
    
    private void createTextArea(JTextArea name,int xp, int yp, int xk,int yk){
       name = new JTextArea();
       name.setBounds(xp,yp,xk,yk);
       name.setEditable(false);
       name.setText("");
       add(name);
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
        if(source == bRemoveStudent){
            
        }
        if(source == bExit){
          dispose();
        }
    }
    
}
