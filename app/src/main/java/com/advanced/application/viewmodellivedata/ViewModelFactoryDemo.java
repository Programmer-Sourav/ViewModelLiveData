package com.advanced.application.viewmodellivedata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.advanced.application.viewmodellivedata.viewmodel.CounterCustomViewModel;
import com.advanced.application.viewmodellivedata.viewmodelfactory.CounterViewModelFactory;

public class ViewModelFactoryDemo extends AppCompatActivity {

    private CounterCustomViewModel counterCustomViewModel;
    private Button counterInc;
    private TextView counterViewTv;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_provider_demo);

        counterViewTv = (TextView) findViewById(R.id.counterTv);
        counterInc = (Button) findViewById(R.id.counterIncBtn);

        int initialCounter = 0;

        //pass required arguments to Factory
        CounterViewModelFactory factory = new CounterViewModelFactory(initialCounter);
        //pass factory as the second argument to the ViewModelProvider() function
        counterCustomViewModel = new ViewModelProvider(this, factory).get(CounterCustomViewModel.class);


        counterViewTv.setText(String.valueOf(counterCustomViewModel.getCounter()));

        counterInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterCustomViewModel.incrementCounter();
                counterViewTv.setText(String.valueOf(counterCustomViewModel.getCounter()));
            }
        });
    }
}
