package org.aplas.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView FotoSepatu;
    TextView NamaSepatu, DetailSepatu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        NamaSepatu = findViewById(R.id.NamaSepatu);
        DetailSepatu = findViewById(R.id.DetailSepatu);
        FotoSepatu = findViewById(R.id.FotoSepatu);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("FotoSepatu") && getIntent().hasExtra("NamaSepatu")){
            String fotoSepatu = getIntent().getStringExtra("FotoSepatu");
            String namaSepatu = getIntent().getStringExtra("NamaSepatu");
            String detailSepatu = getIntent().getStringExtra("DetailSepatu");

            setData(fotoSepatu, namaSepatu, detailSepatu);
        }
    }
    private void setData(String fotoSepatu, String namaSepatu, String detailSepatu){
        Glide.with(this).asBitmap().load(fotoSepatu).into(FotoSepatu);
        NamaSepatu.setText(namaSepatu);
        DetailSepatu.setText(detailSepatu);
    }
}