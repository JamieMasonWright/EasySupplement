package uk.co.jmwdesigns.easysupplement.NitricOxide;

import uk.co.jmwdesigns.easysupplement.R;

public class NitricOxide {

    private String name;
    private String description;
    private int imageResourceId;

    private NitricOxide(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final NitricOxide[] nitricOxides = {
            new NitricOxide("BCAAS", "This is the protein description", R.drawable.ic_launcher_background),
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
