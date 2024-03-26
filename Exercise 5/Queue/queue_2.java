package Queue;

/**
 * queue_1
 */
public class queue_2 {
    public static void main(String[] args) {
        Queue data = new Queue();
        
        System.out.println("Output : 1");

        data.enQueue(2002);
        data.enQueue(2003);
        data.enQueue(2004);

        data.show();

        System.out.println("\nOutput : 2");

        data.deQueue();
        data.show();

        System.out.println("\nOutput : 3");

        data.enQueue(2005);
        data.enQueue(2006);
        data.enQueue(2007);
        data.show();

        System.out.println("\nArray is Full : " + data.isFull());
        System.out.println("Array is Empty : " + data.isEmpty());
        System.out.println("Current array Size : " + data.getSize());
    }

    public static class Queue {

        int array_size = 5;
        int queue[] = new int[array_size];

        int rear;
        int front;
        int size;

        public void enQueue(int data) {
            if (!isFull()) {
                queue[rear] = data;
                rear = (rear + 1) % array_size;
                size = size + 1;
            }

            else {
                System.out.println("Queue is Full");
            }
            
        }

        public int deQueue() {
                int data = queue[front];
                
                front = (front + 1) % array_size;
                size = size - 1;

                return data;
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }
        
        public boolean isFull() {
            return size == array_size;
        }

        public void show() {
            for (int i = 0; i < size; i++) {
                System.out.println(queue[(front + i) % array_size]);
            }
        }
    }
}