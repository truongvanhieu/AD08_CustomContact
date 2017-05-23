package com.android.hkh.ad08_customcontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView myListView;
    private MyArrayAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step1. Link
        myListView = (ListView) findViewById(R.id.mylistview);
        //step2. Create data source
        ArrayList<Person> arrayPersonData = new ArrayList<>();
        arrayPersonData.add(new Person("Nguyen Van A", "0905123123"));
        arrayPersonData.add(new Person("Nguyen Van B", "0905123124"));
        arrayPersonData.add(new Person("Nguyen Van C", "0905123125"));
        arrayPersonData.add(new Person("Nguyen Van D", "0905123126"));
        arrayPersonData.add(new Person("Nguyen Van E", "0905123127"));
        arrayPersonData.add(new Person("Nguyen Van F", "0905123128"));
        //step3. Create Adapter
        myAdapter = new MyArrayAdapter(this, R.layout.layout_contact, arrayPersonData);
        //step4. link adapter to listview
        myListView.setAdapter(myAdapter);
        //step5. Regist listener for listview
        myListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Person person = myAdapter.getItem(position);
        person.setName("Test Test");
        myAdapter.notifyDataSetChanged();

        Toast.makeText(MainActivity.this, person.getName() +"-"+person.getPhone(), Toast.LENGTH_SHORT).show();
    }
}
