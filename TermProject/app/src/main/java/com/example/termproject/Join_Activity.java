package com.example.termproject;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Join_Activity extends AppCompatActivity {
    public Login_item current_login;
    EditText make_id, make_pwd, make_nickname;
    Button make_btn;
    SQLiteDatabase sqlDB;
    DataBaseHelper myHelper;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_activity);
        setTitle("LIS");

        make_id = (EditText) findViewById(R.id.make_id);
        make_pwd = (EditText) findViewById(R.id.make_pwd);
        make_nickname = (EditText) findViewById(R.id.make_name);
        make_btn = (Button) findViewById(R.id.make_btn);


        make_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                JoinDB_Adapter join_DBHelper = new JoinDB_Adapter(getApplicationContext());
                join_DBHelper.createDatabase();
                join_DBHelper.open();
                join_DBHelper.join_writeDB(make_id.getText().toString(), make_pwd.getText().toString(),
                        make_nickname.getText().toString(), 1);

                // db 닫기
                join_DBHelper.close();
                Toast.makeText(getApplicationContext(), "회원가입 완료!", Toast.LENGTH_SHORT).show();

                //회원가입 종료하고 로그인 액티비티로 이동
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }

}


