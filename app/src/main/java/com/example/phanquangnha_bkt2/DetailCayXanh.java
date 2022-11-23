package com.example.phanquangnha_bkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailCayXanh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cay_xanh);

        TextView textViewten = (TextView)findViewById(R.id.tenDS);
        TextView textViewmota = (TextView) findViewById(R.id.motaDS);
        Intent intent= getIntent();
        textViewten.setText(intent.getStringExtra("Ten"));
        textViewmota.setText(intent.getStringExtra("MoTa"));

    }
}
