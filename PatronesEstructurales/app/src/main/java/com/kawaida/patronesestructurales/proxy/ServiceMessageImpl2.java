package com.kawaida.patronesestructurales.proxy;

public class ServiceMessageImpl2 implements ServiceMessage{

    @Override
    public String message(String user) {
        return "Chau " + user;
    }
}
