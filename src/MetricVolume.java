public class MetricVolume {
    private int millilitres;

    public MetricVolume(int Cmillilitres){
	    //Constructor to pass in value assigned by user
        this.millilitres = Cmillilitres;
    }

    //Converts the  given millilitres to the accurate measurements, and returns the values as an object
    public BakingMeasure convert(){
        System.out.printf("%d millilitres in baking measures is:\n", millilitres);
        
        //Converts the millilitres to an integer number of teaspoons
        int numOfTeaspoons = (int)Math.round(millilitres / 4.9289);

        //Converts the number of teaspoons to an integer number of tablespoons, leaving the remainder as the number of teaspoons
        int numOfTablespoons = numOfTeaspoons / 3;
        numOfTeaspoons = numOfTeaspoons % 3;
        
        //Converts the number of cups to an integer number of cups, leaving the remainder as the number of tablespoons
        int numOfCups = numOfTablespoons / 16;
        numOfTablespoons = numOfTablespoons % 16;
    	
	    //Creates a BakingMeasure object with the measurements, and returns the BakingMeasure object
        BakingMeasure metricVolumeConverted = new BakingMeasure(numOfCups, numOfTablespoons, numOfTeaspoons);
        return metricVolumeConverted;
    }
}
