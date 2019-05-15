package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> Kopi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://www.islampos.com/wp-content/uploads/2018/02/cappucino-.jpg");
        mNames.add("Cappucino");
        mDesc.add("Rp. 26.000");


        mImageUrls.add("https://previews.123rf.com/images/eaknixma/eaknixma1608/eaknixma160800012/62744528-cup-of-delicious-hot-cafe-latte-.jpg");
        mNames.add("Cafee Latte");
        mDesc.add("Rp. 33.000");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/01/25/22/25/coffee-3107235_960_720.jpg");
        mNames.add("Espresso");
        mDesc.add("Rp. 19.000");

        mImageUrls.add("https://www.pegipegi.com/travel/wp-content/uploads/2015/02/Foto-2-Kenalan-Dengan-Varian-Rasa-Kopi.jpg");
        mNames.add("Americano");
        mDesc.add("Rp. 19.000");

        mImageUrls.add("https://cdn.shopify.com/s/files/1/0668/2207/products/50-0453_CappuccinoMix_HotChocolateSupreme_SecondaryImage_800x.png?v=1517428447");
        mNames.add("Hot Chocolate");
        mDesc.add("Rp. 33.000");

        mImageUrls.add("https://lh3.googleusercontent.com/48e1bZEdItbUGX1Wk_O0fInKb5U3kDqCX1uSqX7uDxNcwVaAz00p3ThTXpHNhudRzUyk4u24Mmc=w1366-h768-no");
        mNames.add("Mocha Frappe");
        mDesc.add("Rp. 55.000");


        initRecyclerView();

    }


    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view2);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DaftarKopi adapter = new DaftarKopi(this, mNames, mImageUrls, mDesc,Kopi);
        recyclerView.setAdapter(adapter);

    }

    public void pesan(View view) {
        Intent lanjutpesan= new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(lanjutpesan);
    }
}
