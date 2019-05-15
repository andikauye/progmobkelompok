package com.example.recyclewithdetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<String> tempat1 = new ArrayList<>();
    private ArrayList<String> parent_layout1 = new ArrayList<>();
    private ArrayList<String> parent_layout2 = new ArrayList<>();
    private ArrayList<String> parent_layout3 = new ArrayList<>();
    private ArrayList<String> parent_layout4 = new ArrayList<>();
    private ArrayList<String> tempat11 = new ArrayList<>();
    private ArrayList<String> tempat12 = new ArrayList<>();
    private ArrayList<String> tempat13 = new ArrayList<>();
    private ArrayList<String> image_name = new ArrayList<>();
    private ArrayList<String> image_name1 = new ArrayList<>();
    private ArrayList<String> image_name2 = new ArrayList<>();
    private ArrayList<String> image_name3 = new ArrayList<>();
    private ArrayList<String> image_desc = new ArrayList<>();
    private ArrayList<String> image_desc1 = new ArrayList<>();
    private ArrayList<String> image_desc2 = new ArrayList<>();
    private ArrayList<String> image_desc3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void kepesan (View view) {
        Intent ayopesan= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(ayopesan);
    }

    public void kepesan2 (View view) {
        Intent ayopesan2= new Intent(MainActivity.this,Main4Activity.class);
        startActivity(ayopesan2);
    }

    public void kepesan3 (View view) {
        Intent ayopesan3= new Intent(MainActivity.this,Main5Activity.class);
        startActivity(ayopesan3);
    }

    public void kepesan4 (View view) {
        Intent ayopesan4= new Intent(MainActivity.this,Main6Activity.class);
        startActivity(ayopesan4);
    }


}
