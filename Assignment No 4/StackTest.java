public class StackTest {

    interface Stack {
        int size = 5; 
        void push(int element);
        int pop();
        void display();
        boolean overflow();
        boolean underflow();
    }

    static class IntegerStack implements Stack {
        private int[] stack;
        private int top;

        public IntegerStack() {
            stack = new int[size];
            top = -1;
        }

        @Override
        public void push(int element) {
            if (overflow()) {
                System.out.println("Stack Overflow! Cannot push " + element);
            } else {
                stack[++top] = element;
                System.out.println("Pushed: " + element);
            }
        }

        @Override
        public int pop() {
            if (underflow()) {
                System.out.println("Stack Underflow! Cannot pop.");
                return -1;
            } else {
                int popped = stack[top--];
                System.out.println("Popped: " + popped);
                return popped;
            }
        }

        @Override
        public void display() {
            if (underflow()) {
                System.out.println("Stack is empty.");
            } else {
                System.out.print("Stack elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(stack[i] + " ");
                }
                System.out.println();
            }
        }

        @Override
        public boolean overflow() {
            return top >= size - 1;
        }

        @Override
        public boolean underflow() {
            return top < 0;
        }
    }

    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();

        myStack.pop();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60); 

        myStack.display();

        myStack.pop();
        myStack.pop();

        myStack.display();
    }
}
