/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19685
 */
public class MAIN {
   
public static void main(String[] args){

    int Item=(int)(Math.random()*100);
    MyArrayList list=new MyArrayList(2);
    //list.InsertInOrder(Item);
    list.InsertInOrder(23);
    list.InsertInOrder(54);
    list.InsertInOrder(94);
    list.InsertInOrder(20);
    list.InsertInOrder(2);
    list.display();
    
}
}
