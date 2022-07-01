package lab3006; 
  
 public class ElementOutOfBoundException extends Exception { 
  
         public ElementOutOfBoundException() { 
                 super(); 
                 System.out.println("Number Shouldn't be greater than Last limit value"); 
         } 
          
  
 }
