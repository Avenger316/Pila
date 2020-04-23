/*
Class Stack v1 created by Avenger316
this bassically is the stack class where the methods are created
the fundamental operantions in this Stack is  push, pop, print it, check if the stack is empty, and its size.

*/
package Stack;
 // @author Avenger316

public class Stack {

   Node tope;
   
        public Stack(){
            this.tope=null;
        }
        
        public void stackPush(int x){
            /*
                Here a valued is added at the top of the stack and its saved as tope
            */
            
            Node n = new Node(x); 
            
            if(stackCheck()){
                tope=n;
            }
            
            else{
               n.ant=tope;
               tope=n;
            } 
                }
        
        public void stackPop(){
            tope=tope.ant;
        }
        
        public void stackPrint(){
            Node x = tope;
      
          if(!stackCheck())
            while(x!=null){

                System.out.println("["+x.x+"]");
                x=x.ant;
            }
            System.out.println("---");
                
         
        }
        
        public void stackCount(){
            int count=0;
            Node x = tope;
            if(stackCheck())
                System.out.println("The stack is empty");
            else
                while(x!=null){
                    
                    count++;
                    x=x.ant;
                }
            System.out.println(count+" elements were found in the Stack");
        }
  
        public boolean stackCheck(){
            return (this.tope==null);
        }
    
     
}
