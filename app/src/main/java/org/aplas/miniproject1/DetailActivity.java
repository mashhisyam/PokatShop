package org.aplas.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView FotoSepatuDetail;
    TextView NamaSepatuDetail, Sepatudetail, WarnaSepatu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        NamaSepatuDetail = findViewById(R.id.NamaSepatuDetail);
        Sepatudetail = findViewById(R.id.DetailSepatudetail);
        FotoSepatuDetail = findViewById(R.id.FotoSepatuDetail);
        WarnaSepatu = findViewById(R.id.WarnaSepatu);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("FotoSepatu") && getIntent().hasExtra("DetailSepatu")){
            String fotoSepatu = getIntent().getStringExtra("FotoSepatu");
            String namaSepatu = getIntent().getStringExtra("NamaSepatu");
            String detailSepatu = getIntent().getStringExtra("DetailSepatu");
            String warnaSepatu = getIntent().getStringExtra("WarnaSepatu");

            setData(fotoSepatu, namaSepatu, detailSepatu, warnaSepatu);
        }
    }
    private void setData(String fotoSepatu, String namaSepatu, String detailSepatu, String warnaSepatu){
        Glide.with(this).asBitmap().load(fotoSepatu).into(FotoSepatuDetail);
        NamaSepatuDetail.setText(namaSepatu);
        Sepatudetail.setText(detailSepatu);
        WarnaSepatu.setText(warnaSepatu);
    }
}