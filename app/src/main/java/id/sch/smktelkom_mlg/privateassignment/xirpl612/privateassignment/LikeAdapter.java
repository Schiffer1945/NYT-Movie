package id.sch.smktelkom_mlg.privateassignment.xirpl612.privateassignment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Fariz on 13-Jun-17.
 */

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.ViewHolder> {
    private final Context context;
    ArrayList<LikeItem> lItem;

    public LikeAdapter(ArrayList<LikeItem> lItem, Context context) {
        this.context = context;
        this.lItem = lItem;
    }

    @Override
    public LikeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.like_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(LikeAdapter.ViewHolder holder, int position) {

        final LikeItem favItem = lItem.get(position);
        holder.textViewD.setText(favItem.judul);
        holder.textViewH.setText(favItem.deskripsi);
        Glide
                .with(context)
                .load(favItem.urlgambar)
                .into(holder.imageViewL);

    }

    @Override
    public int getItemCount() {
        return lItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewH;
        public TextView textViewD;
        public ImageView imageViewL;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewH = (TextView) itemView.findViewById(R.id.textViewHeadet);
            textViewD = (TextView) itemView.findViewById(R.id.textViewDescet);
            imageViewL = (ImageView) itemView.findViewById(R.id.imageViewdt);
        }
    }
}
