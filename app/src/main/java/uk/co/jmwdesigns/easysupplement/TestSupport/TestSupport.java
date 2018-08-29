package uk.co.jmwdesigns.easysupplement.TestSupport;

import uk.co.jmwdesigns.easysupplement.R;

public class TestSupport {

    private String name;
    private String description;
    private int imageResourceId;

    private TestSupport(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final TestSupport[] testSupports = {
            new TestSupport("Tribulus", "This is the protein description", R.drawable.ic_launcher_background),
            new TestSupport("ZMA", "This is the casein  descrpiption", R.drawable.ic_launcher_background),
            new TestSupport("Magnesium", "Egg white protein descrption", R.drawable.ic_launcher_background),
            new TestSupport("D-Aspartic Acid", "This is the soy", R.drawable.ic_launcher_background),
            new TestSupport("L-Carnitine", "This is the soy", R.drawable.ic_launcher_background)
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
