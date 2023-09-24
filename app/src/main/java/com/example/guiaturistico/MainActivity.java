package com.example.guiaturistico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnZoologico(View view) {
        Intent intent = new Intent(this, ZoologicoActivity.class);
        startActivity(intent);
    }

    public void btnIguatemi(View view) {
        Intent intent = new Intent(this, IguatemiActivity.class);
        startActivity(intent);
    }

    public void btnParque(View view) {
        Intent intent = new Intent(this, ParqueActivity.class);
        startActivity(intent);
    }
}