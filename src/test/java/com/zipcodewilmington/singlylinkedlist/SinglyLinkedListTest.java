package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @Test
    public void addTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Integer two = 2;

        list.addNode(2);
        list.addNode(3);
        Assert.assertEquals((Integer)list.head.data, two);
        Assert.assertEquals(list.head.next.data, (Integer)3);
    }
    @Test
    public void containsTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        Integer two = 2;

        list.addNode(2);
        list.addNode(3);
        Assert.assertEquals((Integer)list.head.data, two);
        Assert.assertFalse(list.contains(5));
        Assert.assertTrue(list.contains(3));
    }
    @Test
    public void findTest(){
        SinglyLinkedList list = new SinglyLinkedList();


        list.addNode(2);
        list.addNode(3);
        Assert.assertEquals(list.find(3), 1);
        Assert.assertEquals(list.find(2), 0);
        Assert.assertEquals(list.find(4), -1);
    }
    @Test
    public void sizeTest(){
        SinglyLinkedList list = new SinglyLinkedList();


        list.addNode(2);
        list.addNode(3);
        list.addNode(6);
        Assert.assertEquals(list.size(), (Integer)3);


}
    @Test
    public void getTest(){
        SinglyLinkedList list = new SinglyLinkedList();


        list.addNode(2);
        list.addNode(3);
        list.addNode(6);
        Assert.assertEquals(list.get(2), (Integer)6);
        Assert.assertEquals(list.get(4), (Integer)(-1));


    }
}
