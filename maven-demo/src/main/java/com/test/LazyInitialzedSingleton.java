package com.test;

public class LazyInitialzedSingleton
{
    private static LazyInitialzedSingleton instance;

    private LazyInitialzedSingleton()
    {
    }

    public static LazyInitialzedSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazyInitialzedSingleton();
        }
        return instance;
    }
}