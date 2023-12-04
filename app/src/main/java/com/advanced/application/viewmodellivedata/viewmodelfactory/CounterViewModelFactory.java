package com.advanced.application.viewmodellivedata.viewmodelfactory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.advanced.application.viewmodellivedata.viewmodel.CounterCustomViewModel;
import com.advanced.application.viewmodellivedata.viewmodel.CounterViewmodel;

public class CounterViewModelFactory implements ViewModelProvider.Factory {

    private int initialCounter;

    public CounterViewModelFactory(int initialCounter){
                this.initialCounter = initialCounter;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass){
        if(modelClass.isAssignableFrom(CounterCustomViewModel.class)){
            return (T) new CounterCustomViewModel(initialCounter);
        }
     throw new IllegalArgumentException("Unknown Viewmodel class");
    }
}
