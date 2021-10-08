package org.aplas.miniproject1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rishabhharit.roundedimageview.RoundedImageView;

import java.util.ArrayList;

public class ListSepatuAdapter extends RecyclerView.Adapter<ListSepatuAdapter.ViewHolder>{

    private ArrayList<String> fotoSepatu = new ArrayList<>();
    private ArrayList<String> namaSepatu = new ArrayList<>();
    private Context context;

    public ListSepatuAdapter(ArrayList<String> fotoSepatu, ArrayList<String> namaSepatu, Context context) {
        this.fotoSepatu = fotoSepatu;
        this.namaSepatu = namaSepatu;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_sepatu_adapter,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotoSepatu.get(position)).into(holder.FotoSepatu);

        holder.NamaSepatu.setText(namaSepatu.get(position));
    }

    @Override
    public int getItemCount() {
        return namaSepatu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView FotoSepatu;
        TextView NamaSepatu;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            FotoSepatu = itemView.findViewById(R.id.FotoSepatu);
            NamaSepatu = itemView.findViewById(R.id.NamaSepatu);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}