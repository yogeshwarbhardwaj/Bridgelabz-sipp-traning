import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueUsingStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int item) {
        enqueueStack.push(item);
    }

    // Dequeue operation
    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if (dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return dequeueStack.pop();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.dequeue()); // Output: 20

        queue.enqueue(40);
        System.out.println(queue.dequeue()); // Output: 30
        System.out.println(queue.dequeue()); // Output: 40
    }
}