/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author DELL
 */
public class LAB6singly {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList MyList=new LinkedList();
        //MyList.toString();
        
        System.out.println("INSERT METHOD ");
        //insert method
        MyList.insert(45);
        MyList.insert(34);
        MyList.insert(44);
        MyList.insert(48);
        MyList.toString();
        
        System.out.println("FIND METHOD ");
        //find method
        MyList.find(34);
        MyList.toString();
        
        System.out.println("DELETE METHOD ");
        //delete method
        MyList.delete(34);
        MyList.toString();
        MyList.delete(45);
        MyList.toString();
        MyList.delete(48);
        MyList.toString();
        
        System.out.println("CLEAR METHOD ");
        //clear method
        MyList.clear();
        MyList.toString();
        
       
    }
}

