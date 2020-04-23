
package Stack;

/**
 *
 * @author Avenger316
 */
public class Stack {

   Node tope;
   
        public Stack(){
            this.tope=null;
        }
        
        public void stackPush(int x){
            Node n = new Node(x);
            
            if(stackCheck()){
                tope=n;
            }
            
            else{
                //System.out.println(tope.x);
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
