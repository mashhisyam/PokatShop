package org.aplas.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;

    Button kirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer =new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                Intent intent=new Intent (MainActivity.this, ListSepatu.class);
                startActivity(intent);
                finish();
            }
        },2000);
    };

}