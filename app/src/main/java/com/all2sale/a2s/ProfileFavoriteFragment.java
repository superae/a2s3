package com.all2sale.a2s;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


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


//        button1 = (TextView) view.findViewById(R.id.sort_popup);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Creating the instance of PopupMenu
//                PopupMenu popup = new PopupMenu(getActivity(), button1);
//                //Inflating the Popup using xml file
//                popup.getMenuInflater()
//                        .inflate(R.menu.sort_list, popup.getMenu());
//
//                //registering popup with OnMenuItemClickListener
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    public boolean onMenuItemClick(MenuItem item) {
//                        Toast.makeText(
//                                getActivity(),
//                                item.getTitle(),
//                                Toast.LENGTH_SHORT
//                        ).show();
//                        return true;
//                    }
//                });
//
//                popup.show(); //showing popup menu
//            }
//        }); //closing the setOnClickListener method
//
//
//
//
//
//        TextView button2 = (TextView) view.findViewById(R.id.imageButton4);
//
//        button2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//
//                Intent i = new Intent(getActivity(), FillterActivity.class);
//
//                startActivity(i);
//
////                overridePendingTransition(R.anim.slide_left,R.anim.slide_left);
//
//
//            }
//
//        });


        return view;

    }

}
