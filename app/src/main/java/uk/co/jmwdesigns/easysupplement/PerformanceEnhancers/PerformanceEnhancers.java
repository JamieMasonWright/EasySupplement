package uk.co.jmwdesigns.easysupplement.PerformanceEnhancers;

import android.support.v7.app.AppCompatActivity;

import uk.co.jmwdesigns.easysupplement.R;


public class PerformanceEnhancers extends AppCompatActivity {

    private String name;
    private String description;
    private int imageResourceId;

    private PerformanceEnhancers(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final PerformanceEnhancers[] performanceEnhancers = {
            new PerformanceEnhancers("Creatine", "This is the protein description", R.drawable.ic_launcher_background),
            new PerformanceEnhancers("beta-Alanine", "This is the casein  descrpiption", R.drawable.ic_launcher_background),
            new PerformanceEnhancers("D-Ribose", "Egg white protein descrption", R.drawable.ic_launcher_background),
            new PerformanceEnhancers("HMB", "This is the soy", R.drawable.ic_launcher_background)
    };

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }

    
}
