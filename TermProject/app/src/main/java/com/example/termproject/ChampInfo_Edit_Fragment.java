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
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import java.io.IOException;

public class ChampInfo_Edit_Fragment extends Fragment {
    ViewGroup rootView;
    ChampInfo_Activity activity;
    ChampInfo_Fragment champInfoFragment;

    Button AddCompleteButton;
    Button AddCancelButton;

    ImageView champEditImg;
    ImageView champEditHardChampImg;
    ImageView champEditEasyCahmpImg;
    ImageView champEditItemImg1;
    ImageView champEditItemImg2;
    ImageView champEditItemImg3;
    ImageView champEditSpellImg1;
    ImageView champEditSpellImg2;
    ImageView champEditPassiveSkillImg;
    ImageView champEditQSkillImg;
    ImageView champEditWSkillImg;
    ImageView champEditESkillImg;
    ImageView champEditRSkillImg;
    ImageView champEditRuneImg1;
    ImageView champEditRuneImg2;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ChampInfo_Activity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup)inflater.inflate(R.layout.champinfo_add_fragment,container,false);

        //ChampInfo_Edit_Fragment에서 전달 받은 객체를 화면에 뿌려줌

        //ImageView 클릭시 앨범에서 사진가져오기
        champEditImg=(ImageView)rootView.findViewById(R.id.champ_add_img);
        champEditImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditHardChampImg=(ImageView)rootView.findViewById(R.id.champinfo_add_hard_img);
        champEditHardChampImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditEasyCahmpImg=(ImageView)rootView.findViewById(R.id.champinfo_add_easy_img);
        champEditEasyCahmpImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditItemImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img1);
        champEditItemImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditItemImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img2);
        champEditItemImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditItemImg3=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img3);
        champEditItemImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditSpellImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_spell_img1);
        champEditSpellImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditSpellImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_spell_img2);
        champEditSpellImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditPassiveSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_passive_img);
        champEditPassiveSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditQSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Qskill_img);
        champEditQSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditWSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Wskill_img);
        champEditWSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditESkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Eskill_img);
        champEditESkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditRSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Rskill_img);
        champEditRSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditRuneImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_rune_img1);
        champEditRuneImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champEditRuneImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_rune_img2);
        champEditRuneImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        //완료버튼 클릭시
        AddCompleteButton=(Button)rootView.findViewById(R.id.champinfo_add_complete_btn);
        AddCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //입력받은 값을 데이터베이스에 저장후 뒤로이동
                champInfoFragment=new ChampInfo_Fragment();
                ChampInfo_Activity.champInfo_Fragment_Manager.beginTransaction().replace(R.id.container,champInfoFragment).commit();
            }
        });

        //취소버튼 클릭시
        AddCancelButton=(Button)rootView.findViewById(R.id.champinfo_add_cancel_btn);
        AddCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                champInfoFragment=new ChampInfo_Fragment();
                ChampInfo_Activity.champInfo_Fragment_Manager.beginTransaction().replace(R.id.container,champInfoFragment).commit();
            }
        });

        return rootView;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 &&  data != null && data.getData() != null) {
            Uri uri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(rootView.getContext().getContentResolver(), uri);
                ImageView imageView = (ImageView) rootView.findViewById(R.id.champ_add_img);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
