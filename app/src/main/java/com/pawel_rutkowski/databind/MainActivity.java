package com.pawel_rutkowski.databind;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pawel_rutkowski.databind.databinding.MainBinding;
import com.pawel_rutkowski.databind.model.Handlers;
import com.pawel_rutkowski.databind.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.main);
        User firstUser = new User("Pawel", "Rutkowski", false);
        User secondUser = new User("Jan", "Nowak", true);
        mainBinding.setHandlers(new Handlers());
        mainBinding.setFirstUser(firstUser);
        mainBinding.setSecondUser(secondUser);

    }
}
