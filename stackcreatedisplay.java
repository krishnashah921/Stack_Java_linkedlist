import java.util.*;
class stack
{
    class node
    {
        int data;
        node next;
        node top=null;
        
    }
    node push(node top,int dataa)
    {
        node newnode=new node();//
        newnode.data=dataa;
        newnode.next=top;
        top=newnode;
        return top;
    }
    int topelement(node top)
    {
        int ret=top.data;
        return ret;
    }
    node display(node top)
    {
        int val;
        node temp=top,sa=top;
        while (temp!=null)
        {
        val=topelement(top);
        System.out.println(val);
        temp=temp.next;
        top=temp;
        
        }
        top=sa;
        return top;
    }
    node pop(node top)
    {
        if (top==null)
        {
            return top;
        }
        else 
        {
            top=top.next;
            return top;
        }
    }
}
class stackcreatedisplay
{
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        stack s1=new stack();
        stack.node nn=s1.new node();
        int ch=1,choice,data,top=-1;
        System.out.println("1.Create\n2.Display\n3.Exit\n4.delete or pop");
        while (ch==1)
        {
            System.out.println("Enter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
             
                {
                    System.out.println("Enter the data");
                    data=myobj.nextInt();
                    nn.top=s1.push(nn.top,data);
                    break;
                }
                case 2:
                {
                    nn.top=s1.display(nn.top);
                    break;
                }
                case 3:
                {
                    ch=0;
                    break;
                }
                case 4:
                {
                    nn.top=s1.pop(nn.top);
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice");
                }
                
            }
        }
    }
}
