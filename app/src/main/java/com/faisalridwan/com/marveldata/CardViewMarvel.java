package com.faisalridwan.com.marveldata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMarvel extends RecyclerView.Adapter<CardViewMarvel.CardViewHolder> {

    private ArrayList<Marvel> listMarvel;
    private Context context;
    private Activity activity;

    public CardViewMarvel(Context context) {
        this.context = context;
    }

    public ArrayList<Marvel> getListMarvel() {
        return listMarvel;
    }

    public void setListMarvel(ArrayList<Marvel> listMarvel) {
        this.listMarvel = listMarvel;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_marvel, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Marvel m = getListMarvel().get(position);
        Glide.with(context)
                .load(m.getPhoto())
                .apply(new RequestOptions().override(250, 450))
                .into(holder.imgPhoto);
        holder.tvhero.setText(m.getHero());
        holder.tvnama.setText(m.getNama());
        holder.marvel = m;



        holder.btnsahre.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "You Share "+getListMarvel().get(position).getHero(), Toast.LENGTH_SHORT).show();
            }
        }));


    }

    @Override
    public int getItemCount() {
        return getListMarvel().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvhero, tvnama;
        Button btndetail, btnsahre;
        Marvel marvel;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvhero = (TextView)itemView.findViewById(R.id.tv_item_hero);
            tvnama = (TextView)itemView.findViewById(R.id.tv_item_nama);
            btnsahre = (Button)itemView.findViewById(R.id.btn_set_share);
            btndetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            btndetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("key", marvel);
            context.startActivity(intent);
        }
    }
}
