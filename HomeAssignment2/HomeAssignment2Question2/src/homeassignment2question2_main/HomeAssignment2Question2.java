/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2question2_main;

/**
 *
 * @author DELL
 */
public class HomeAssignment2Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //initially 5 banks are given
        arrayList bankList= new arrayList(10);
        bankList.addAccount("BankCodeA01");
        bankList.addAccount("BankCodeA02");
        bankList.addAccount("BankCodeA03");
        bankList.addTransaction("BankCodeA01", 300);
        bankList.addTransaction("BankCodeA01", 200);
        
        bankList.addAccount("BankCodeB11");
        bankList.addAccount("BankCodeB12");
        bankList.addTransaction("BankCodeB12", 8900);
        bankList.addTransaction("BankCodeB12", 1900);
        bankList.addAccount("BankCodeC21");
        bankList.addAccount("BankCodeC22");
        bankList.addTransaction("BankCodeC21", 300);
        bankList.addTransaction("BankCodeC21", 200);
        bankList.addAccount("BankCodeD31");
        
        bankList.addAccount("BankCodeE41");
        bankList.addTransaction("BankCodeE41", 8900);
        bankList.addTransaction("BankCodeE41", 1900);
        bankList.addAccount("BankCodeF51");
        bankList.addAccount("BankCodeF52");
        bankList.addAccount("BankCodeG61");
        
        bankList.addAccount("BankCodeH71");
        bankList.addAccount("BankCodeH72");
        bankList.addAccount("BankCodeI81");
        bankList.addTransaction("BankCodeI81", 700);
        bankList.addTransaction("BankCodeI81", 1000);
        
        System.out.println("Total Branches And Accounts They Have With Their Trasactions:");
        System.out.println(bankList.DisplayAccount());
        System.out.println("\n When trasactions are searched using account No.");
        bankList.AccList1.search("BankCodeA01");
        

    }
    
}
