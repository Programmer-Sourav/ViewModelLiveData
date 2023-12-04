package com.advanced.application.viewmodellivedata.livedata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.advanced.application.viewmodellivedata.R;

public class ViewModelWithLiveData extends AppCompatActivity {
    CustomCounterViewModelFactory customCounterViewModelFactory;
    CustomCounterViewModel customCounterViewModel;
    TextView counterTv;

    Button incrementCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewmodel_livedata);

        counterTv = (TextView) findViewById(R.id.counterTv);
        incrementCounter = (Button) findViewById(R.id.counterIncBtn);

        customCounterViewModelFactory = new CustomCounterViewModelFactory(0);
        customCounterViewModel = new ViewModelProvider(this, customCounterViewModelFactory).get(CustomCounterViewModel.class);

        //observe the data
        customCounterViewModel.getCounter().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                counterTv.setText(String.valueOf(integer));
            }
        });


        incrementCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customCounterViewModel.setCounter();
            }
        });

    }
}
