package com.all2sale.a2s;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FillterActivity extends AppCompatActivity {

    private Spinner dropdown;
    private Spinner dropdown2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        dropdown = (Spinner)findViewById(R.id.sort_spinner);
        String[] items = new String[]{"สินค้าล่าสุด", "ราคาต่ำ-สูง", "ราคาสูง-ต่ำ", "เรียงตามชื่อ A-Z", "เรียงตามชื่อ Z-A"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        dropdown2 = (Spinner)findViewById(R.id.cate_spinner);
        String[] items2 = new String[]{"ทั้งหมด", "ราคาต่ำ-สูง", "ราคาสูง-ต่ำ", "เรียงตามชื่อ A-Z", "เรียงตามชื่อ Z-A"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown2.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {

            finish();

        }

        return super.onOptionsItemSelected(item);
    }

}
