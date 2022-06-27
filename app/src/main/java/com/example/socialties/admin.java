package com.example.socialties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;

public class admin extends AppCompatActivity {


//        private TextView vname;
//        private TextView vaddress;
//        private TextView vphone;
//        private TextView vreason;
//    private TextView text1 ;
//      private TextView text2 ;
//      private TextView text3 ;
//    private TextView text4 ;
//    private TextView text5 ;
//    private TextView text6 ;
  //  private Button logout;

    RecyclerView recyclerView ;
    DatabaseReference database;
    rvadapter rvadapter;
    ArrayList<Visitor> list ;
    RadioGroup radioGroup;
    RadioButton accept;
    RadioButton reject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

  //      logout =findViewById(R.id.button9);
        recyclerView =findViewById(R.id.rvlist);
        database = FirebaseDatabase.getInstance().getReference("visitor");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        radioGroup= findViewById(R.id.radiogroup);
        accept = findViewById(R.id.acceptbtn);
        reject = findViewById(R.id.rejectbtn);


        list = new ArrayList<>();
        rvadapter = new rvadapter(this,list);
        recyclerView.setAdapter(rvadapter);
            list.clear();
        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren()){

                    Visitor visitor = dataSnapshot.getValue(Visitor.class);

                    list.add(visitor);


                }

                rvadapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(admin.this, MainActivity.class));
//                Toast.makeText(admin.this, "Logout Successfull", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
//        list = findViewById(R.id.list);
//        logout.findViewById(R.id.button7);
//        text1 = findViewById(R.id.vname);
//        text2 =findViewById(R.id.vphone);
//        text3 =findViewById(R.id.vaddress);
//        text4 =findViewById(R.id.vreason);
//        text5 =findViewById(R.id.vdate);
//        text6 =findViewById(R.id.vtime);
//        FirebaseDatabase.getInstance().getReference().child("visitor").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                if(snapshot.exists())
//                {
//
//                    for(DataSnapshot snapshot1:snapshot.getChildren())
//                    {
//                        Visitor i =snapshot1.getValue(Visitor.class);
//                        String t =i.getName() ;
//                        String k =i.getVnumber() ;
//                        String m =i.getAddress() ;
//                        String p =i.getReason();
//                        String q=i.getDate();
//                        String w =i.getTime();
//
//                        text1.setText(t);
//                        text2.setText(k);
//                        text3.setText(m);
//                        text4.setText(p);
//                        text5.setText(q);
//                        text6.setText(w);
                        //   + "\n"+ i.getAddress()+ "\n"+ i.getVnumber()+ "\n"+ i.getReason()
//                        ArrayList<String> a = new ArrayList<>();
//                        ArrayAdapter adapter = new ArrayAdapter<String>(admin.this,R.layout.data);
//                        list.setAdapter(adapter);
//
  //                 }
//                    adapter.notifyDataSetChanged();
  //              }
//            }

//           @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

  //  }
//}