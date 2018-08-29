package uk.co.jmwdesigns.easysupplement;


public class FatBurners {

    private String name;
    private String description;
    private int imageResourceId;

    private FatBurners(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final FatBurners[] fatBurners = {
            new FatBurners("BCAAS", "This is the protein description", R.drawable.ic_launcher_background),
            new FatBurners("Protein Amino Acid Tabelts", "This is the casein  descrpiption", R.drawable.ic_launcher_background),
            new FatBurners("Glutamine", "Egg white protein descrption", R.drawable.ic_launcher_background),
            new FatBurners("Taurine", "This is the soy", R.drawable.ic_launcher_background)
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
