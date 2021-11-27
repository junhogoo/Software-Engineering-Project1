package com.example.termproject;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ChampInfo_Detail_Fragment extends Fragment {
    ChampInfo_Activity activity;
    ChampInfo_Fragment champInfoFragment;
    Button backButton;
    Button editButton;
    Button deleteButton;
    TextView champName;
    TextView champLine;
    ImageView champImg;
    ChampInfo_Item item;
    ChampInfoDataAdapter adapter;

    ImageView champDetailImg;
    ImageView champDetailHardChampImg;
    ImageView champDetailEasyCahmpImg;
    ImageView champDetailItemImg1;
    ImageView champDetailItemImg2;
    ImageView champDetailItemImg3;
    ImageView champDetailSpellImg1;
    ImageView champDetailSpellImg2;
    ImageView champDetailPassiveSkillImg;
    ImageView champDetailQSkillImg;
    ImageView champDetailWSkillImg;
    ImageView champDetailESkillImg;
    ImageView champDetailRSkillImg;
    ImageView champDetailRuneImg1;
    ImageView champDetailRuneImg2;
    String skillOrder[];

    String name;
    String line;
    int imgId;
    double winRate;
    double pickRate;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(ChampInfo_Activity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.champinfo_detail_fragment,container,false);

        Bundle bundle = getArguments();
        if(bundle != null){
            item = (ChampInfo_Item) bundle.getSerializable("item");
            adapter=(ChampInfoDataAdapter) bundle.getSerializable("adapter");
        }

        //ChampInfo_Fragment에서 전달 받은 객체를 화면에 뿌려줌

        backButton=(Button)rootView.findViewById(R.id.champinfo_detail_back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //뒤로 이동
                champInfoFragment=new ChampInfo_Fragment();
                ChampInfo_Activity.champInfo_Fragment_Manager.beginTransaction().replace(R.id.container,champInfoFragment).commit();
            }
        });
        deleteButton=(Button)rootView.findViewById(R.id.champinfo_detail_delete_btn);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.delete(item);
                Toast.makeText(rootView.getContext().getApplicationContext(),"삭제하였습니다.",Toast.LENGTH_LONG).show();
                //데이터베이스에서 삭제후 뒤로 이동
                champInfoFragment=new ChampInfo_Fragment();
                ChampInfo_Activity.champInfo_Fragment_Manager.beginTransaction().replace(R.id.container,champInfoFragment).commit();
            }
        });
        return rootView;
    }

}