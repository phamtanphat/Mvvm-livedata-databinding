package com.example.mvvm;

import android.app.Application;
import android.arch.core.util.Function;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.support.annotation.NonNull;
import android.util.Log;

public class Mainmodel extends AndroidViewModel {

    private MutableLiveData<User> usermutable= new MutableLiveData<>();

    private LiveData<String> textemail = Transformations.map(usermutable, new Function<User, String>() {
        @Override
        public String apply(User input) {
            return input.getUsername();
        }
    });
    private LiveData<String> textpassword = Transformations.map(usermutable, new Function<User, String>() {
        @Override
        public String apply(User input) {
            return input.getPassword();
        }
    });
    private LiveData<Boolean> checkbox = Transformations.map(usermutable, new Function<User, Boolean>() {
        @Override
        public Boolean apply(User input) {
            return input.isChecked();
        }
    });
    private LiveData<String> textketqua = Transformations.map(usermutable, new Function<User, String>() {
        @Override
        public String apply(User user) {
            return "User name : " + user.getUsername() + "\n" + "Password : " + user.getPassword() + "\n" + "Check box : " + user.isChecked();
        }
    });
    public Mainmodel(@NonNull Application application) {
        super(application);
        User user = new User("","",false);
        usermutable.setValue(user);
    }
    public LiveData<String> getTextemail() {
        return textemail;
    }
    public LiveData<String> getTextpassword() {
        return textpassword;
    }
    public LiveData<Boolean> getCheckbox() {
        return checkbox;
    }
    public LiveData<String> getTextketqua() {
        return textketqua;
    }

    public void saveUser(User user){
        usermutable.setValue(user);
    }
    public MutableLiveData<User> getUsermutable() {
        return usermutable;
    }
}
