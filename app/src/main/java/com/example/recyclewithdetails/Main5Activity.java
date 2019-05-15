package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> Kopi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://www.islampos.com/wp-content/uploads/2018/02/cappucino-.jpg");
        mNames.add("Cappunino");
        mDesc.add("Rp. 45.000");


        mImageUrls.add("https://previews.123rf.com/images/eaknixma/eaknixma1608/eaknixma160800012/62744528-cup-of-delicious-hot-cafe-latte-.jpg");
        mNames.add("Cafe Latte");
        mDesc.add("Rp. 47.000");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/01/25/22/25/coffee-3107235_960_720.jpg");
        mNames.add("Espresso");
        mDesc.add("Rp. 25.000");

        mImageUrls.add("https://www.pegipegi.com/travel/wp-content/uploads/2015/02/Foto-2-Kenalan-Dengan-Varian-Rasa-Kopi.jpg");
        mNames.add("Americano");
        mDesc.add("Rp. 35.000");

        mImageUrls.add("https://thumb.viva.co.id/media/frontend/thumbs3/2013/01/14/187635_kopi_665_374.jpg");
        mNames.add("Kopi Tubruk");
        mDesc.add("Rp. 20.000");

        mImageUrls.add("https://assets-a1.kompasiana.com/items/album/2017/06/17/editkopsus-5944ab4d66afbd3432b13067.png");
        mNames.add("Kopi Susu");
        mDesc.add("Rp. 30.000");




        initRecyclerView();

    }


    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view5);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DaftarKopi adapter = new DaftarKopi(this, mNames, mImageUrls, mDesc,Kopi);
        recyclerView.setAdapter(adapter);

    }

    public void pesan3(View view) {
        Intent lanjutpesan3= new Intent(Main5Activity.this,Main3Activity.class);
        startActivity(lanjutpesan3);
    }
}
