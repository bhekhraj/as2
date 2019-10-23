/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

/**
 *
 * @author b
 */
public class Assignment_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle var = new Rectangle();
        Rectangle vr = new Rectangle(5,6);
        Rectangle vrr = new Rectangle(6);
        System.out.println("area of var = "+var.area()+" mtr_sqr");
        System.out.println("area of vr = "+vr.area()+" mtr_sqr");
        System.out.println("area of vrr= "+vrr.area()+" mtr_sqr");
    }
    
}
