package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    public FragmentManager fm = getSupportFragmentManager();
    public FragmentTransaction ft = fm.beginTransaction();
    private final TextView textView = findViewById(R.id.textView);
    private final Button menubutton = findViewById(R.id.button);
    private final MenuFragment menuFragment = new MenuFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.add(R.id.menu_layout, menuFragment);
                ft.commit();
            }
        });
        boolean regist = MenuFragment.regist;
        if (regist){
            textView.setText("Кнопка нажата");
        }
    }

}