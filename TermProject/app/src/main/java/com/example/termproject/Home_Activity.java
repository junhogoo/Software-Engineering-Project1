package com.example.termproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.io.Serializable;

public class Home_Activity extends AppCompatActivity {
    Intent intent;
    String id;
    Button search_btn;
    Button champInfo_btn;
    Button ranking_btn;
    Button community_btn;

    FragmentManager manager;
    Fragment searchFragment;
    Fragment champInfoFragment;
    Fragment rankFragment;
    Fragment boardFragment;

    static Login_item login_item;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        intent=getIntent();
        id=intent.getStringExtra("id");
        login_item = new Login_item("id","pw","hi",2);
//        search_btn=(Button)findViewById(R.id.home_serach_btn);
//        search_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                intent.setClass(getApplicationContext(),Search_Activity.class);
//                intent.putExtra("id",id);
//                intent.putExtra("type", 1);
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//            }
//        });
        champInfo_btn=(Button)findViewById(R.id.home_champinfo_btn);
        champInfo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(getApplicationContext(),ChampInfo_Activity.class);
                intent.putExtra("id",id);
                intent.putExtra("type", 2);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        ranking_btn=(Button)findViewById(R.id.home_ranking_btn);
        ranking_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(getApplicationContext(),Ranking_Activity.class);
                intent.putExtra("id",id);
                intent.putExtra("type", 3);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        community_btn=(Button)findViewById(R.id.home_community_btn);
        community_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setClass(getApplicationContext(),Community_Activity.class);
                intent.putExtra("id",id);
                intent.putExtra("type", 4);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}

