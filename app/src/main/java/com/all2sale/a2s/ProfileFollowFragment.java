package com.all2sale.a2s;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFollowFragment extends Fragment {

    private TextView button1;

    public ProfileFollowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_profile_follow, container, false);

        ImageView photo = (ImageView) view.findViewById(R.id.photo);

        photo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(getActivity(), ProfileActivity.class);

                startActivity(i);



            }

        });

        TextView  FollowBtn = (TextView) view.findViewById(R.id.textView11);

        FollowBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "ติดตาม", Toast.LENGTH_SHORT).show();


            }
        });




        return view;

    }

}
