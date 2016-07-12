package com.all2sale.a2s;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class StoreTimelineFragment extends Fragment {

    //private TextView button1;

    public StoreTimelineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_store_timeline, container, false);

        final TextView comment = (TextView) view.findViewById(R.id.commentButton);

        comment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(getActivity(), CommentActivity.class);

                startActivity(i);


            }

        });

        final TextView remove = (TextView) view.findViewById(R.id.commentButton2);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popup = new PopupMenu(getActivity(), remove);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.comment_menu01, popup.getMenu());



                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                getActivity(),
                                item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //showing popup menu
            }



        });


        return view;

    }

}
