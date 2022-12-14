package com.bridgelabz.stackandqueues;

public class LinkedListQueue
{
    private Node front, rear;
    private int queueSize;


    private class Node {
        int data;
        Node next;
    }


    public LinkedListQueue()
    {
        front = null;
        rear = null;
        queueSize = 0;
    }


    public boolean isEmpty()
    {
        return (queueSize == 0);
    }
    public int dequeue()
    {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        queueSize--;
        System.out.println("Element " + data+ " removed from the queue");
        return data;
    }





    public void enqueue(int data)
    {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty())
        {
            front = rear;
        }
        else  {
            oldRear.next = rear;
        }
        queueSize++;
        System.out.println("Element " + data+ " added to the queue");
    }

    public void print_frontRear() {
        System.out.println("Front of the queue:" + front.data
                + " Rear of the queue:" + rear.data);
    }
}




