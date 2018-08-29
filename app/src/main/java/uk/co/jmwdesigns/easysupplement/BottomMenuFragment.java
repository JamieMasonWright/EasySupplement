package uk.co.jmwdesigns.easysupplement;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomMenuFragment extends Fragment {

    private ImageButton mHome;


    View view;


    public BottomMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bottom_menu, container, false);


        mHome = (ImageButton) view.findViewById(R.id.home_button);
        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TopLevelActivity.class);
                startActivity(intent);
                return;

            }
        });





        return view;
    }

}
