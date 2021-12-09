package com.example.mytoast;

import static com.example.toasterlibrary.ToasterMessage.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ToasterMessage.s(MainActivity.this, "Hello World");
    }
}