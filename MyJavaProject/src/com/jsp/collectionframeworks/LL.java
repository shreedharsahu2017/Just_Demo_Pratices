package com.jsp.collectionframeworks;

import java.util.LinkedList;

public class LL {
  Node head;
  private int size;

  
   LL(){
	   size=0;
   }
     public class Node{
    	 String data;
    	 Node Next;
    	   Node(String data){
    		   this.data=data;
    		   this.Next=null;
    		   size++;
    	   }
     }
     
     
     public void addFirst(String data) {
    	 Node newNode=new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    	 }
    	 newNode.Next=head;
    	 head=newNode;
     }
     public void addLast(String data) {
    	 Node newNode=new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    	 }
    	 
    	 Node LastNode=head;
         while(LastNode.Next!=null) {
        	 LastNode=LastNode.Next;
         }
         LastNode.Next=newNode;
     }
     public void printList() {
    	 Node currNode=head;
        while(currNode!=null) {
        	System.out.println(currNode.data+"->");
        	currNode=currNode.Next;
        }
        System.out.println("null");
     }
     public void removeFirst() {
    	 if(head==null) {
    		 System.out.println("Empty list,nothing to delete");
    		 return;
    	 }
    	 head=this.head.Next;
    	 size--;
     }
     
     public void removeLast() {
    	 if(head==null) {
    		 System.out.println("empty list,nothing to delete");
    		 return;
    	 }
    	 size--;
    	 if(head.Next==null) {
    		 head=null;
    		 return;
    	 }
    	 Node currNode=head;
    	 Node LastNode=head.Next;
    	 
    	 while(LastNode.Next!=null) {
    		 currNode=currNode.Next;
    		 LastNode=LastNode.Next;
    	 }
    	 currNode.Next=null;
     }
     public int getsize() {
    	 return size;
     }
     public static void main(String[] args) {
    	 LinkedList<String> list=new LinkedList<>();
    	// l.add("this");
    	 list.add("a");
    	 list.add("List");
    	 list.add("Linkedlist");
    	 list.addFirst("this");
    	 list.addLast("shree");
    	 System.out.println(list);
  	}
     
     
     
}
