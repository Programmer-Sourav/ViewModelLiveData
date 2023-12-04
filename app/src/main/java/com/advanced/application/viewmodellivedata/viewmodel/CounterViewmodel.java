package com.advanced.application.viewmodellivedata.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

public class CounterViewmodel extends ViewModel {
    private int counter = 0;

    public int getCurrentCounterValue(){
        Log.i("Snath", "Counter "+counter);
        return counter;
    }

    public int updateCounterValue(){
        counter = counter + 1;
        return counter;
    }
}
