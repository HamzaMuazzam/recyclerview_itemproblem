package com.example.new_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<My_modelclass> list;
    my_Adapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
       /* dataBase = new DataBase(this);
        sqLiteDatabase = dataBase.getWritableDatabase();

*/
        list = new ArrayList<>();
        list.add(new My_modelclass("Yasir1", "21"));
        list.add(new My_modelclass("Hamza2", "22"));
        list.add(new My_modelclass("Ali3", "23"));
        list.add(new My_modelclass("Umar4", "24"));
        list.add(new My_modelclass("Ahsan5", "25"));
        list.add(new My_modelclass("Rizwan6", "26"));
        list.add(new My_modelclass("Hamza7", "27"));
        list.add(new My_modelclass("Hamza8", "28"));
        list.add(new My_modelclass("Ali9", "29"));
        list.add(new My_modelclass("Umar10", "30"));
        list.add(new My_modelclass("Ahsan11", "31"));
        list.add(new My_modelclass("Rizwan12", "32"));
        list.add(new My_modelclass("Yasir13", "33"));
        list.add(new My_modelclass("Hamza14", "34"));
        list.add(new My_modelclass("Ali15", "35"));
        list.add(new My_modelclass("Umar16", "36"));
        list.add(new My_modelclass("Ahsan17", "37"));
        list.add(new My_modelclass("Rizwan18", "38"));
        list.add(new My_modelclass("Hamza19", "39"));
        list.add(new My_modelclass("Hamza20", "40"));
        list.add(new My_modelclass("Ali21", "41"));
        list.add(new My_modelclass("Umar22", "42"));
        list.add(new My_modelclass("Ahsan23", "43"));
        list.add(new My_modelclass("Rizwan24", "44"));


        adapter = new my_Adapter(list, this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1,
                GridLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
     /*   cursor = dataBase.getAllData();
        if (cursor.getCount() == 0) {
            Toast.makeText(this, "SOme Error", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()) {
                String name = cursor.getString(1);
                String age = cursor.getString(2);
                String details = cursor.getString(3);
                list.add(new My_modelclass(name, age, details));



            }
            adapter = new my_Adapter(list, this);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(adapter);
*/

    }

}

