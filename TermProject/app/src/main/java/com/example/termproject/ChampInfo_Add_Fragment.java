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

public class ChampInfo_Add_Fragment extends Fragment {
    ViewGroup rootView;
    ChampInfo_Activity activity;
    ChampInfo_Fragment champInfoFragment;

    Button AddCompleteButton;
    Button AddCancelButton;

    ImageView champAddImg;
    ImageView champAddHardChampImg;
    ImageView champAddEasyCahmpImg;
    ImageView champAddItemImg1;
    ImageView champAddItemImg2;
    ImageView champAddItemImg3;
    ImageView champAddSpellImg1;
    ImageView champAddSpellImg2;
    ImageView champAddPassiveSkillImg;
    ImageView champAddQSkillImg;
    ImageView champAddWSkillImg;
    ImageView champAddESkillImg;
    ImageView champAddRSkillImg;
    ImageView champAddRuneImg1;
    ImageView champAddRuneImg2;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ChampInfo_Activity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup)inflater.inflate(R.layout.champinfo_add_fragment,container,false);

        //ImageView 클릭시 앨범에서 사진가져오기
        champAddImg=(ImageView)rootView.findViewById(R.id.champ_add_img);
        champAddImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddHardChampImg=(ImageView)rootView.findViewById(R.id.champinfo_add_hard_img);
        champAddHardChampImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddEasyCahmpImg=(ImageView)rootView.findViewById(R.id.champinfo_add_easy_img);
        champAddEasyCahmpImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddItemImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img1);
        champAddItemImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddItemImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img2);
        champAddItemImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddItemImg3=(ImageView)rootView.findViewById(R.id.champinfo_add_item_img3);
        champAddItemImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddSpellImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_spell_img1);
        champAddSpellImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddSpellImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_spell_img2);
        champAddSpellImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddPassiveSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_passive_img);
        champAddPassiveSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddQSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Qskill_img);
        champAddQSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddESkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Eskill_img);
        champAddESkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddWSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Wskill_img);
        champAddWSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddRSkillImg=(ImageView)rootView.findViewById(R.id.champinfo_add_Rskill_img);
        champAddRSkillImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddImg=(ImageView)rootView.findViewById(R.id.champ_add_img);
        champAddImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddRuneImg1=(ImageView)rootView.findViewById(R.id.champinfo_add_rune_img1);
        champAddRuneImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });
        champAddRuneImg2=(ImageView)rootView.findViewById(R.id.champinfo_add_rune_img2);
        champAddRuneImg2.setOnClickListener(new View.OnClickListener() {
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