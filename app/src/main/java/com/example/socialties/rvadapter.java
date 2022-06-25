package com.example.socialties;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class rvadapter extends RecyclerView.Adapter<rvadapter.ViewHolder> {


    Context context;
    ArrayList<Visitor> list ;
    public rvadapter(Context context, ArrayList<Visitor> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

      Visitor visitor =list.get(position);
      holder.vname.setText(visitor.getName());
      holder.vadd.setText(visitor.getAddress());
      holder.vphone.setText(visitor.getVnumber());
        holder.vreason.setText(visitor.getVnumber());
        holder.vdate.setText(visitor.getDate());
        holder.vtime.setText(visitor.getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


          public TextView vname ;
        public TextView vadd ;
        public TextView vphone ;
        public TextView vreason ;
        public TextView vdate;
        public TextView vtime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vname = (TextView) itemView.findViewById(R.id.vname);
            vadd =(TextView) itemView.findViewById(R.id.vphone);
            vphone =(TextView) itemView.findViewById(R.id.vaddress);
            vreason =(TextView) itemView.findViewById(R.id.vreason);
            vdate =(TextView) itemView.findViewById(R.id.vdate);
            vtime =(TextView) itemView.findViewById(R.id.vtime);


        }
    }
}
