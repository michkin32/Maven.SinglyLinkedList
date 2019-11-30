package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {


    public class Node {
        Integer data;
        Node next;


        public Node(Integer data){
            this.data = data;
            this.next = null;

        }

    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(this.head == null){
            head = newNode;


        }
        else{
            Node lastNode = this.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;

        }

    }
    public Boolean contains(Integer element){
        Node lastNode = this.head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            if(lastNode.data == element){
                return true;
            }
        }
        return false;
    }
    public int find(Integer element){
        Node lastNode = this.head;
        while (lastNode != null){

            int counter = 0;
            if(lastNode.data == element && this.head != lastNode){
                counter++;
                return counter;
            }else if(lastNode.data == element){
                return counter;
            }
            counter++;
            lastNode = lastNode.next;
        }
        return -1;
    }

    public Integer size(){
        Node lastNode = this.head;
        int counter = 0;
        while (lastNode != null){

            counter++;
            lastNode = lastNode.next;
        }
        return counter;
    }
    public Integer get( Integer index){
        Node lastNode = this.head;
        if(index <= this.size()){
        for (int i = 0; i < index; i++) {
           lastNode = lastNode.next;

        }
        }
        if (lastNode.data != null && index <= this.size()){
        return lastNode.data;
        }
        return -1;
    }
    public void remove(int index){
        if (index == 0){
             head = head.next;
        }
    }

}
