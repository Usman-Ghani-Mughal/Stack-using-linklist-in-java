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
public class Node {
    private int DATA;
    private Node NEXT;
    Node()
    {
        this.DATA=0;
        this.NEXT=null;
    }
    Node(int d)
    {
        this.DATA=d;
        this.NEXT=null;
    }
    Node(int d,Node n)
    {
        this.DATA=d;
        this.NEXT=n;
    }
    public void setData(int d)
    {
        this.DATA=d;
    }
    public void setNext(Node n)
    {
        this.NEXT=n;
    }
    public int getData()
    {
        return this.DATA;
    }
    public Node getNext()
    {
        return this.NEXT;
    }
}
