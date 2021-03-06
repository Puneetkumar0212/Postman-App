package com.example.socialties;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Start extends AppCompatActivity {

    private Button logout;
    private Button adminpage;
    private TextView Name;
    private Button send;
    private TextView VisitorNumber ;
    private TextView Address ;
    private TextView Reason ;

    FirebaseDatabase rootnode;
    DatabaseReference reference ;
//    ArrayList<String> datacol = new ArrayList<String>();
//    String get_name = name.getText().toString();
//    String get_phone = vnumber.getText().toString();
//    String get_address = address.getText().toString();
//    String get_reason = reason.getText().toString();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        logout = findViewById(R.id.button5);
 //       adminpage = findViewById(R.id.button7);
        Name = findViewById(R.id.editTextTextPersonName2);
        send = findViewById(R.id.button6);
        VisitorNumber =findViewById(R.id.editTextTextPersonName3);
        Address =findViewById(R.id.editTextTextPersonName4);
        Reason=findViewById(R.id.editTextTextPersonName5);

// we made a array list to store all the data like name, address, phone number and  reason and fin ally the arraylist is used.
//        ArrayList<String> datacol = new ArrayList<String>();
//        String get_name = name.getText().toString();
//        String get_phone = vnumber.getText().toString();
//        String get_address = address.getText().toString();
//        String get_reason = reason.getText().toString();
//        Values are added to array list so that it should hava no complexity or comma seperation.
//        datacol.add(get_name);
//        datacol.add(get_phone);
//        datacol.add(get_address);
//        datacol.add(get_reason);
//        datacol.add("  Visitor Name :"+get_name+"\n"+"Phone Number :"+get_phone+"\n"+"Address :"+get_address+"\n"+"Reason :"+ get_reason+"  ");


     //   DAOVisitor daoVisitor = new DAOVisitor();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get_name = Name.getText().toString();
                String get_phone = VisitorNumber.getText().toString();
                String get_address = Address.getText().toString();
                String get_reason = Reason.getText().toString();


                rootnode = FirebaseDatabase.getInstance();
                reference = rootnode.getReference().child("visitor");

                Visitor visitor = new Visitor(get_name, get_phone, get_address, get_reason);
                reference.child(get_phone).setValue(visitor);

                Toast.makeText(Start.this, "Details Send Successfully", Toast.LENGTH_SHORT).show();

            }
    //            Visitor visitor = new Visitor(get_name,get_address,get_phone,get_reason);

//                String sms_number = number.getText().toString().trim();
//                String sms = datacol.toString().trim();
//
//
//                if (ContextCompat.checkSelfPermission(Start.this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
//                    sendsms();
//                } else {
//                    ActivityCompat.requestPermissions(Start.this, new String[]{Manifest.permission.SEND_SMS}, 0);
//                }

        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Start.this, "Logout Sucessfull", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Start.this, MainActivity.class));
            }
        });


    }


//    private void sendsms() {
//        ArrayList<String> datacol = new ArrayList<String>();
//        String get_name = name.getText().toString();
//        String get_phone = vnumber.getText().toString();
//        String get_address = address.getText().toString();
//        String get_reason = reason.getText().toString();
//
//        datacol.add("  Visitor Name :"+get_name+"\n"+"Phone Number :"+get_phone+"\n"+"Address :"+get_address+"\n"+"Reason :"+ get_reason+"  ");
//
//
//        String sms_number = number.getText().toString().trim();
//        String sms = datacol.toString().trim();
//
//        if (!number.getText().toString().equals("") && !datacol.toString().equals("")) {
//            SmsManager smsmanager = SmsManager.getDefault();
//            smsmanager.sendTextMessage(sms_number, null, sms, null, null);
//
//            Toast.makeText(this, "Send Sucessfull", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Enter the above delails", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//
//        switch (requestCode) {
//
//            case 0:
//
//                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
//                    ;
//
//            {
//                sendsms();
//            }
//        }
//    }
}
