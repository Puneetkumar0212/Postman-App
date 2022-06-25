//package com.example.socialties;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class rvadapter extends RecyclerView.Adapter<rvadapter.ViewHolder> {
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data,parent,false);
//        return new ViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//
//        FirebaseDatabase.getInstance().getReference().child("visitor").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                if(snapshot.exists()) {
//
//                    for (DataSnapshot snapshot1 : snapshot.getChildren()) {
//                        Visitor i = snapshot1.getValue(Visitor.class);
//                        String t = i.getName();
//                        String k = i.getVnumber();
//                        String m = i.getAddress();
//                        String p = i.getReason();
//
//
//
//                        holder.vname.setText(t);
//                        holder.vadd.setText(k);
//                        holder.vphone.setText(m);
//                        holder.vreason.setText(p);
//
//                    }
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//      //  String t =
//      //  holder.vname.setText();
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//
//          public TextView vname ;
//        public TextView vadd ;
//        public TextView vphone ;
//        public TextView vreason ;
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            vname = (TextView) itemView.findViewById(R.id.vname);
//            vadd =(TextView) itemView.findViewById(R.id.vphone);
//            vphone =(TextView) itemView.findViewById(R.id.vaddress);
//            vreason =(TextView) itemView.findViewById(R.id.vreason);
//
//        }
//    }
//}
