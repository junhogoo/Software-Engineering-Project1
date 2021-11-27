package com.example.termproject;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class Ranking_Edit_Fragment extends Fragment {
    ViewGroup rootView;
    Ranking_Activity activity;
    Ranking_Fragment rankingFragment;
    TextView title;
    Spinner tierSpinner;
    EditText editName;
    ImageView editImg;
    EditText editLP;
    Button AddCompleteButton;
    Button AddCancelButton;
    String name;
    int img_id;
    int lp;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(Ranking_Activity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //프래그먼트 구성
        rootView = (ViewGroup)inflater.inflate(R.layout.ranking_edit_fragment,container,false);

        title=(TextView)rootView.findViewById(R.id.rank_edit_title);
        title.setText("유저 수정");

        Bundle bundle = getArguments();
        if(bundle != null){
            name = bundle.getString("name");
            img_id= bundle.getInt("img");
            lp = bundle.getInt("lp");
        }
        editName=(EditText)rootView.findViewById(R.id.ranking_edit_name);
        editName.setText(name);
        //editImg=(ImageView)rootView.findViewById(R.id.ranking_add_img);
        //editImg.setImageResource(img_id);
        //editImg=rootView.findViewById(R.id.ranking_add_img);
        /*
        editImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 2);
            }
        });*/
        editLP=(EditText)rootView.findViewById(R.id.ranking_edit_lp);
        editLP.setText(Integer.toString(lp));

        //완료버튼 클릭시
        AddCompleteButton=(Button)rootView.findViewById(R.id.ranking_edit_complete_btn);
        AddCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //수정한 데이터를 데이터베이스에 저장

                rankingFragment=new Ranking_Fragment();
                Ranking_Activity.ranking_Fragment_Manager.beginTransaction().replace(R.id.container,rankingFragment).commit();
            }
        });

        //취소버튼 클릭시
        AddCancelButton=(Button)rootView.findViewById(R.id.ranking_edit_cancel_btn);
        AddCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rankingFragment=new Ranking_Fragment();
                Ranking_Activity.ranking_Fragment_Manager.beginTransaction().replace(R.id.container,rankingFragment).commit();
            }
        });

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 &&  data != null && data.getData() != null) {
            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(rootView.getContext().getContentResolver(), uri);
                //ImageView imageView = (ImageView) rootView.findViewById(R.id.ranking_add_img);
                //imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

