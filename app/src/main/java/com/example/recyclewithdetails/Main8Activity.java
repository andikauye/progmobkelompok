package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main8Activity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> Kopi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("http://maisonvie.co.uk/wp-content/uploads/2019/01/cappuccino-2029-e80b7c6d318c7862df2c4c8623a11f99@1x-1.jpg");
        mNames.add("Cappucino");
        mDesc.add("Rp. 29.000");


        mImageUrls.add("https://images-gmi-pmc.edge-generalmills.com/db067911-96de-44da-b0bd-02cd8472810d.jpg");
        mNames.add("Hazelnut ");
        mDesc.add("Rp. 29.000");

        mImageUrls.add("https://homequipment.com/assets/images/what-is-espresso.jpg");
        mNames.add("Espresso");
        mDesc.add("Rp. 20.000");

        mImageUrls.add("https://www.pegipegi.com/travel/wp-content/uploads/2015/02/Foto-2-Kenalan-Dengan-Varian-Rasa-Kopi.jpg");
        mNames.add("Americano");
        mDesc.add("Rp. 19.000");

        mImageUrls.add("http://beanbrewding.com.au/wp-content/uploads//2012/12/coffee_lab1.jpg");
        mNames.add("Black Iced");
        mDesc.add("Rp. 27.000");

        mImageUrls.add("https://www.chocolatemoosey.com/wp-content/uploads/2016/03/Toasted-Coconut-Mochas-2263.jpg");
        mNames.add("Cofee Mocha");
        mDesc.add("Rp. 29.000");


        initRecyclerView();

    }


    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view8);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DaftarKopi adapter = new DaftarKopi(this, mNames, mImageUrls, mDesc,Kopi);
        recyclerView.setAdapter(adapter);

    }

    public void pesan(View view) {
        Intent lanjutpesan= new Intent(Main8Activity.this,Main3Activity.class);
        startActivity(lanjutpesan);
    }


}
