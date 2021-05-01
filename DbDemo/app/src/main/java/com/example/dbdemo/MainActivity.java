package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dbdemo.adapter.RecyclerViewAdapter;
import com.example.dbdemo.data.MyDbHandler;
import com.example.dbdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   // ListView listView;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private ArrayList<Contact> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MyDbHandler db = new MyDbHandler(MainActivity.this);
       //creating a contact
        Contact rahul = new Contact();
        rahul.setPhoneNumber("8690844152");

        rahul.setName("Rahul");
       //adding contacts
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);
         db.addContact(rahul);


        contactArrayList = new ArrayList<>() ;
        List<Contact> allContacts= db.getAllContacts();
        for(Contact contact: allContacts)
        {
            Log.d("dbrahul","Id:"+ contact.getId() +"\n"+ "Name: " + contact.getName() +"\n"+ "Phone number:" + contact.getPhoneNumber() + "\n");
            contactArrayList.add(contact);
        }
        //use ur recyclerView

        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}