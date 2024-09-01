package unipiloto.edu.co.beeradviser;

import java.util.ArrayList;

public class BeerExpert {

    private final ArrayList<String> lightBeers;
    private final ArrayList<String> amberBeers;
    private final ArrayList<String> brownBeers;
    private final ArrayList<String> darkBeers;

    public BeerExpert() {
        amberBeers = new ArrayList<>();
        amberBeers.add("Three Floyds Amber Smashed Face");
        amberBeers.add("Bird De Rumoerige Roodborst");
        amberBeers.add("Uiltje Mr Feathers");

        brownBeers = new ArrayList<>();
        brownBeers.add("Pit Caribou Brown Ale Américaine");
        brownBeers.add("Cigar City Cubano-Style Espresso Brown Ale");
        brownBeers.add("Surly Cacao Bender");

        darkBeers = new ArrayList<>();
        darkBeers.add("Pig Porter");
        darkBeers.add("Marshal Zukhov's Imperial Stout");
        darkBeers.add("Monk's Cafe Flemish Sour Ale");

        lightBeers = new ArrayList<>();
        lightBeers.add("Coors Light");
        lightBeers.add("Michelob Ultra");
        lightBeers.add("Natural Light");
    }

    public ArrayList<String> getBrands(int idBeerType){
        switch (idBeerType){
            case 0:
                return lightBeers;
            case 1:
                return amberBeers;
            case 2:
                return brownBeers;
            case 3:
                return darkBeers;
        }
        return null;
    }
}
