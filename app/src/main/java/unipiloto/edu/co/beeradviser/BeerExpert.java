package unipiloto.edu.co.beeradviser;

import java.util.ArrayList;

public class BeerExpert {

    private final ArrayList<String> beers;

    public BeerExpert() {
        beers = new ArrayList<>();
    }

    public ArrayList<String> getBrands(int idBeerType){
        switch (idBeerType){
            case 0://light
                beers.add("Coors Light");
                beers.add("Michelob Ultra");
                beers.add("Natural Light");
                return beers;
            case 1://amber
                beers.add("Three Floyds Amber Smashed Face");
                beers.add("Bird De Rumoerige Roodborst");
                beers.add("Uiltje Mr Feathers");
                return beers;
            case 2://brown
                beers.add("Pit Caribou Brown Ale Américaine");
                beers.add("Cigar City Cubano-Style Espresso Brown Ale");
                beers.add("Surly Cacao Bender");
                return beers;
            case 3://dark
                beers.add("Pig Porter");
                beers.add("Marshal Zukhov's Imperial Stout");
                beers.add("Monk's Cafe Flemish Sour Ale");
                return beers;
        }
        return null;
    }
}
