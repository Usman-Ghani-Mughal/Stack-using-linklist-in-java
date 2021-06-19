/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Usman Ghani Mughal
 */
public class StackImplementation {
    private Node top;
    private int size;
    StackImplementation()
    {
        this.size=0;
        this.top=null;
    }
    public void push(int d)
    {
        Node temp=new Node(d);
        temp.setNext(this.top);
        this.top=temp;
        this.size++;
    }
    public int pop()
    {
       Node temp=this.top;
       this.top=this.top.getNext();
       this.size--;
       return temp.getData();
    }
    public void display()
    {
        if(this.top==null)
        {
         System.out.println("Soryy Stack is Empty");
        }
        else
        {
            Node move=this.top;
            while(move!=null)
            {
                System.out.print(move.getData()+" ");
                move=move.getNext();
            }
        }
    }
    public int getSize()
    {
        return this.size;
    }
    public boolean search(int d)
    {
        Node move=this.top;
        while(move!=null)
        {
            if(move.getData()==d)
            {
                return true;
            }
            move=move.getNext();
        }
        return false;
    }
}
