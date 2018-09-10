package uk.co.jmwdesigns.easysupplement.PerformanceEnhancers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uk.co.jmwdesigns.easysupplement.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerformanceEnhancersMenuFragment extends Fragment {


    public PerformanceEnhancersMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_performance_enhancers_menu, container, false);
    }

}
