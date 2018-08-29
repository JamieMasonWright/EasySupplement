package uk.co.jmwdesigns.easysupplement.AminAcids;

import uk.co.jmwdesigns.easysupplement.R;

public class AminoAcids {

    private String name;
    private String description;
    private int imageResourceId;

    private AminoAcids(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final AminoAcids[] aminoAcids = {
            new AminoAcids("BCAAS", "This is the protein description", R.drawable.ic_launcher_background),
            new AminoAcids("Protein Amino Acid Tabelts", "This is the casein  descrpiption", R.drawable.ic_launcher_background),
            new AminoAcids("Glutamine", "Egg white protein descrption", R.drawable.ic_launcher_background),
            new AminoAcids("Taurine", "This is the soy", R.drawable.ic_launcher_background)
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


