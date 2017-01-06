package biz.avasoft.com.mycustomsdkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import biz.avasoft.com.myapplication.ContactUs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent contactusIntent = new Intent(this,ContactUs.class);
        contactusIntent.putExtra("Title", "Mail Us");
        contactusIntent.putExtra("Field1", "Your Name");
        contactusIntent.putExtra("Field2", "Mail ID");
        contactusIntent.putExtra("Field3", "Phone");
        startActivity(contactusIntent);

    }
}
