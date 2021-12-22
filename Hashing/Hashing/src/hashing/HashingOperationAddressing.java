/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing;

/**
 *
 * @author DELL
 */
public class HashingOperationAddressing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinearProbing  LP=new LinearProbing(100);
        for(int i=0;i<100;i++){
            int R=(int)(Math.random()*10000)+100;
                System.out.println("R= "+R);
                LP.insert(R);
        }
        LP.displayTable();
        
        QuadraticProbing  QP=new QuadraticProbing(100);
        for(int i=0;i<100;i++){
            int R=(int)(Math.random()*10000)+100;
                System.out.println("R= "+R);
                QP.insert(R);
        }
        QP.displayTable();
    }
    
}
