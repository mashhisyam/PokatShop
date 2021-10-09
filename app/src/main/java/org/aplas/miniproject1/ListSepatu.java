package org.aplas.miniproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class ListSepatu extends AppCompatActivity {

    private ArrayList<Integer> fotoSepatu = new ArrayList<>();
    private ArrayList<String> namaSepatu = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sepatu);

        getDataSepatu();
    }

    private void prosesRecyclerViewAdapter (){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListSepatuAdapter adapter = new ListSepatuAdapter(fotoSepatu, namaSepatu, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataSepatu(){
        namaSepatu.add("Nike Kyrie 7");
        fotoSepatu.add(R.drawable.kyrie7);

        namaSepatu.add("Nike Cosmic Unity");
        fotoSepatu.add(R.drawable.cosmic);

        namaSepatu.add("Nike Kobe V Protro Bruce Lee");
        fotoSepatu.add(R.drawable.kobe5);

        namaSepatu.add("Nike Kyrie 7 EP");
        fotoSepatu.add(R.drawable.kyrie7ep);

        namaSepatu.add("Nike PG 5");
        fotoSepatu.add(R.drawable.pg5);

        namaSepatu.add("Nike KD 14 EP");
        fotoSepatu.add(R.drawable.kd14ep);

        namaSepatu.add("Nike Lebron 18");
        fotoSepatu.add(R.drawable.lebron18);

        namaSepatu.add("Nike Lebron 18 Low");
        fotoSepatu.add(R.drawable.lebron18low);

        namaSepatu.add("Nike Kyrie Flytrap");
        fotoSepatu.add(R.drawable.kyrieflytrap);

        namaSepatu.add("Nike PG 4");
        fotoSepatu.add(R.drawable.pg4);

        namaSepatu.add("Adidas D.O.N Issue 2");
        fotoSepatu.add(R.drawable.don);

        namaSepatu.add("Adidas Harden Vol 4");
        fotoSepatu.add(R.drawable.harden);

        prosesRecyclerViewAdapter();
    }
}