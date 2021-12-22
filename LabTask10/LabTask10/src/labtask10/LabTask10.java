/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask10;

/**
 *
 * @author DELL
 */
public class LabTask10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    QueueArrayBase QA=new QueueArrayBase<Integer>(6);
    QueueArrayBase QA2=new QueueArrayBase<String>(6);
    QA.Enqueue(23);
    QA.Enqueue(43);
    QA.Enqueue(36);
    QA.Enqueue(24);
    QA.Enqueue(10);
    System.out.println("For Integer Value, ENQUEUE METHOD, ARRAY BASE");
    QA.printQueue();
    System.out.println("For Integer Value, DEQUEUE METHOD, ARRAY BASE");
    QA.Dequeue();
    QA.Dequeue();
    QA.Dequeue();
    QA.Dequeue();
    QA.Dequeue();
    QA.Dequeue();
    QA.printQueue();
    QA2.Enqueue("Task1");
    QA2.Enqueue("Task2");
    QA2.Enqueue("Task3");
    QA2.Enqueue("Task4");
    QA2.Enqueue("Task5");
   System.out.println("For String Value, ENQUEUE METHOD, ARRAY BASE");
    QA2.printQueue();
    System.out.println("For String Value, DEQUEUE METHOD, ARRAY BASE");
    QA2.Dequeue();
    QA2.Dequeue();
    QA2.Dequeue();
    QA2.Dequeue();
    QA2.Dequeue();
    QA2.printQueue();
    QueueLinkedList QLL1=new QueueLinkedList<Integer>();
    QueueLinkedList QLL2=new QueueLinkedList<String>();
    
    QLL1.Enqueue(23);
    QLL1.Enqueue(43);
    QLL1.Enqueue(36);
    QLL1.Enqueue(24);
    QLL1.Enqueue(10);
    System.out.println("For Integer Value, ENQUEUE METHOD, LINKED LIST BASE");
    System.out.println(QLL1.printQueue());
    System.out.println("For Integer Value, DEQUEUE METHOD, LINKED LIST BASE");
    QLL1.Dequeue();
    QLL1.Dequeue();
    QLL1.Dequeue();
    System.out.println(QLL1.printQueue());
    QLL2.Enqueue("Task1");
    QLL2.Enqueue("Task2");
    QLL2.Enqueue("Task3");
    QLL2.Enqueue("Task4");
    QLL2.Enqueue("Task5");
   System.out.println("For String Value, ENQUEUE METHOD, LINKED LIST BASE");
    System.out.println(QLL2.printQueue());
    System.out.println("For String Value, DEQUEUE METHOD, LINKED LIST BASE");
    QLL2.Dequeue();
    QLL2.Dequeue();
    QLL2.Dequeue();
    QLL2.Dequeue();
    QLL2.Dequeue();
    System.out.println(QLL2.printQueue());
    
    
    
    
    }
    
}
