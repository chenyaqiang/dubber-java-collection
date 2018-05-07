package com.dubber.java.collection.list;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created on 2018/5/7.
 *
 * @author dubber
 *         <p>
 *         简单实现  单向链表
 */
public class OneWayLinkedList<E> implements Serializable {


    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    public OneWayLinkedList() {
    }


    /**
     * Appends the specified element to the end of this list.
     * <p>
     * This method is equivalent to {@link #addLast}
     *
     * @param e element to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
    public boolean add(E e) {
        /*linkLast(e);*/
        // 添加到链表尾部

        Node<E> l = last;
        Node<E> newNode = new Node(e);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    public int size() {
        return size;
    }


}
