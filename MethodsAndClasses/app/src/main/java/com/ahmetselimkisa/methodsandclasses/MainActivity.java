package com.ahmetselimkisa.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Oluşturuldu.");
        testMethod();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Devam Ediyor.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Kapatıldı.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Duraklatıldı.");
    }

    public void testMethod(){
        int x = 4 +4;
        System.out.println("X'in değeri: " + x);
    }
}