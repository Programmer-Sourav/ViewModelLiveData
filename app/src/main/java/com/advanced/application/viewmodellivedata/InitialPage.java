package com.advanced.application.viewmodellivedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.advanced.application.viewmodellivedata.livedata.ViewModelWithLiveData;

public class InitialPage  extends AppCompatActivity {

    Button basicViewModel;
    Button viewModelFactory;
    Button viewModelLiveData;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initial_page);

        basicViewModel = (Button) findViewById(R.id.basic_view_model);
        viewModelFactory = (Button) findViewById(R.id.viewmodel_factory);
        viewModelLiveData = (Button) findViewById(R.id.viewmodel_livedata);

        basicViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InitialPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        viewModelFactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(InitialPage.this, ViewModelFactoryDemo.class);
              startActivity(intent);
            }
        });

        viewModelLiveData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(InitialPage.this, ViewModelWithLiveData.class);
                startActivity(intent);
            }
        });
    }
}
