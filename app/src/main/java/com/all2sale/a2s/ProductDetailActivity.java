package com.all2sale.a2s;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button popdescription = (Button) findViewById(R.id .description01);

        popdescription.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), pop.class);
                intent.putExtra("value_send", "ae0");

                startActivity(intent);


            }
        });

        TextView poppurchase = (TextView) findViewById(R.id.purchase01);

        poppurchase.setOnClickListener(new View.OnClickListener(){

        @Override
            public void onClick(View view) {

            Intent intent = new Intent(view.getContext(), pop.class);
            intent.putExtra("value_send", "ae1");

            startActivity(intent);


        }
        });

        TextView popshipping = (TextView) findViewById(R.id.shipping01);

        popshipping.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), pop.class);
                intent.putExtra("value_send", "ae2");

                startActivity(intent);


            }
        });

        TextView popguarantee = (TextView) findViewById(R.id.guarantee01);

        popguarantee.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), pop.class);
                intent.putExtra("value_send", "ae3");

                startActivity(intent);


            }
        });

        Button popreview = (Button) findViewById(R.id.review01);

        popreview.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), pop.class);
                intent.putExtra("value_send", "ae4");

                startActivity(intent);


            }
        });


        LinearLayout popoption = (LinearLayout) findViewById(R.id.option01);

        popoption.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), ProductOptionActivity.class);
                intent.putExtra("value_send", "ae5");

                startActivity(intent);


            }
        });

        Button goshopBtn = (Button) findViewById(R.id.goshopBtn);

        goshopBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), StoreActivity.class);
                intent.putExtra("value_send", "ae5");

                startActivity(intent);


            }
        });


        LinearLayout favoriteBtn = (LinearLayout) findViewById(R.id.favorite01);

        favoriteBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Toast.makeText(ProductDetailActivity.this, "เพิ่มสินค้าโปรดสำเร็จ", Toast.LENGTH_SHORT).show();


            }
        });


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
