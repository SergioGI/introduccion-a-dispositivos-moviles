package com.example.fragment001;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new fragment_a())
                .commit();
    }

    //metodos para reemplazar fragments
    public void mostrarFA(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment_a()).commit();
    }
    public void mostrarFB(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment_b()).commit();
    }
    public void mostrarFC(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new fragment_c()).commit();
    }
}