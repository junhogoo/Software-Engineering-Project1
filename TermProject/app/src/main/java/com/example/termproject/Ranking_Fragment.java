package com.example.termproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Ranking_Fragment extends Fragment {
    Ranking_Activity activity;
    ListView rankListView;
    Ranking_View_Adapter rankAdapter;
    Button AddButton;
    RankingDataAdapter adapter;
    ArrayList<Ranking_Item> rankingList;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity=(Ranking_Activity)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //프래그먼트 구성
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.ranking_fragment,container,false);
        //AddButton=(Button)rootView.findViewById(R.id.ranking_edit_btn);

        adapter = new RankingDataAdapter(rootView.getContext().getApplicationContext());
        adapter.createDatabase();
        adapter.open();
        rankingList = adapter.getTableData();

        /*
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ranking_Edit_Fragment rankingEditFragment =new Ranking_Edit_Fragment();
                Ranking_Activity.ranking_Fragment_Manager.beginTransaction().replace(R.id.container,rankingEditFragment).commit();
            }
        });
        */
        //관리자 ID로 접속한 상태에서 리스트 뷰를 클릭할 경우 실행되는 코드
        final String[] select = {"수정하기","삭제하기"};
        rankListView=(ListView)rootView.findViewById(R.id.ranking_listview);
        rankListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(activity);
                dlg.setTitle("작업을 선택하세요 ");
                dlg.setItems(select, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(select[which]=="수정하기"){
                            //기존에 등록되어있는 값을 수정창으로 이동
                            Ranking_Item item = (Ranking_Item) rankAdapter.getItem(position);
                            Ranking_Edit_Fragment rankingEditFragment =new Ranking_Edit_Fragment();
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("item", item);
                            bundle.putSerializable("adapter",adapter);
                            rankingEditFragment.setArguments(bundle);
                            Ranking_Activity.ranking_Fragment_Manager.beginTransaction().replace(R.id.container,rankingEditFragment).commit();

                        }
                        else if(select[which]=="삭제하기"){
                            //DB에서 지워저야함
                            rankAdapter.items.remove(position);
                            rankAdapter.notifyDataSetChanged();
                        }
                    }
                });
                dlg.show();
            }
        });

        //rankListView에 아이템 추가->데이터베이스
        rankAdapter=new Ranking_View_Adapter();

        for(int i=0; i<rankingList.size(); i++) {
            rankAdapter.addItem(rankingList.get(i));
        }

        rankListView.setAdapter(rankAdapter);
        return rootView;
    }
}