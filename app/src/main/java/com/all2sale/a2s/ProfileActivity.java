package com.all2sale.a2s;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {



    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;


    CollapsingToolbarLayout collapsingToolbarLayout;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        image = (ImageView) findViewById(R.id.image);
        image.setImageResource(R.drawable.cover);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("profilename");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        setPalette();

        NestedScrollView scrollView = (NestedScrollView) findViewById (R.id.nest_scrollview);
        scrollView.setFillViewport (true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container_store);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_store);
        tabLayout.setupWithViewPager(mViewPager);



        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                FrameLayout hidefab = (FrameLayout) findViewById(R.id.hidefab);
//
//                if (hidefab.isShown()) {
//                    hidefab.setVisibility(View.GONE);
//
//
//                } else {
//                    hidefab.setVisibility(View.VISIBLE);
//                }


                        PopupMenu popup = new PopupMenu(ProfileActivity.this, fab);
                        //Inflating the Popup using xml file
                        popup.getMenuInflater().inflate(R.menu.contact_menu02, popup.getMenu());





                //registering popup with OnMenuItemClickListener
                        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            public boolean onMenuItemClick(MenuItem item) {
                                Toast.makeText(
                                        ProfileActivity.this,
                                        item.getTitle(),
                                        Toast.LENGTH_SHORT
                                ).show();
                                return true;
                            }
                        });

                        popup.show(); //showing popup menu
                    }



        });


        LinearLayout follow = (LinearLayout) findViewById(R.id.followBtn);

        follow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(ProfileActivity.this, FollowActivity.class);

                startActivity(i);



            }

        });

        LinearLayout follow2 = (LinearLayout) findViewById(R.id.followBtn2);

        follow2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(ProfileActivity.this, FollowActivity.class);

                startActivity(i);



            }

        });

        LinearLayout follow3 = (LinearLayout) findViewById(R.id.followBtn3);

        follow3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(ProfileActivity.this, FollowActivity.class);

                startActivity(i);



            }

        });

        TextView FollowBtn = (TextView) findViewById(R.id.textView11);

        FollowBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Toast.makeText(ProfileActivity.this, "ติดตาม", Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void setPalette() {
        Bitmap bitmap = ((BitmapDrawable) image.getDrawable()).getBitmap();
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                int primaryDark = getResources().getColor(R.color.colorPrimaryDark);
                int primary = getResources().getColor(R.color.colorPrimary);
                collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(primary));
                collapsingToolbarLayout.setStatusBarScrimColor(palette.getDarkVibrantColor(primaryDark));
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



    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 1:
                    return new ProfileContactFragment();
                case 2:
                    return new ProfilePurchaseFragment();
                case 3:
                    return new ProfileFavoriteFragment();
                default:
                    return new ProfileHomeFragment();
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "ไทมไลน์";
                case 1:
                    return "ติดต่อ";
                case 2:
                    return "ซื้อ-ขาย";
                case 3:
                    return "สินค้าโปรด";
            }
            return null;
        }
    }


}
