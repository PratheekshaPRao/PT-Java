
package DS;
public class Queue {
    int size=5;
    int[] queue=new int[size];
    int front=-1;
    int rear=-1;
    void enqueue(int x){
        if(front==0 && rear==size-1){
            System.out.println("Queue is full!");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            queue[rear]=x;
            System.out.println(x+"Inserted into the queue");
        }
    }
    void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Empty!");
        }
        else if(front==rear){
            System.out.println(queue[front]+" "+"deleted");
            front=-1;
            rear=-1;
        }
        else{
            System.out.println(queue[front]+" "+"deleted");
            front++;
        }
    }
    int topelement(){
        return queue[rear];
    }
    int size(){
        return rear+1;
    }
    boolean isempty(){
        if(front==-1 && rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Queue q =new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}

