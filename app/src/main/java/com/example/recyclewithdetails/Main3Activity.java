package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText nama = (EditText) findViewById(R.id.nama);
        final EditText telpon = (EditText) findViewById(R.id.telpon);
        final EditText orang = (EditText) findViewById(R.id.orang);
        final EditText jam = (EditText) findViewById(R.id.jam);
        final EditText tanggal = (EditText) findViewById(R.id.tanggal);
        final EditText pesanan = (EditText) findViewById(R.id.pesanan);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pesantempat = new Intent(Main3Activity.this,Main33Activity.class);
                if (nama.getText().toString().length()==0){
                    nama.setError("Nama Belum Diisi");
                }else if (telpon.getText().toString().length()<11){
                    telpon.setError("No Telepon Salah");
                }else if (telpon.getText().toString().length()>12){
                    telpon.setError("No Telepon Salah");
                }else if (orang.getText().toString().length()==0){
                    orang.setError("Jumlah Orang Belum Diisi");
                }else if (jam.getText().toString().length()==0){
                    jam.setError("Jam Kedatangan Belum Diisi");
                }else if (tanggal.getText().toString().length()==0){
                    tanggal.setError("Tanggal Belum Diisi");
                }else if (pesanan.getText().toString().length()==0){
                    pesanan.setError("Pesanan Belum Diisi");
                }else {
                    pesantempat.putExtra("nama", nama.getText().toString());
                    pesantempat.putExtra("telpon", telpon.getText().toString());
                    pesantempat.putExtra("orang", orang.getText().toString());
                    pesantempat.putExtra("jam", jam.getText().toString());
                    pesantempat.putExtra("tanggal", tanggal.getText().toString());
                    pesantempat.putExtra("pesanan", pesanan.getText().toString());
                    startActivity(pesantempat);
                }
            }


        });
    }

}
