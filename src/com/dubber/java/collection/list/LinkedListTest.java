package com.dubber.java.collection.list;

import java.util.LinkedList;

/**
 * Created on 2018/5/7.
 *
 * @author dubber
 *
 * 定一个一个单向链表
 */
public class LinkedListTest {

    public static void main(String[] args) {


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.iterator();

        OneWayLinkedList<String> oneWayLinkedList = new OneWayLinkedList<>();
        oneWayLinkedList.add("ces");
        oneWayLinkedList.add("ces02");
        oneWayLinkedList.add("ces03");

        System.out.println(oneWayLinkedList.size);
    }



}


