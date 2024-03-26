package Queue;

/**
 * queue_1
 */
public class queue_1 {
    public static void main(String[] args) {
        Queue data = new Queue();
        
        System.out.println("Output : 1");

        data.enQueue(2002);
        data.enQueue(2003);
        data.enQueue(2004);

        data.show();

        System.out.println("Output : 2");

        data.deQueue();
        data.show();

        System.out.println("Output : 3");

        data.enQueue(2005);
        data.enQueue(2006);
        data.enQueue(2007);
        data.show();

        System.out.println(data.isFull());
        System.out.println(data.isEmpty());
        System.out.println("Size : " + data.getSize());
    }

    public static class Queue {
        int queue[] = new int[5];

        int rear;
        int front;
        int size;

        public void enQueue(int data) {
            queue[rear] = data;
            rear = rear + 1;
            size = size + 1;
        }

        public int deQueue() {
            if (size == 0) {
                System.out.println("Queue is empty");

                return -1;
            } 
            
            else {
                int data = queue[front];
                
                for (int i = 0; i < size - 1; i++) {
                    queue[i] = queue[i + 1];
                }

                rear--;

                size--;

                return data;
            }
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }
        
        public boolean isFull() {
            return size == 5;
        }
        

        public void show() {
            for (int i = 0; i < size; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}