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
public class Uni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student Kamil = new Student ("Kamil", "wes", 12, 11);
        System.out.println(Kamil.getName());
        for(int i =0;i<20;i++)
        {
        Kamil.evaluate();
        System.out.println(Kamil.getGrade());
        }
    }
    
}
