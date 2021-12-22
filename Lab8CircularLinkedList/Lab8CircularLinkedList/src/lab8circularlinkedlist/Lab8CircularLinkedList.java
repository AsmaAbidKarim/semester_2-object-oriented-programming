/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8circularlinkedlist;

/**
 *
 * @author DELL
 */
public class Lab8CircularLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     JosephusProblem_Game Player=new JosephusProblem_Game();
     //Player.insert("sadaf");
     Player.insert("Asma");
     Player.insert("Maham");
     Player.insert("Sajid");
     Player.insert("Akram");
     Player.insert("Amna");
     Player.insert("Ali");
     System.out.println("Player List: "  +Player.toString());
     Player.PlayGame();
    }
    
}
