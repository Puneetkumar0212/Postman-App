package com.example.socialties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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


      private ListView list;
      private TextView text1 ;
      private TextView text2 ;
      private TextView text3 ;
    private TextView text4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
 //       list = findViewById(R.id.list);
//
//        ArrayList<String> a = new ArrayList<>();
//        ArrayAdapter adapter = new ArrayAdapter<String>(admin.this,R.layout.activity_visitor_rv,a);
//        list.setAdapter(adapter);
        text1 = findViewById(R.id.vname);
        text2 =findViewById(R.id.vphone);
        text3 =findViewById(R.id.vaddress);
        text4 =findViewById(R.id.vreason);
        FirebaseDatabase.getInstance().getReference().child("visitor").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                {

                    for(DataSnapshot snapshot1:snapshot.getChildren())
                    {
                        Visitor i =snapshot1.getValue(Visitor.class);
                        String t =i.getName() ;
                        String k =i.getVnumber() ;
                        String m =i.getAddress() ;
                        String p =i.getReason();

                        text1.setText(t);
                        text2.setText(k);
                        text3.setText(m);
                        text4.setText(p);
                        //   + "\n"+ i.getAddress()+ "\n"+ i.getVnumber()+ "\n"+ i.getReason()

//
                   }

//                    adapter.notifyDataSetChanged();
                }
            }

           @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
}