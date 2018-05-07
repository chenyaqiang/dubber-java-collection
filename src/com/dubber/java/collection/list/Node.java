package com.dubber.java.collection.list;

/**
 * Created on 2018/5/7.
 *
 * @author dubber
 *         <p>
 *         定义节点对象，  一个节点对象包括 data：存储Object数据   next:下一个节点的引用
 */
public class Node<E> {

    E data;
    Node next;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}