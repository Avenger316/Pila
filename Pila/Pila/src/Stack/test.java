 // @author Avenger316
package Stack;

public class test {
    
     public static Stack p = new Stack();
     
        public static void main(String args[]){
            
            p.stackPush(56);
            p.stackPush(26);
            p.stackPush(117);
            p.stackPush(13);
            p.stackPrint();
            p.stackPop();
            p.stackPop();
            p.stackPush(52);
            p.stackPush(32);
            p.stackPrint();
            p.stackCount();
        }
    
}
