
import java.util.Scanner;
import java.util.Stack;
public class MyStk {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element (Delete)");
            System.out.println("3. Search for an element");
            System.out.println("4. Display the stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Push operation
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println(element + " pushed onto the stack.");
                    break;
                    
                case 2:
                    // Pop operation (Delete)
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. No elements to pop.");
                    } else {
                        int poppedElement = stack.pop();
                        System.out.println(poppedElement + " popped from the stack.");
                    }
                    break;
                    
                case 3:
                    // Search operation
                    System.out.print("Enter element to search: ");
                    int searchElement = scanner.nextInt();
                    int position = stack.search(searchElement);
                    
                    if (position == -1) {
                        System.out.println(searchElement + " not found in the stack.");
                    } else {
                        System.out.println(searchElement + " found at position " + position + " from the top of the stack.");
                    }
                    break;
                    
                case 4:
                    // Display stack
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements: " + stack);
                    }
                    break;
                    
                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}

