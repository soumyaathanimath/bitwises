/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwisess;

/**
 *
 * @author dell1
 */
public class Bitwisess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*int x=10, y=6,z;
        z=x&y;
        System.out.println(z);*/
        
        
        /*int x=0b1010, y=0b0110,z;
        z=x|y;  //x^y
        System.out.println(z);*/
        
        
        /*int x=0b1000;
        int y;
        y=x<<1; //x<<2 //x>>1 //x>>2
        System.out.println(y);*/
        
        int x=0b1010; //tried with + and -
        int y;
        y=x+1; //~x
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
    }
    
}
