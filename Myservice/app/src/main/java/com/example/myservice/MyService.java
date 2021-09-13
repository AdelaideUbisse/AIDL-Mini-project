package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {

    private MyImpl impl = new MyImpl();

    @Override
    public IBinder onBind(Intent intent) {
        return impl;

    }

    private class MyImpl extends aidlInterface.Stub{


        @Override
        public int calculate(int valor1, int valor2) throws RemoteException {
            return valor1 + valor2;
        }
    }
}