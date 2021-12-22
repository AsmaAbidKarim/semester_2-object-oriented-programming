/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeassignment2question2_main;

/**
 *
 * @author DELL
 * @param <T>
 */

public class arrayList<T extends Comparable<T>>{
    T[] Arr;//a list
    int CurrInd;//to where it's getting
    Account AccList1=new Account();
    Account AccList2=new Account();
    Account AccList3=new Account();
    Account AccList4=new Account();
    Account AccList5=new Account();
    Account AccList6=new Account();
    Account AccList7=new Account();
    Account AccList8=new Account();
    Account AccList9=new Account();
    Account AccList10=new Account();
    
    arrayList(){
        Arr= (T[])new String[10];
        CurrInd=-1;
    }
    arrayList(int size){
        Arr=(T[])new String[size];
        CurrInd=-1;
    }
    public void displayTotalBranches(){ //bigOh=constant
        String str="";
        for (T Arr1 : Arr) {
            System.out.print("\n"+ str);
            System.out.print(Arr1 + str);
        }
    }
    public  String DisplayAccount() { //bigOh=constant
		String s = "";
		//return s;
                
		return s +"\n"+"The Accounts Of Branch A :"+ AccList1.toString()+"\n\n"+"The Accounts Of Branch B :"+ AccList2.toString()+"\n\n"+"The Accounts Of Branch C :"+AccList3.toString()
                        +"\n\n "+"The Accounts Of Branch D :"+ AccList4.toString()+"\n\n"+"The Accounts Of Branch E :"+AccList5.toString()+"\n\n"+"The Accounts Of Branch F :"+ AccList6.toString()
                        +"\n\n"+"The Accounts Of Branch G :"+AccList7.toString()+"\n\n"+"The Accounts Of Branch H :"+ AccList8.toString()+"\n\n"+"The Accounts Of Branch I :"+AccList9.toString()
                        +"\n\n "+"The Accounts Of Branch J :"+ AccList10.toString();
	}
    public String BrCodeInt(String Acc) {
		String n=Acc;
		n=""+n.substring(0, 9);
		
		return n;
	}
    public int SearchBranchCode(String Acc) { //bigOh=constant
		String code = BrCodeInt(Acc);
        switch (code) 
        { 
        case "BankCodeA":
            return 0;      
        case "BankCodeB": 
            return 1;
        case "BankCodeC": 
            return 2;
        case "BankCodeD": 
            return 3;
        case "BankCodeE": 
            return 4;
       case "BankCodeF": 
            return 5;
        case "BankCodeG": 
            return 6;  
        case "BankCodeH": 
            return 7;
        case "BankCodeI": 
            return 8;
        case "BankCodeJ": 
            return 9;
        default: 
            System.out.println("Branch Is not found, therefore does not exist"); 
            return -1;
        } 
	}
   public void addAccountToBankCode(String Acc) { //bigOh=constant
		//System.out.println(""+this.SearchBranch(Acc));
		int branchCode = this.SearchBranchCode(Acc);
		switch (branchCode) 
        { 
        case 0: 
        	AccList1.insert(Acc);
        	break;
        case 1: 
        	AccList2.insert(Acc);
        	break;
       case 2: 
        	AccList3.insert(Acc);   
        	break;
        case 3: 
        	AccList4.insert(Acc);
        	break;
        case 4: 
        	AccList5.insert(Acc);   
        	break;
        case 5: 
        	AccList6.insert(Acc);
        	break;
        case 6: 
        	AccList7.insert(Acc);   
        	break;
        case 7: 
        	AccList8.insert(Acc);
        	break;
        case 8: 
        	AccList9.insert(Acc);   
        	break;
        case 9: 
        	AccList10.insert(Acc);
        	break;
        default: 
           System.out.println("Branch not found."); 
            
        }
   }
public void AddBranchesHead() {	 //bigOh=constant
		
	Arr[0]= (T) AccList1.head;
	Arr[1]= (T) AccList2.head;
	Arr[2]= (T) AccList3.head;
        Arr[3]= (T) AccList4.head;
        Arr[4]= (T) AccList5.head;
        Arr[5]= (T) AccList6.head;
        Arr[6]= (T) AccList7.head;
        Arr[7]= (T) AccList8.head;
        Arr[8]= (T) AccList9.head;
        Arr[9]= (T) AccList10.head;
}
    
    //Account Alist=new Account();
public void addTransaction(String Acc,int amount) { //bigOh=constant
		
			
    int branchCode = this.SearchBranchCode(Acc);
        switch (branchCode)
        { 
            case 0: 
                AccList1.addTrans(Acc, amount);
                break;
	    case 1: 
                AccList2.addTrans(Acc, amount);
	        break;
            case 2: 
                AccList3.addTrans(Acc, amount);
                break;
	    case 3: 
                AccList4.addTrans(Acc, amount);
	        break;
	    case 4: 
                AccList5.addTrans(Acc, amount);
                break;
	    case 5: 
                AccList6.addTrans(Acc, amount);
	        break; 
            case 6: 
                AccList7.addTrans(Acc, amount);
                break;
	    case 7: 
                AccList8.addTrans(Acc, amount);
	        break;
            case 8: 
                AccList9.addTrans(Acc, amount);
                break;
	    case 9: 
                AccList10.addTrans(Acc, amount);
	        break;
	    default: 
                System.out.println("Branch or Account not found."); 
	            
	        } 
		
	}
public void addAccount(String Acc) { //bigOh=constant
		//System.out.println(""+this.SearchBranch(Acc));
		int brrcode = this.SearchBranchCode(Acc);
		switch (brrcode) 
        { 
        case 0: 
        	AccList1.insert(Acc);   
        	break;
        case 1: 
        	AccList2.insert(Acc);
        	break;
        case 2: 
        	AccList3.insert(Acc);   
        	break;
        case 3: 
        	AccList4.insert(Acc);
        	break;
        case 4: 
        	AccList5.insert(Acc);   
        	break;
        case 5: 
        	AccList6.insert(Acc);
        	break;
        case 6: 
        	AccList7.insert(Acc);   
        	break;
        case 7: 
        	AccList8.insert(Acc);
        	break;
        case 8: 
        	AccList9.insert(Acc);   
        	break;
        case 9: 
        	AccList10.insert(Acc);
        	break;
       
        default: 
           System.out.println("Branch Is not found, therefore does not exist"); 
            
        }
	}

    public void InsertInOrder(T item) //bigOh=n
    {
        
        if(CurrInd==-1){
        CurrInd++;
        Arr[CurrInd]=item;
        
        }
        else if(CurrInd==Arr.length-1){
            T[] NewArr = (T[])new Object[2*Arr.length];
            //System.arraycopy(Arr, 0, NewArr, 0, Arr.length);
            for(int i=0;i<Arr.length;i++){
                    NewArr[i]=Arr[i];
                }
            Arr=NewArr;//moving the pointer to Arr
            
        }
        else if (item.compareTo(Arr[CurrInd])>0){
            CurrInd++;
            Arr[CurrInd]=item;
            
        }
        else if (item.compareTo(Arr[CurrInd])<0)
            {
                for(int i=CurrInd;i>=0;i--)
                {   if(item.compareTo(Arr[i])<0)
                    Arr[i+1]=Arr[i];
                    Arr[i]=item;
                
                }
                CurrInd++;
               
            }
    }
    
}
