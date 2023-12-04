package com.advanced.application.viewmodellivedata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.advanced.application.viewmodellivedata.viewmodel.CounterViewmodel;

public class MainActivity extends AppCompatActivity {

    private CounterViewmodel counterViewmodel;
    private Button counterInc;
    private TextView counterTv;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterInc = (Button) findViewById(R.id.counterIncBtn);
        counterTv = (TextView) findViewById(R.id.counterTv);

        counterViewmodel = new ViewModelProvider(this).get(CounterViewmodel.class);
        counterTv.setText(String.valueOf(counterViewmodel.getCurrentCounterValue()));

        counterInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterViewmodel.updateCounterValue();
                int counterVal = counterViewmodel.getCurrentCounterValue();
                counterTv.setText(String.valueOf(counterVal));
            }
        });


    }
}
