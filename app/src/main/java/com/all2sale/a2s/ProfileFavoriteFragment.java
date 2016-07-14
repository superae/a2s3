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
public class ProfileFavoriteFragment extends Fragment {

    private TextView button1;

    public ProfileFavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_profile_favorite, container, false);


        ImageView product = (ImageView) view.findViewById(R.id.photo);

        product.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                Intent i = new Intent(getActivity(), ProductDetailActivity.class);

                startActivity(i);



            }

        });

        ImageView RemoveBtn = (ImageView) view.findViewById(R.id.removeProduct);

        RemoveBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "ลบสินค้าโปรด", Toast.LENGTH_SHORT).show();


            }
        });


        return view;

    }

}
