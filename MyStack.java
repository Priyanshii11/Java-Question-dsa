import java.util.*;
public class MyStack {

  
}
class Main{
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(4);
    stack.push(2);
    stack.push(3);

    System.out.println(stack);

    stack.pop();
    System.out.println(stack);
  }

}
