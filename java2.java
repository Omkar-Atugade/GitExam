class LinkedList{

    Node head;

    static class Node{

        int data;

        public Node(data){

            this.data = data;
            this.next = null;
        }
    }

    public insert(int data){

        if(head == null){

            head = node;
        }
        
        head.next = node;

    }

 


}

public class Exam{

    public static void main(String[] args){

        LinkedList lst = new LinkedList();
        lst.insert(1);
        lst.insert(2);
        lst.insert(3);
        lst.insert(4);

      

    }
}