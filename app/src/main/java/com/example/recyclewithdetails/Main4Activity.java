package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> Kopi = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://www.islampos.com/wp-content/uploads/2018/02/cappucino-.jpg");
        mNames.add("Cappunino");
        mDesc.add("Rp. 42.000");


        mImageUrls.add("https://previews.123rf.com/images/eaknixma/eaknixma1608/eaknixma160800012/62744528-cup-of-delicious-hot-cafe-latte-.jpg");
        mNames.add("Cafe Latte");
        mDesc.add("Rp. 42.000");

        mImageUrls.add("https://gatherforbread.com/wp-content/uploads/2014/10/Dark-Chocolate-Mocha-Square.jpg");
        mNames.add("Mocha");
        mDesc.add("Rp. 45.000");

        mImageUrls.add("https://www.pegipegi.com/travel/wp-content/uploads/2015/02/Foto-2-Kenalan-Dengan-Varian-Rasa-Kopi.jpg");
        mNames.add("Americano");
        mDesc.add("Rp. 30.000");

        mImageUrls.add("https://4.bp.blogspot.com/-Gjx9vVNyHXM/WXmwwj-iI0I/AAAAAAAAG1I/_JJc6qiEkec7_2ap_4X8MU4jyzBgbjl0QCEwYBhgL/s1600/FullSizeRender.jpg");
        mNames.add("Black Forest Latte");
        mDesc.add("Rp. 48.000");

        mImageUrls.add("https://www.cookingclassy.com/wp-content/uploads/2012/11/orange+chocolate+chip+cookies+2edited.jpg");
        mNames.add("Orange Cookies");
        mDesc.add("Rp. 52.000");

        mImageUrls.add("https://amyshealthybaking.com/wp-content/uploads/2018/05/blueberry-cookies-4701.jpg");
        mNames.add("BlueBerry Cookies");
        mDesc.add("Rp. 52.000");


        initRecyclerView();

    }


    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view4);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DaftarKopi adapter = new DaftarKopi(this, mNames, mImageUrls, mDesc,Kopi);
        recyclerView.setAdapter(adapter);

    }

    public void pesan2(View view) {
        Intent lanjutpesan2= new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(lanjutpesan2);
    }
}
