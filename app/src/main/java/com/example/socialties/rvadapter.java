package com.example.socialties;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class rvadapter extends RecyclerView.Adapter<rvadapter.ViewHolder>  {






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
      holder.vreason.setText(visitor.getReason());
      holder.vdate.setText(visitor.getDate());
      holder.vtime.setText(visitor.getTime());
      holder.sno.setText(visitor.getSerialno());
      holder.reas.setText(visitor.getRemarks());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView reas ;
        public TextView vname ;
        public TextView vadd ;
        public TextView vphone ;
        public TextView vreason ;
        public TextView vdate;
        public TextView vtime;
        public TextView sno ;
       public TextView remarks ;
        public Button accbtn ;
        public Button rejbtn ;
        public TextView serialno;




        public ViewHolder(@NonNull View itemView) {


            super(itemView);
            reas = (TextView) itemView.findViewById(R.id.reas);
            vname = (TextView) itemView.findViewById(R.id.vname);
            vadd =(TextView) itemView.findViewById(R.id.vaddress);
            vphone =(TextView) itemView.findViewById(R.id.vphone);
            vreason =(TextView) itemView.findViewById(R.id.vreason);
            vdate =(TextView) itemView.findViewById(R.id.vdate);
            vtime =(TextView) itemView.findViewById(R.id.vtime);
              sno =(TextView) itemView.findViewById(R.id.textView9);
            accbtn = itemView.findViewById(R.id.button7);
            rejbtn =itemView.findViewById(R.id.button8);
            remarks = itemView.findViewById(R.id.remarks);

            serialno =itemView.findViewById(R.id.serialno);


//            String get_sno =sno.getText().toString();




            accbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.clear();
                    String get_remarks = "Accepted\n" + remarks.getText().toString();
                    String get_serial =sno.getText().toString();

                    FirebaseDatabase firebaseDatabase;
                    DatabaseReference reference;
                    firebaseDatabase =FirebaseDatabase.getInstance();
                    reference = firebaseDatabase.getReference().child("visitor");
//                    Visitor visitor = new Visitor();
//                    visitor.setRemarks(get_remarks);
                    reference.child(get_serial).child("remarks").setValue(get_remarks);
 //                   Log.d("RV Adapter", "Setting Remarks Complete");
                    notifyDataSetChanged();
                }
            });


        rejbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    list.clear();
                String get_remarks = "Rejected\n" + remarks.getText().toString();
                String get_serial =sno.getText().toString();

                FirebaseDatabase firebaseDatabase;
                DatabaseReference reference;
                firebaseDatabase =FirebaseDatabase.getInstance();
                reference = firebaseDatabase.getReference().child("visitor");
//                    Visitor visitor = new Visitor();
//                    visitor.setRemarks(get_remarks);
                reference.child(get_serial).child("remarks").setValue(get_remarks);
//                Log.d("RV Adapter", "Setting Remarks Complete");
                notifyDataSetChanged();

            }
        });


        }
    }
}
