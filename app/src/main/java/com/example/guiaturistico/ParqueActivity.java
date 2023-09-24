package com.example.guiaturistico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ParqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque);
    }

    public void btnLocalizacao(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Parque+Natural+Chico+Mendes");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnSite(View view) {
        Uri uri = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnContato(View view) {
        Uri uri = Uri.parse("tel:"+"1532281256");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.CALL_PHONE},1);
            startActivity(intent);
        } else {
            startActivity(intent);
        }
    }

    public void btnVoltar(View view) {
        finish();
    }
}