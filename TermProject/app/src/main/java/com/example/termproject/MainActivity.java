package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    String id;
    String password;
    EditText inputId;
    EditText inputPassWord;
    Button login_btn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_btn=(Button)findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), Home_Activity.class);
                //로그인정보 받아와서 id, password에 저장
                inputId=(EditText)findViewById(R.id.id_input);
                inputPassWord=(EditText)findViewById(R.id.password_input);
                id=inputId.getText().toString();
                password=inputPassWord.getText().toString();

                //로그인 정보를 데이터베이스와 비교

                //로그인 액티비티에서 홈 액티비티로 이동
                intent.putExtra("id",id);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}