package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    public Node head = null;
    public Node tail = null;


    public class Node {
        Integer data;
        Node next;


        public Node(Integer data){
            this.data = data;
            this.next = null;

        }

    }


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
            this.tail = newNode;

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

    public SinglyLinkedList copy(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        for (int i = 0; i < this.size(); i++) {
            singlyLinkedList.addNode(this.get(i));
        }
        return singlyLinkedList;
    }

    public void sort(){
        Node currNode;
        for (int i = 0; i < this.size(); i++) {
            currNode = this.head;
            for (int j = i + 1; j < this.size(); j++) {
                if(currNode.data > currNode.next.data){
                    Integer hold = currNode.data;
                    currNode.data = currNode.next.data;
                    currNode.next.data = hold;
                }
                    currNode = currNode.next;
            }
        }

    }

    public Boolean remove(int index) {
        Node currNode = this.head;

        Integer dataAtIndex = this.get(index);

        if (dataAtIndex == this.head.data) {
            this.head = this.head.next;
            return true;
        } else if (dataAtIndex == this.tail.data) {
            while (currNode.next != null) {
                if (currNode.next.data == dataAtIndex) {
                    currNode.next = null;
                    return true;
                }
            }
        } else {
            while (currNode.next != null) {
                if (currNode.next.data == dataAtIndex) {
                    currNode.next = currNode.next.next;

                    return true;
                }
                currNode = currNode.next;

            }
        }
        return false;
    }

}
