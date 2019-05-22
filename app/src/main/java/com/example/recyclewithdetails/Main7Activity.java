package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> Kopi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Flat_white_coffee_with_pretty_feather_pattern.jpg/220px-Flat_white_coffee_with_pretty_feather_pattern.jpg");
        mNames.add("Flat White");
        mDesc.add("Rp. 24.000");


        mImageUrls.add("https://static1.squarespace.com/static/50e25057e4b0395512a28b45/t/535c57fee4b04f774f7974ce/1398560767228/Long+Black");
        mNames.add("Long Black");
        mDesc.add("Rp. 24.000");

        mImageUrls.add("https://mcdonalds.com.au/sites/mcdonalds.com.au/files/Product-Details-Macchiato-mobile.jpg");
        mNames.add("Macchiato");
        mDesc.add("Rp. 20.000");

        mImageUrls.add("https://cdn.jamieoliver.com/home/wp-content/uploads/features-import/2015/04/feature-header1.jpg");
        mNames.add("Affogato");
        mDesc.add("Rp.25.000");

        mImageUrls.add("https://food.fnr.sndimg.com/content/dam/images/food/fullset/2017/11/7/0/KC1508_Fireside-Brulee-Coffee_s4x3.jpg.rend.hgtvcom.616.462.suffix/1510075522721.jpeg");
        mNames.add("Creme Brulee");
        mDesc.add("Rp. 29.000");

        mImageUrls.add("https://dpegb9ebondhq.cloudfront.net/product_photos/51399401/expresso_original.jpg");
        mNames.add("espresso");
        mDesc.add("Rp. 18.000");


        initRecyclerView();

    }


    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view7);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DaftarKopi adapter = new DaftarKopi(this, mNames, mImageUrls, mDesc,Kopi);
        recyclerView.setAdapter(adapter);

    }

    public void pesan(View view) {
        Intent lanjutpesan= new Intent(Main7Activity.this,Main3Activity.class);
        startActivity(lanjutpesan);
    }


}
