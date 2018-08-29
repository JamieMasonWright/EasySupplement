package uk.co.jmwdesigns.easysupplement.Protein;

import uk.co.jmwdesigns.easysupplement.R;

public class Protein {

    private String name;
    private String description;
    private int imageResourceId;
    private String recommendedUse;

    private Protein(String name, String description, int imageResourceId, String recommendedUse){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.recommendedUse = recommendedUse;
    }

   public static final Protein[] proteins = {
           new Protein("Whey Protein", "Protein is a macronutrient that is essential to building muscle mass. It is commonly found in animal products, though is also present in other sources, such as nuts and legumes. \n" +
                   "\n", R.drawable.ic_launcher_background, "1-1.2 grams of protein per pound of body weight. Average healthy adult MALE whose primary goal is building muscle, getting “toned,” maintaining muscle while losing fat, increasing strength or improving performance. 1-1.5 grams of protein per pound of body weight."),
           new Protein("Casein Protein", "Casein is the protein most abundant in milk. As a result of the way it forms during the processing of milk, casein tends to be a gelatinous material. Once formed into protein powder, it becomes a slower acting form of protein that is absorbed by the body at a different rate compared to whey protein.", R.drawable.ic_launcher_background,"How much casein to consume depends on a number of factors like weight, total protein intake, and whether you're consuming it alone or with other protein sources.\n" +
                   "\n" +
                   "Therefore, if you're taking casein alone, it can be beneficial to devour a large dose to try and maximize anabolism. I'd recommend 40 to 50 grams of casein protein (if consumed alone) for a 200-pound muscle-building male who wants to maximize the muscle-building response."),
           new Protein("Egg white protein", "Whey and casein are both dairy-based, meaning they're not suitable for those with a dairy allergy. Egg-based protein powders are lactose-free, however, meaning they're a good replacement for dairy proteins. With around 25 grams of protein in a 30-gram serving, the protein content is very similar to that of whey and casein.", R.drawable.ic_launcher_background,"Depending on the intensity of the exercise you are doing, you probably need more than the recommended average 0.8 g of protein per kg of bodyweight. This is especially true if you're a hardgainer and struggle to gain lean muscle mass without losing weight."),
           new Protein("Soy protein", "This is the soy", R.drawable.ic_launcher_background,"This is the recommded use"),
           new Protein("Pea Protein", "This is the pea protein", R.drawable.ic_launcher_background,"This is the recommded use"),
           new Protein("Brown rice protein", " This is the brown rice protein", R.drawable.ic_launcher_background,"This is the recommded use"),
           new Protein("Mixed plant Protein", "This is mixed plant protein", R.drawable.ic_launcher_background,"This is the recommded use")
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
    public String getRecommendedUse(){ return recommendedUse; }

    public String toString(){
        return this.name;
    }




}
