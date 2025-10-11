// package linkedlist;

public class linklist {
     class Node {
        String data;
        Node next;

        Node (String value){
            data = value;
            next = null;

        }
     } 
     Node head;
// add first method
     public  void addfirst (String data) {
       Node newNode = new Node(data);
       
       if(head == null){
        head = newNode;
        return;
       }

       newNode.next = head;
       head = newNode;

     }

     // add last method

     public void addlast(String data){
     Node newNode = new Node(data);

     if(head == null){
        head =  newNode;
        return;
     }
      Node temp = head;

      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;
     }


     // remove first node 
    public void removefirst(){
    if (head==null){
     System.out.println("the list is empty");
     return;
     }


     head = head.next;


    }

    //remove last node 

    public void removelast(){
      if(head == null){
         System.out.println("the list is empty");
         return;

      }
      Node temp = head;
      while(temp.next.next!=null){
         temp = temp.next;

      }
      temp.next = null;
    }

   // get first


   public void getfirst(){
      if(head == null){
         System.out.println("the list is empty");
      }

      System.out.println(head.data);
   }

   //get last 

   public void getlast(){
    if(head == null){
      System.out.println("the list is empty");
    }

      Node temp = head;
      while(temp.next!=null){
         temp = temp.next;
      }

      System.out.println(temp.data);
   }

     public void show(){

        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " - > " );
            temp = temp.next;

        }
     }

     public static void main(String[] args) {
        linklist list = new linklist();
        list.addfirst("1");
        list.addfirst("2");
        list.addlast("56");
      //   list.removefirst();
      //   list.removelast();
      list.getfirst();
      list.getlast();
        list.show();
     }
}


//linked list is pre added in java but in dsa this is important
