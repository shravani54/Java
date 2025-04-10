import java.util.Scanner;

public class StackQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[5], queue = new int[5];
        int top = -1, front = 0, rear = 0;

        while (true) {
            System.out.println("\n1.Push 2.Pop 3.Enqueue 4.Dequeue 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (top == 4) System.out.println("Stack Full");
                    else stack[++top] = sc.nextInt();
                    break;

                case 2:
                    if (top == -1) System.out.println("Stack Empty");
                    else System.out.println("Popped: " + stack[top--]);
                    break;

                case 3:
                    if (rear == 5) System.out.println("Queue Full");
                    else queue[rear++] = sc.nextInt();
                    break;

                case 4:
                    if (front == rear) System.out.println("Queue Empty");
                    else System.out.println("Dequeued: " + queue[front++]);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
