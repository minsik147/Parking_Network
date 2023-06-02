package kr.ac.mokwon.parkingnetwork;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerBookMarker extends RecyclerView.Adapter<AdapterRecyclerBookMarker.ViewHolder>
{
    int ID;
    private ArrayList<itemBookMarker> data = null;

    public AdapterRecyclerBookMarker(ArrayList<itemBookMarker> date)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public AdapterRecyclerBookMarker.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.list_parking, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position)
    {
        itemBookMarker item = data.get(position);

        holder.name.setText(item.getName());
        holder.address.setText(item.getAddress());
    }

    @Override
    public int getItemCount()
    {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, address;
        public ViewHolder(@NonNull View view)
        {
            super(view);
            name = view.findViewById(R.id.str_name);
            address = view.findViewById(R.id.str_address);
        }
    }
}
