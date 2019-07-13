package com.example.mvvm;

public class User {
   private String username;
   private String password;
   private boolean checked;

    public User(String username, String password, boolean checked) {
        this.username = username;
        this.password = password;
        this.checked = checked;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
