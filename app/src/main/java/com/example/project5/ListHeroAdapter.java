package com.example.project5;

import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListHeroAdapter extends RecyclerView.Adapter<ListHeroAdapter.ViewHolder> {

    private List<Hero>heros;

    public ListHeroAdapter(List<Hero> heros) {
        this.heros = heros;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hero, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hero hero = heros.get(position);
        holder.ivPhoto.setBackgroundResource(hero.getPhoto());
        holder.tvTitle.setText(hero.getName());
        holder.tvDetail.setText(hero.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(holder.itemView.getContext(),Details.class);
                a.putExtra("Photo", hero.getPhoto());
                a.putExtra("Judul", hero.getName());
                a.putExtra("Description", hero.getDetail());
                holder.itemView.getContext().startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return heros.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivPhoto;
        TextView tvTitle, tvDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPhoto =itemView.findViewById(R.id.iv_hero);
            tvTitle = itemView.findViewById(R.id.tv_hero_name);
            tvDetail = itemView.findViewById(R.id.tv_hero_detail);
        }
    }
}
