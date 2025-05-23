import java.util.*;
public class demo{
    public static void main(String[] args){ 
      Queue<Integer> queue=new LinkedList<Integer>();
      queue.add(1);
      queue.add(3);
      queue.add(3);
      queue.add(1);
      int flag=1;

      Stack<Integer>st=new Stack<Integer>();
      for(int a:queue){
        st.push(a);
      }
      System.out.println(st);
      for(int a:queue){
        if(a!=st.pop()){
          flag=0;
          break;    
        }
      }
      if(flag==1){
        System.out.println("palindrome");
      }else{
        System.out.println("no");
      }
    }
}
