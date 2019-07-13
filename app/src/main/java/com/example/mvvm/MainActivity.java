package com.example.mvvm;


import android.arch.lifecycle.ViewModelProviders;

import android.databinding.DataBindingUtil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.mvvm.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Mainmodel mainmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainmodel = ViewModelProviders.of(this).get(Mainmodel.class);
        binding.setLifecycleOwner(this);
        binding.setMainmodel(mainmodel);

        binding.buttonDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = String.valueOf(binding.edittextUsername.getText());
                String password = String.valueOf(binding.edittextPassword.getText());
                Boolean check = binding.checkboxLuu.isChecked();
                mainmodel.saveUser(new User(email,password,check));
            }
        });

    }
}
