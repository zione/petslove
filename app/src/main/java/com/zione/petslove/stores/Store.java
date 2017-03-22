package com.zione.petslove.stores;

/**
 * Created by zione on 2017/3/22.
 */

public abstract class Store {
    protected Store(){

    }

    public void register(final Object view){

    }

    public void unregister(final Object view){

    }

    void emitStoreChange(){

    }

    public abstract StoreChangeEvent changeEvent();
    public abstract void onAction(Action action);

    public class StoreChangeEvent {}
}
