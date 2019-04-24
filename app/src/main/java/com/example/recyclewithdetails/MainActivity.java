package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/US_Navy_090606-N-5650M-004_Fire_Controlman_2nd_Class_Christopher_Sabens%2C_stationed_on_USS_Forrest_Sherman_%28DDG_98%29%2C_shoots_a_goal.jpg/1200px-US_Navy_090606-N-5650M-004_Fire_Controlman_2nd_Class_Christopher_Sabens%2C_stationed_on_USS_Forrest_Sherman_%28DDG_98%29%2C_shoots_a_goal.jpg");
        mNames.add("Sepak Bola");
        mDesc.add("FIFA");
        mImageDet.add("Sepak bola adalah cabang olahraga yang menggunakan bola yang umumnya terbuat dari bahan kulit dan dimainkan oleh dua tim yang masing-masing beranggotakan 11 orang pemain inti dan beberapa pemain cadangan.");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/3/38/Volleyball_game.jpg");
        mNames.add("Bola Voli");
        mDesc.add("FIVB");
        mImageDet.add("Bola voli adalah permainan olahraga yang dimainkan oleh dua grup berlawanan. Masing-masing grup memiliki enam orang pemain. Terdapat pula variasi permainan bola voli pantai yang masing-masing grup hanya memiliki dua orang pemain.");

        mImageUrls.add("https://1.bp.blogspot.com/-UyAEVhczdAs/WF3ovgeN3YI/AAAAAAAAA28/B3XO8Hxu0TQMH5yFWgW11QXP5qkk82WPACLcB/s1600/pengertian%2Bbola%2Bbasket.jpg");
        mNames.add("Bola Basket");
        mDesc.add("FIBA");
        mImageDet.add("Bola basket adalah olahraga bola berkelompok yang terdiri atas dua tim beranggotakan masing-masing lima orang yang saling bertanding mencetak poin dengan memasukkan bola ke dalam keranjang lawan.");

        mImageUrls.add("https://d1u4oo4rb13yy8.cloudfront.net/article/77635-bvbpgekprx-1514450255.JPG");
        mNames.add("Badminton");
        mDesc.add("IBF");
        mImageDet.add("Bulu tangkis atau badminton adalah suatu olahraga raket yang dimainkan oleh dua orang (untuk tunggal) atau dua pasangan (untuk ganda) yang saling berlawanan.");

        mImageUrls.add("http://www.jwj.org/wp-content/uploads/2018/03/baseball-2410657_960_720.jpg");
        mNames.add("Bisbol");
        mDesc.add("IBAF");
        mImageDet.add("Bisbol, bola kasti atau dikenal dengan baseball adalah olahraga yang dimainkan dua tim. Pelempar dari tim yang melempar berusaha melempar bola yang disebut bola bisbol, sedangkan pemain dari tim yang memukul berusaha memukul bola dengan menggunakan tongkat pemukul.");

        mImageUrls.add("https://img.okeinfo.net/content/2018/08/26/601/1941509/indonesia-menanti-kejutan-zohri-di-cabor-atletik-asian-games-2018-ktWkIdhX6U.jpg");
        mNames.add("Atletik");
        mDesc.add("IAAF");
        mImageDet.add("Atletik adalah gabungan dari beberapa jenis olahraga yang secara garis besar dapat dikelompokkan menjadi lari, lempar, lompat, dan jalan. Kata ini berasal dari bahasa Yunani \"athlon\" yang berarti \"kontes\". Atletik merupakan cabang olahraga yang diperlombakan pada olimpiade pertama pada 776 SM.");

        mImageUrls.add("https://4.bp.blogspot.com/-grNqvn95K_U/WCNqhR-ex_I/AAAAAAAAC3E/EZ9C82Zp0bQplFZr5Nq--oOOSNhUQi8ewCLcB/s1600/Cara-Bermain-Catur-untuk-Pemula.jpg");
        mNames.add("Catur");
        mDesc.add("FIDE");
        mImageDet.add("Catur adalah permainan strategi yang dimainkan pada sebuah papan persegi yang terbagi menjadi 64 kotak, dengan 32 buah catur yang terbagi sama rata dalam kelompok warna terang (\"putih\") dan gelap (\"hitam\"). Permainan ini dimainkan oleh dua orang. Sebelum bertanding, pemain harus mengetahui peraturan catur, kemudian memilih warna buah catur yang akan dimainkan. Masing-masing pemain memiliki 16 buah catur dengan bentuk dan nama yang berbeda untuk dimainkan: satu raja, satu menteri, dua benteng, dua kuda, dua gajah, dan delapan bidak. Masing-masing buah catur juga memiliki aturan pergerakan yang berbeda-beda. Pemegang buah putih memulai langkah pertama, yang selanjutnya diikuti oleh pemegang buah hitam secara bergantian sampai permainan selesai.");

        mImageUrls.add("https://cdn.sindonews.net/dyn/620/content/2017/08/27/50/1234303/setelah-satu-pertarungan-lagi-cotto-gantung-sarung-tinju-1pG.JPG");
        mNames.add("Tinju");
        mDesc.add("AIBA");
        mImageDet.add("Tinju adalah olahraga dan seni bela diri yang menampilkan dua orang partisipan dengan berat yang serupa bertanding satu sama lain dengan menggunakan tinju mereka dalam rangkaian pertandingan berinterval satu atau tiga menit yang disebut ronde.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}