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

public class rvadapter2 extends RecyclerView.Adapter<rvadapter2.ViewHolder> {


    Context context;
    ArrayList<Visitor> list ;
    public rvadapter2(Context context, ArrayList<Visitor> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data2,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Visitor visitor =list.get(position);
        holder.vname.setText(visitor.getName());
        holder.vadd.setText(visitor.getAddress());
        holder.vphone.setText(visitor.getVnumber());
        holder.vreason.setText(visitor.getReason());
        holder.vdate.setText(visitor.getDate());
        holder.vtime.setText(visitor.getTime());
        holder.sno.setText(visitor.getSerialno());
        holder.response.setText(visitor.getRemarks());
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
        public TextView sno;
        public TextView response;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            vname = (TextView) itemView.findViewById(R.id.vname);
            vadd =(TextView) itemView.findViewById(R.id.vaddress);
            vphone =(TextView) itemView.findViewById(R.id.vphone);
            vreason =(TextView) itemView.findViewById(R.id.vreason);
            vdate =(TextView) itemView.findViewById(R.id.vdate);
            vtime =(TextView) itemView.findViewById(R.id.vtime);
            sno =(TextView) itemView.findViewById(R.id.textView8);
            response =(TextView) itemView.findViewById(R.id.textView7);


        }
    }
}
