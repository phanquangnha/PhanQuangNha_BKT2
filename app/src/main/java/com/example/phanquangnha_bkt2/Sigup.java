package com.example.phanquangnha_bkt2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Sigup extends AppCompatActivity {
    private FirebaseAuth mAuth;

    String email,password;
    Button btdk;
    EditText emailT,passT;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup);
        mAuth = FirebaseAuth.getInstance();
        myRef = FirebaseDatabase.getInstance().getReference();
        myRef.child("users");
        emailT=(EditText) findViewById(R.id.emaildk);
        passT=(EditText) findViewById(R.id.passdk);
        btdk = (Button) findViewById(R.id.btdk);
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyDK();
            }
        });
    }

    private void xuLyDK() {
        email = emailT.getText().toString();
        password = passT.getText().toString();
        mAuth = FirebaseAuth.getInstance();


        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Sigup.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Sigup.this,MainActivity.class));
//                            mAuth.getCurrentUser().sendEmailVerification();
//                            mAuth.signOut();
//
                        } else {
                            Toast.makeText(Sigup.this,"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}