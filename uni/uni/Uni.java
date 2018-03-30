/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Piotr Socha, Bartosz Sadowski, Łysik Mateusz
 */
public class Uni extends JFrame implements ActionListener{

    private JButton bAddGrade, bExit;
    private JLabel lStudentScreen;
    
    
    
    public Uni(){
        setSize(600,600);
        setTitle("University");
        setLayout(null);
        bAddGrade = new JButton("Wstaw ocenę");
        bAddGrade.setBounds(100,100,100,20);
        add(bAddGrade);
        bAddGrade.addActionListener(this);
        
        bExit = new JButton("Wyjscie");
        bExit.setBounds(250,50,100,20);
        add(bExit);
        bExit.addActionListener(this);
        
        lStudentScreen = new JLabel("Studenci:");
        lStudentScreen.setBounds(50,150,150,20);
        lStudentScreen.setForeground(Color.BLUE);
        lStudentScreen.setFont(new Font("SansSerif",Font.BOLD,20));
        add(lStudentScreen);
        
        
    }
    public static void main(String[] args)
    {
        Uni uni = new Uni();
        uni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // wyłącza po wcisnieciu krzyżyka
        uni.setVisible(true);
    } 
    
    @Override
    public void actionPerformed(ActionEvent e){         // funkcja służąca do
        Object source = e.getSource();                  // odczytuje skad pochodzi źródło
        if(source == bAddGrade){
            
        }
        else if(source == bExit){
            dispose();
        }
    }
    
}
