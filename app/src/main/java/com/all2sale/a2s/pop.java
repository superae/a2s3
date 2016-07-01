package com.all2sale.a2s;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by osx on 6/28/16 AD.
 */
public class pop extends Activity {

    private ImageButton close;
    private Bundle bundle;
    private String value;
    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bundle = getIntent().getExtras();
        value = bundle.getString("value_send");
        assert value != null;
        if(value.equals("ae1")){

            setContentView(R.layout.pop);

            browser = (WebView) findViewById(R.id.webview);
            browser.loadUrl("http://www.tutorialspoint.com");

        }else if(value.equals("ae0")){

            setContentView(R.layout.popdescription);

        }else if(value.equals("ae2")){

            setContentView(R.layout.pop2);

        }else if(value.equals("ae3")){

            setContentView(R.layout.pop3);

        }else{

            setContentView(R.layout.popreview);

        }




        Toast.makeText(pop.this, value, Toast.LENGTH_SHORT).show();


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 1), (int) (height * 1));


        close = (ImageButton) findViewById(R.id.button4);

        close.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                finish();

            }
        });






    }



    }


