/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author 19685
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static Boolean validate(String exp) {
		
		LinkedListBasedStack<Character> s = new LinkedListBasedStack<Character>();
		
		for(int i = 0; i < exp.length(); i++) {
			if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{')
				s.PUSH(exp.charAt(i));
			if(exp.charAt(i)==')'||exp.charAt(i)==']'||exp.charAt(i)=='}') {
				if(s.isEmpty())
					return false;
				else {
					if((s.top.info=='('&& exp.charAt(i)==')')||(s.top.info=='['&& exp.charAt(i)==']')||(s.top.info=='{'&& exp.charAt(i)=='}')){
						s.POP();
					}
					else 
						return false;
				}
			}
				
		}
			
		
		if(!s.isEmpty())
			return false;
		return true;
	}

	public static void main(String[] args) {
	
		System.out.println("The Expression is valid: "+validate("2+[3-5-(555+77)"));
                System.out.println("The Expression is valid: "+validate("2+[3-5-(555+777))"));
                System.out.println("The Expression is valid: "+validate("2+[3-5-(555+77)]"));

		// testing Stack as Array
		ArrayBasedStack<Integer> s = new ArrayBasedStack<Integer>(4);
               
//		System.out.println(s.isEmpty());
//		System.out.println(s.POP());
//		s.PUSH(3);
//		s.PUSH(5);
//		s.PUSH(4);
//		s.PUSH(6);
//		System.out.println(s.isEmpty());
//		System.out.println(s.isFull());
//		System.out.println(s.POP());
//		System.out.println(s.isFull());
//		s.PUSH(4);
//		System.out.println(s.isFull());

		

	}
}