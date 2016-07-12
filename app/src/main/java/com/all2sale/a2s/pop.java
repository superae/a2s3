package com.all2sale.a2s;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.RatingBar;
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

        }else if(value.equals("ae6")){

            setContentView(R.layout.pop5);

        }else{

            setContentView(R.layout.activity_review);

            int greenColor = Color.parseColor("#f1c40f");

            RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
            LayerDrawable stars = (LayerDrawable) ratingBar.getProgressDrawable();
            stars.getDrawable(2).setColorFilter(greenColor, PorterDuff.Mode.SRC_ATOP);

//            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
////            fab.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View view) {
////                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                            .setAction("Action", null).show();
////                }
////            });
//
//            //ImageButton properties = (ImageButton) findViewById(R.id.propBtn);
//
//            //And the layout we want to change is visibility
//            final LinearLayout propLayout = (LinearLayout) findViewById(R.id.properLayout);
//
//            fab.setOnClickListener
//                    (
//                            new View.OnClickListener()
//                            {
//                                public void onClick(View v)
//                                {
//                                    if (propLayout.getVisibility() == View.VISIBLE)
//                                    {
//                                        propLayout.setVisibility(View.GONE);
//                                    }
//                                    else
//                                    {
//                                        propLayout.setVisibility(View.VISIBLE);
//                                    }
//                                }
//                            }
//                    );



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


