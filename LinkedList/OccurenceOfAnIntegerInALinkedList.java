import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Occurrence
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            int k = sc.nextInt();
            Solution ob= new Solution();
            System.out.println(ob.count(head, k));
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next !=  null)
              temp = temp.next;
              temp.next = node;
        }
    }
}

class Solution{
    
    public static int count(Node head, int searchElement){
        
        int count = 0;
        Node iterator = head;
        while(iterator != null){
            if(iterator.data == searchElement){
                count++;
            }
            iterator = iterator.next;
        }
        return count;
        
    }
}
