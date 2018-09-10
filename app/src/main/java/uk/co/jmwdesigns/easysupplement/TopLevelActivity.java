package uk.co.jmwdesigns.easysupplement;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import uk.co.jmwdesigns.easysupplement.AminAcids.AminoAcidsMenuFragment;
import uk.co.jmwdesigns.easysupplement.FatBurners.FatBurnersMenuFragment;
import uk.co.jmwdesigns.easysupplement.NitricOxide.NitricOxideMenuFragment;
import uk.co.jmwdesigns.easysupplement.PerformanceEnhancers.PerformanceEnhancersMenuFragment;
import uk.co.jmwdesigns.easysupplement.Protein.ProteinMenuFragment;
import uk.co.jmwdesigns.easysupplement.TestSupport.TestSupportMenuFragment;

public class TopLevelActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_level_activity);

    }

   public void ChangeFragment(View  view){
        Fragment fragment;

        if(view == findViewById(R.id.protein_button)){
            fragment = new ProteinMenuFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if(view ==findViewById(R.id.test_button)){
            fragment = new FatBurnersMenuFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if(view == findViewById(R.id.amino_button)){
            fragment = new AminoAcidsMenuFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        if(view == findViewById(R.id.test_support)){
           fragment = new TestSupportMenuFragment();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           transaction.replace(R.id.fragment_container, fragment);
           transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           transaction.addToBackStack(null);
           transaction.commit();
       }
       if(view == findViewById(R.id.test_support)){
           fragment = new PerformanceEnhancersMenuFragment();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           transaction.replace(R.id.fragment_container, fragment);
           transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           transaction.addToBackStack(null);
           transaction.commit();
       }
       if(view == findViewById(R.id.nitric_oxide_button)){
           fragment = new NitricOxideMenuFragment();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           transaction.replace(R.id.fragment_container, fragment);
           transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           transaction.addToBackStack(null);
           transaction.commit();
       }


    }



}
