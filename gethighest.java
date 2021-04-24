import java.util.*;
class stack
{
    class node
    {
        int data;
        node next;
        node top=null;
        node top2=null;
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
    int greatest(node top,node top2)
    {
        int gre=0,temp=0;
       while (top!=null)
       {
           gre=topelement(top);
           top=pop(top);
           if (top2==null || topelement(top2)<gre)
           {
               top2=push(top2,gre);
           }
           //if poped then..check whether the poped element was greatest or not if it was then
           
       }
       return topelement(top2);
    }
}
class gethighest
{
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        stack s1=new stack();
        stack.node nn=s1.new node();
        int ch=1,choice,data,top=-1,greatest=0;
        System.out.println("1.Create\n2.Display\n3.Exit\n4.delete or pop\n5.Get highest");
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
                case 5:
                {
                    greatest=s1.greatest(nn.top,nn.top2);
                    System.out.println(greatest);
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
