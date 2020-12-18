package org.example.impl;

import org.example.interfaces.Repository;

public class RepositoryImpl<T> implements Repository<T> {


    private static final int DEFAULT_LENGTH = 10;

    private Object[] array;

    private Integer head;

    public RepositoryImpl() {

        array = new Object[DEFAULT_LENGTH];
        head=-1;
    }

    public RepositoryImpl(int size) {
        array = new Object[size];
        head = -1;
    }

    @Override
    public void add(int index, T object) {
        if (index <= head)
            array[index] = object;
    }

    @Override
    public void add(T object) {

        if (++head >= array.length) {
            Object[] newArray = new Object[array.length + DEFAULT_LENGTH];
            System.arraycopy(array, 0, newArray, 0, head);
            newArray[head] = object;
            array = newArray;

        } else {
            array[head] = object;
        }


    }

    @Override
    public T get(int index) {
        Object temp = null;
        if (index < array.length) {
            temp = array[index];

        }
        return (T)temp;
    }

    @Override
    public T delete(int index) {
        Object temp = array[index];
        for (int i = index; i < head; i++) {
            array[i]=array[i+1];
        }
        array[head]=null;
        head--;

        return (T)temp;
    }

    @Override
    public int length() {
       return this.array.length;
    }
}
