package com.drakemayo;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Player[capacity];
    }

    public void add(Player player)
    {
        // Resizes the array when it's full
        if (back == queue.length)
        {
            Player[] newArray = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = player;
        back++;
    }

    public Player remove()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        Player removePlayer = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0)    // Reset trackers when queue is empty
        {
            front = 0;
            back = 0;
        }

        return removePlayer;
    }

    public Player peek()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size()
    {
        return back - front;
    }

    public void printFullQueue()
    {
        for (int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}
