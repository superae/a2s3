package com.all2sale.a2s;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class StoreContactFragment extends Fragment {


    public StoreContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_store_contact, container, false);

        LinearLayout map = (LinearLayout) view.findViewById(R.id.storemap_btn);

        map.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), StoreMapActivity.class);
                intent.putExtra("value_send", "ae5");

                startActivity(intent);

            }
        });

        // Inflate the layout for this fragment
        return view;
    }



}
