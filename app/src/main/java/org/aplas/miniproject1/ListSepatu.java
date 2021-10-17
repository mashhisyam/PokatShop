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
    private ArrayList<String> detaiLSepatu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sepatu);

        getDataSepatu();
    }

    private void prosesRecyclerViewAdapter (){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ListSepatuAdapter adapter = new ListSepatuAdapter(fotoSepatu, namaSepatu, detaiLSepatu,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataSepatu(){
        namaSepatu.add("Nike Kyrie 7");
        fotoSepatu.add(R.drawable.kyrie7);
        detaiLSepatu.add("This Kyrie 7 “raygun” Features A Textile Upper In A Mix Of Black And Orange With Yellow Stitched Swooshes On The Sides. Other Details Includes A The “raygun” Mascot Above The Toe And Yellow Heel. A Black Midsole Atop A White Rubber Outsole Completes The D");

        namaSepatu.add("Nike Cosmic Unity");
        fotoSepatu.add(R.drawable.cosmic);
        detaiLSepatu.add("It's Made From At Least 25% Recycled Material By Weight And Comes Equipped With A Partially Recycled Air Zoom Strobel Designed To Help You Be Efficient Off The Dribble Or Effective On Defence.");

        namaSepatu.add("Nike Kobe V Protro Bruce Lee");
        fotoSepatu.add(R.drawable.kobe5);
        detaiLSepatu.add("This Nike Kobe 5 Protro Features A Red And Black Equipped With The Classic Snakeskin Texture Throughout The Upper. White Swooshes On The Sides Atop A Matching Colored Midsole And Translucent Outsole Completes The Design.");

        namaSepatu.add("Nike Kyrie 7 EP");
        fotoSepatu.add(R.drawable.kyrie7ep);
        detaiLSepatu.add("Quick First Step The Large Forefoot Air Zoom Turbo Unit Is Curved To Bend In Multiple Directions. It Provides Energy Return For Responsive Cornering");

        namaSepatu.add("Nike PG 5");
        fotoSepatu.add(R.drawable.pg5);
        detaiLSepatu.add("The Pg 5 Ep Combines The Agile Low-top Profile Paul Likes With Flexible Nike Air Dot Weld Strobel Cushioning. The Full-length Air Unit Is Stitched Directly To The Upper, Bringing The Plush, Bouncy Cushioning Right Up Under The Foot—perfect For Keeping Pg");

        namaSepatu.add("Nike KD 14 EP");
        fotoSepatu.add(R.drawable.kd14ep);
        detaiLSepatu.add("The Full-length Air Zoom Strobel Unit Is Stitched Directly To The Upper. It Helps Cut Unnecessary Weight And Provides Full-foot Responsiveness. Cushlon Foam Adds A Soft, Comfortable Sensation.");

        namaSepatu.add("Nike Lebron 18");
        fotoSepatu.add(R.drawable.lebron18);
        detaiLSepatu.add("from The City Of Akron, Ohio Moulded Into The Left Midsole, established Nineteen Eighty Four In The Right Midsole. Moulded, Padded Collar Fits Snugly Around The Ankle");

        namaSepatu.add("Nike Lebron 18 Low");
        fotoSepatu.add(R.drawable.lebron18low);
        detaiLSepatu.add("This Low-top Nike Lebron 18 Ditches The Knitposite 2.0 Upper For A Mesh-like Exterior With Molded/padded Ankle Support. Thick Taping Extends From The Midfoot To The Forefoot With An Air Max Heel Unit Atop A Translucent Outsole Completes The Design.");

        namaSepatu.add("Nike Kyrie Flytrap");
        fotoSepatu.add(R.drawable.kyrieflytrap);
        detaiLSepatu.add("Built For Kyrie Irving's Unmatchably Quick Game, The Kyrie Flytrap 3 Combines Full-foot Support And Containment, Responsive Cushioning And An Aggressive Outsole That's Contoured For Seamless Movement Through Impossibly Tight Lanes");

        namaSepatu.add("Nike PG 4");
        fotoSepatu.add(R.drawable.pg4);
        detaiLSepatu.add("Paul George Is The Rare High-percentage Shooter Who's Also A Coach's Dream On D. Designed For His Unrivaled 2-way Game, The Pg 4 Unveils A New Cushioning System That's Lightweight, Articulated And Responsive, Ideal For Players Like Pg Who Go Hard Every Pl");

        namaSepatu.add("Adidas D.O.N Issue 2");
        fotoSepatu.add(R.drawable.don);
        detaiLSepatu.add("Inspired By The Iconic And Creative Courts Scattered Throughout New York City, These Basketball Shoes Have A Purple Upper With Hints Of Orange And Blue That Represent The Unique And Colourful Expressions Of The City That Raised Spida.");

        namaSepatu.add("Adidas Harden Vol 4");
        fotoSepatu.add(R.drawable.harden);
        detaiLSepatu.add("Armed With The Style Of The Mvp Player You Admire, Go To The Court. James Harden's Signature Shoes Proposed By This Adidas Basketball Feature A Significantly Lighter Midsole. A Pair That Supports The Feet Of Players Running Around The Court At Full Speed.");

        prosesRecyclerViewAdapter();
    }
}