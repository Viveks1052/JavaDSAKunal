package com.Java.LinkedList;

public class LL {

    static class Node{

        int value;
        Node next;

        public Node(int value){    // if the Next node is null
            this.value =value;
            this.next=null;
        }

//        public Node(int value, Node next) {  // if next node is not null
//            this.value = value;
//            this.next = next;
//        }


    }

    private Node head;

    public void insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
        }


    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LL list  = new LL();

        list.insert(12);
        list.insert(13);
        list.insert(15);

        list.display();



    }

}
