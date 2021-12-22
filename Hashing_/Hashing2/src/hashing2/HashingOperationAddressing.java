/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashing2;

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
        LinearProbing LP=new LinearProbing(10);
        LinearProbing LP2=new LinearProbing(15);
        SeparateChaining<String> SC=new SeparateChaining(10);
        SeparateChaining<Integer> SC1=new SeparateChaining(15);
        LP.insert("apples");
        LP.insert("Banana");
        LP.insert("apricots");
        LP.insert("bluberries");
        LP.insert("mangoes");
        LP.insert("watermelon");
        LP.insert("blackcurrent");
        LP.insert("papaya");
        LP.insert("jelly");
       LP.displayTable();
       
       //LP2.displayTable();
        SC.insert("apples");
        SC.insert("Banana");
        SC.insert("apricots");
        SC.insert("bluberries");
        SC.insert("mangoes");
        SC.insert("watermelon");
        SC.insert("blackcurrent");
        SC.insert("papaya");
        SC.insert("jelly");
        SC.displayTable();
        
        //Seperate chaining for Integers
//        for(int i=0;i<100;i++){
//            int R=(int)(Math.random()*10000)+100;
//                System.out.println("R= "+R);
//                SC1.insert(R);
//        }
//    
//        SC1.displayTable();
                
        
    }
    
}
