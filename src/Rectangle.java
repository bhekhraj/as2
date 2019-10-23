/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;
 
 /**
 *
 * @author Manpreet
 */
public class Rectangle {
     private float height;
        private float breadth;
        public float area(){
            float area = height*breadth;
            return area;
        }
    Rectangle(){
        height=0;
        breadth=0;
    }
    Rectangle(float a,float b){
        height=a;
        breadth=b;
    }
    Rectangle(float a){
        height=a;
        breadth=a;
    }
}
