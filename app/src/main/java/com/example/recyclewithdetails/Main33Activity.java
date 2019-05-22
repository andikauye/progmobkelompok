package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main33Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
        TextView a = (TextView) findViewById(R.id.nama1);
        Bundle bundle=getIntent().getExtras();
        String b=bundle.getString("nama");
        TextView c = (TextView) findViewById(R.id.telpon1);
        String d=bundle.getString("telpon");
        TextView e = (TextView) findViewById(R.id.orang1);
        String f=bundle.getString("orang");
        TextView g = (TextView) findViewById(R.id.jam1);
        String h=bundle.getString("jam");
        TextView i = (TextView) findViewById(R.id.tanggal1);
        String j=bundle.getString("tanggal");
        TextView  k = (TextView) findViewById(R.id.pesanan1);
        String  l=bundle.getString("pesanan");
        a.setText(b);
        c.setText(d);
        e.setText(f);
        g.setText(h);
        i.setText(j);
        k.setText(l);

    }
    public void kembali(View view){
        Intent kembali = new Intent(Main33Activity.this,MainActivity.class);
        startActivity(kembali);
    }
}
