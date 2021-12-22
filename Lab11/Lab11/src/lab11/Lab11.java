/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author DELL
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArraybasedPriorityQueue APQ=new  ArraybasedPriorityQueue (7);
         LinkedListbasedPriorityQueue LPQ=new LinkedListbasedPriorityQueue();
         System.out.println(" ARRAY ENQUEUE METHOD");
        APQ.Enqueue(45);
        APQ.Enqueue(23);
        APQ.Enqueue(89);
       APQ.Enqueue(9);
         APQ.Enqueue(3);
         APQ.Enqueue(2);
         APQ.Enqueue(67);
         APQ.print();
         
         System.out.println(" ARRAY DEENQUEUE METHOD");
         APQ.Dequeue();
         APQ.Dequeue();
         APQ.Dequeue();
         APQ.Dequeue();
         APQ.Dequeue();
         
         APQ.print();
         
         System.out.println(" ARRAY PEEK METHOD");
         System.out.println(APQ.peek());
         
         System.out.println(" LINKED LIST ENQUEUE METHOD");
         LPQ.Enqueue(56);
         LPQ.Enqueue(32);
         LPQ.Enqueue(45);
         LPQ.Enqueue(60);
         LPQ.Enqueue(6);
         LPQ.printQueue();
         
         System.out.println(" LINKED LIST PEEK METHOD");
         LPQ.peek();
         
         System.out.println(" LINKED LIST DEENQUEUE METHOD");
         LPQ.Dequeue();
         LPQ.Dequeue();
         LPQ.Dequeue();
         
         LPQ.printQueue();
         
         
    }
    
}
