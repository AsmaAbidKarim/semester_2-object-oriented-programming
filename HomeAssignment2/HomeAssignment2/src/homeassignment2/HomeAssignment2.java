/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2;

/**
 *
 * @author DELL
 */
public class HomeAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        polynomial p1=new polynomial();
        polynomial p2=new polynomial();
        polynomial p3=new polynomial();
        polynomial result=new polynomial();
 //**********3x^2 + 4x +10 ******* // insert polynomial expression p1
        //the given equation are set in an ascending order
        System.out.print(" 1st Polynomial"+": ");
        p1.insert(3, 2);
        p1.insert(4, 1);
        p1.insert(10, 0);
        p1.displayEquation();
//************2x^2 - 2x +4 ******* // insert polynomial expression p2
        //p2.insert(4, 3);
        System.out.print(" 2nd Polynomial"+": ");
        //sorted by insert method
        p2.insert(2, 0);
        p2.insert(8, 1);
        p2.insert(4, 2);
        p2.displayEquation();
//******* now add polynomials p1 and p2********
        result.addition(p1, p2);
// ***********display the result of addition***********
        System.out.print("Polynomial after addition"+": ");
        result.displayEquation();
//**********5x^4+4x^3+3x^2 + 4x +10 ******* // insert polynomial expression p1 
        System.out.println(" When Unequal no of terms ");
        System.out.print(" 1st Polynomial"+": ");
        p3.insert(5, 4);
        p3.insert(4, 3);
        p3.insert(3, 2);
        p3.insert(4, 1);
        p3.insert(10, 0);
        p3.displayEquation();
//************2x^2 - 2x +4 ******* // insert polynomial expression p2
        //p2.insert(4, 3);
        System.out.print(" 2nd Polynomial"+": ");
        p1.clear();
        result.clear();
        p1.insert(2, 2);
        p1.insert(-2, 1);
        p1.insert(4, 0);
        p1.displayEquation();
//******* now add polynomials p1 and p2********
        result.addition(p3, p1);
// ***********display the result of addition***********
        System.out.print("Polynomial after addition"+": ");
        result.displayEquation();
    }
    }
    

