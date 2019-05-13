package com.iamjue.mymenu;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        textView.setText("Item 1");
        textView.setTextColor(Color.rgb(255,0,0));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.ac_item1:
                Toast.makeText(this, "Item 1 Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Item 1");
                textView.setTextColor(Color.rgb(255,0,0));
            break;
            case R.id.ac_item2:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Item 2");
                textView.setTextColor(Color.rgb(0,255,0));
                break;
            case R.id.ac_item3:
                Toast.makeText(this, "Item 3 Selected", Toast.LENGTH_SHORT).show();
                textView.setText("Item 3");
                textView.setTextColor(Color.rgb(0,0,255));
                break;
        }

        return true;
    }
}
