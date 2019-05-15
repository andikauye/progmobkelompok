package com.example.recyclewithdetails;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageDesc = new ArrayList<>();
    private ArrayList<String> parent_layout4 = new ArrayList<>();
    private ArrayList<String> image_desc = new ArrayList<>();
    private ArrayList<String> image_desc1 = new ArrayList<>();
    private ArrayList<String> image_desc2 = new ArrayList<>();
    private ArrayList<String> image_desc3 = new ArrayList<>();



    private Context mContext;

    public RecycleViewAdapter(Context mContext,ArrayList<String> mImageNames, ArrayList<String> mImages,
                              ArrayList<String> mImageDesc, ArrayList<String> Kopi, ArrayList<String> tempat1,
                              ArrayList<String> tempat11, ArrayList<String> tempat12, ArrayList<String> tempat13,
                              ArrayList<String> parent_layout1, ArrayList<String> parent_layout2, ArrayList<String> parent_layout3,
                              ArrayList<String> image_name, ArrayList<String> image_name1, ArrayList<String> image_name2,
                              ArrayList<String> image_name3, ArrayList<String> image_desc,ArrayList<String> image_desc2,
                              ArrayList<String> image_desc3) {
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mImageDesc = mImageDesc;
        this.mContext = mContext;
        this.parent_layout4 = parent_layout4;
        this.image_desc = image_desc;
        this.image_desc2 = image_desc2;
        this.image_desc1 = image_desc1;
        this.image_desc3 = image_desc3;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(i))
                .into(holder.image);
        holder.imageName.setText(mImageNames.get(i));
        holder.imageDesc.setText(mImageDesc.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ mImageNames.get(i));
                Toast.makeText(mContext, mImageNames.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, Main2Activity.class);
                mContext.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        TextView imageDesc;
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageDesc = itemView.findViewById(R.id.image_desc);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
