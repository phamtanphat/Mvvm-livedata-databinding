package com.example.mvvm;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Mainbinding {
//    private MainActivity activity;
//    private Mainmodel mainmodel;
//
//    private EditText edtUsername;
//    private EditText edtPassword;
//    private Button btnLuu;
//    private CheckBox checkBox;
//    private TextView txtKetqua;
//    String chuoi = null;
//
//    public Mainbinding(MainActivity activity, Mainmodel mainmodel) {
//        this.activity = activity;
//        this.mainmodel = mainmodel;
//        btnLuu = activity.findViewById(R.id.buttonDangnhap);
//        edtUsername = activity.findViewById(R.id.edittextUsername);
//        edtPassword = activity.findViewById(R.id.edittextPassword);
//        checkBox = activity.findViewById(R.id.checkboxLuu);
//        txtKetqua = activity.findViewById(R.id.textviewketqua);
//        init();
//    }
//
//    void init(){
//
//        mainmodel.textemail.observe( activity, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                if (s != null){
//                    chuoi = s;
//                    Log.d("BBB","Co thay doi");
//                    edtUsername.setText(chuoi);
//                }
//
//            }
//        });
//        mainmodel.textpassword.observe(activity, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//
//                edtPassword.setText(s);
//            }
//        });
//        mainmodel.checkbox.observe( activity, new Observer<Boolean>() {
//            @Override
//            public void onChanged(@Nullable Boolean s) {
//
//                checkBox.setChecked(s);
//            }
//        });
//        mainmodel.textketqua.observe( activity, new Observer<User>() {
//            @Override
//            public void onChanged(@Nullable User user) {
//
//                txtKetqua.setText("User name : " + user.getUsername() + "\n" + "Password : " + user.getPassword() + "\n" + "Check box : " + user.isChecked());
//            }
//        });
//        btnLuu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainmodel.saveUser(new User(edtUsername.getText().toString() , edtPassword.getText().toString(),checkBox.isChecked()));
//            }
//        });
//    }
}
