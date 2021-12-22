/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.task.pkg14;

/**
 *
 * @author DELL
 * 
 */
public interface InBinaryTree <T>{
  public void insert(T d);
 public int find(T d);
 public void traverse(String s);
 public void delete(T d);
 public int countleaf();
 public int height();

}
