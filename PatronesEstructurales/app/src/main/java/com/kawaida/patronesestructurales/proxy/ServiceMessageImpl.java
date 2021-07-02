package com.kawaida.patronesestructurales.proxy;

import android.app.Service;

public class ServiceMessageImpl implements ServiceMessage {

    @Override
    public String message(String user) {
        return "Hola " + user;
    }
}
