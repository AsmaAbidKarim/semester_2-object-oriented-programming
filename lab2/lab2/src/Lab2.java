/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Item=(int)(Math.random()*100);
    GenetricArrayList<Integer> list=new GenetricArrayList(3);
    //list.InsertInOrder(Item);
    System.out.println("  Add Metthod");
    list.add(23);
    list.add(54);
    list.add(94);
    list.add(20);
    list.add(10);
    list.add(1);
    //list.add(Item);
    System.out.println(list);
    System.out.println("  Find Method");
    list.Find(10);
    list.Find(54);
    
    System.out.println("  Get Method");
    System.out.println(list.get(3));
    System.out.println(list.get(2));
    
    System.out.println("  Update Method ");
    list.update(3,34);
    list.update(2,67);
    System.out.println(list);
    System.out.println("  Remove Method");
    list.remove(10);
    System.out.println(list);
    
    
     GenetricArrayList<String> L1=new GenetricArrayList(3);
   
    L1.add("Apple");
    L1.add("Watermelon");
    L1.add("Banana");
    L1.add("Grapes");
    L1.add("Peach");
    System.out.println(L1);
    System.out.println("Clear Method");
    L1.clear();
    System.out.println(L1);
    
    
    }
    
}
