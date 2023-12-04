package com.advanced.application.viewmodellivedata.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomCounterViewModel extends ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<Integer>();

    public CustomCounterViewModel(int initialValue){
        counter.setValue(initialValue);
    }

    //read-only
    public LiveData<Integer> getCounter(){
        return counter;
    }

    public void setCounter(){
        counter.setValue(counter.getValue()+1);
    }
}
