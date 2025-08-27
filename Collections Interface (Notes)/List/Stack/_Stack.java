import java.util.Stack;

class _Stack{

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Display the stack
        System.out.println(stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        stack.pop();
        System.out.println("After popping an element: " + stack);


        //Postion from the top
        System.out.println("Position of element 1 from the top: " + stack.search(1));
        
        // output is 4, as indexing is 1-based and counts from the top of the stack that is last element is considered as the first and first added element, bottom of the stack is considered as the last 



    }


}