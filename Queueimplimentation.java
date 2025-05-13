/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;


public class Queueimplimentation {
    int size=5;
    int[] queue=new int[size];
    int front=-1;
    int rear=-1;
    
    void enqueue(int x){
        if(front==0&&rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            queue[rear]=x;
            System.out.println(x+" "+"insertion to the queue");
        }
    }
    void dqueue()
    {
        if(front==-1&&rear==-1){
            System.out.println("empty");
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
    int size()
    {
        return rear+1;
    }
    boolean isempty(){
        if(front==-1&&rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Queueimplimentation Q=new Queueimplimentation();
        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);
        Q.enqueue(50);
        Q.enqueue(60);
        Q.enqueue(70);
        Q.dqueue();
        Q.dqueue();
        Q.dqueue();
        Q.dqueue();
        Q.dqueue();
        Q.dqueue();   
    }
}
