package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class  gallerymenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallerymenu);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_det")
                && getIntent().hasExtra("image_desc")){

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDet = getIntent().getStringExtra("image_det");
            String imageDesc = getIntent().getStringExtra("image_desc");

            setImage(imageUrl,imageName,imageDet,imageDesc);
        }

    }

    private void setImage( String imageUrl, String imageName, String imageDesc,String imageDet){
        TextView name = findViewById(R.id.img_desc1);
        name.setText(imageName);
        TextView det = findViewById(R.id.img_det1);
        det.setText(imageDesc);

        ImageView image = findViewById(R.id.image1);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
}
