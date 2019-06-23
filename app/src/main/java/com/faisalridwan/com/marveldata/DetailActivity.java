package com.faisalridwan.com.marveldata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Marvel marvelmasuk = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView hero = (TextView)findViewById(R.id.tv_item_hero);
        TextView nama = (TextView)findViewById(R.id.tv_item_nama);
        TextView aktor = (TextView)findViewById(R.id.tv_item_aktor);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);

        Glide.with(this).load(marvelmasuk.getPhoto()).apply(new RequestOptions().override(350, 550)).into(gambar);
        hero.setText(marvelmasuk.getHero());
        nama.setText(marvelmasuk.getNama());
        aktor.setText(marvelmasuk.getAktor());
        deskripsi.setText(marvelmasuk.getDeskripsi());
        Log.i("photo", marvelmasuk.getPhoto());
        Log.i("deskripsi", marvelmasuk.getDeskripsi());

    }
}
