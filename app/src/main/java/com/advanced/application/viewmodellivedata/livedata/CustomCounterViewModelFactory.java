package com.advanced.application.viewmodellivedata.livedata;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class CustomCounterViewModelFactory implements ViewModelProvider.Factory {

    private int initialCount;

    public CustomCounterViewModelFactory(int initialCount){
        this.initialCount = initialCount;
    }

    @Override
    public <T extends ViewModel> T create (Class <T> modelClass){
        if(modelClass.isAssignableFrom(CustomCounterViewModel.class)){
            return (T) new CustomCounterViewModel(initialCount);
        }
        throw new IllegalArgumentException("Unknwown ViewModel");
    }

}
