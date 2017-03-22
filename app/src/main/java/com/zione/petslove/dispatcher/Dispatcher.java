package com.zione.petslove.dispatcher;

import java.util.ArrayList;

/**
 * Created by zione on 2017/3/22.
 */

public class Dispatcher {
    private static Dispatcher instance;
    private final List<Store> stores = new ArrayList<>();
    private Dispatcher(){

    }

    synchronized public static Dispatcher get(){
        if(instance == null){
            instance = new Dispatcher();
        }
        return instance;
    }

    public void register(final Store store){
        stores.add(store);
    }

    public void unregister(final Store store){
        stores.remove(store);
    }

    public void dispatch(Action action){
        post(action);
    }

    private void post(final Action action){
        for(Store store: stores){
            store.onAction(action);
        }
    }
}
