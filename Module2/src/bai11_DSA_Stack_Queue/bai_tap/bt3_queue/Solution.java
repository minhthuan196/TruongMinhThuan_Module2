package bai11_DSA_Stack_Queue.bai_tap.bt3_queue;

public class Solution {
    Node node = new Node();
    Queue queue = new Queue();

    public void enQueue() {
        node.setData(10);
        if (queue.font == null) {
            queue.font = node;
            queue.rear = node;
        } else {
            queue.rear = node;
        }
    }

    public void deQueue() {
        if (queue.font == null) {
            if (queue.font == queue.rear) {
                queue.font = null;
                queue.rear = null;
            } else {
                queue.font = queue.rear;
            }
        }
    }

}
