package org.example;

import org.example.impl.RepositoryImpl;
import org.example.interfaces.Repository;


public class App 
{
    public static void main( String[] args )
    {
        Repository<Integer> myrep=new RepositoryImpl<>(50);
        myrep.add(1);
        System.out.println(myrep.get(0));
        System.out.println(myrep.delete(0));

    }
}
