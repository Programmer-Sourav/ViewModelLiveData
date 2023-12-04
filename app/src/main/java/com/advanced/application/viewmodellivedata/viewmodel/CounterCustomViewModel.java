package com.advanced.application.viewmodellivedata.viewmodel;

import androidx.lifecycle.ViewModel;

public class CounterCustomViewModel extends ViewModel {

    private int counter;

    public CounterCustomViewModel(int initialCounter){
               this.counter = initialCounter;
    }

    public int getCounter(){
        return counter;
    }

    public void incrementCounter(){
        counter = counter + 1;
    }
}
