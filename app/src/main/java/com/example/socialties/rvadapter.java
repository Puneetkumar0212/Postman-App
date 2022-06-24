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
//        String t =
//        holder.vname.setText();
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
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
