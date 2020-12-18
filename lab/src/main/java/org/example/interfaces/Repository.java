package org.example.interfaces;

public interface Repository<T> {

    public void add(int index, T object);

    public void add(T object);

    public T get(int index);

    public T delete(int index);

    public int length();
}
