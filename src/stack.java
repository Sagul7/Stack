class Node{
    public int data;
    public Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class stacks{
   public Node top;
    public int height;

    public stacks(int value){
        Node newnode = new Node(value);
        top = newnode;
        height = 1;
    }

    public void push(int data)
    {
        Node newnode = new Node(data);
        if(height==0)
        {
            top = newnode;
        }
        else {
            newnode.next = top;
            top = newnode;
        }
        height++;
    }

    public void print()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public Node pop() {
        if (height == 0) {
            System.out.println("No value in stack");
            return null; // Return null to indicate that the stack is empty
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null; // Disconnect the popped node from the rest of the stack
            height--;
            return temp;
        }
    }
}

public class stack {
    public static void main(String[] args) {
        stacks stack = new stacks(25);
        stack.push(5);
        stack.push(45);
        stack.push(8);
        stack.push(9);
        stack.push(4);
        stack.push(41);
        stack.push(43);
        stack.push(488);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();

    }
}
