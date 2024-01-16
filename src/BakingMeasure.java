public class BakingMeasure {
    private int cups;
    private int tablespoons;
    private int teaspoons;

    //Sets values from users to attributes
    public BakingMeasure(int Ccups, int Ctablespoons, int Cteaspoons){
        this.cups = Ccups;
        this.tablespoons = Ctablespoons;
        this.teaspoons = Cteaspoons; 
    }

    //Formats the output based on the values of the variables given
    public void prettyPrint(){
	    //First checks if all values are non-zero
        if (cups != 0 && tablespoons != 0 && teaspoons != 0){
            switch(cups){
                case 1:
                    System.out.print("1 cup, ");
                    break;
                default:
                    System.out.printf("%d cups, ",cups);
            }
            switch(tablespoons){
                case 1:
                    System.out.print("1 tablespoon and ");
                    break;
                default:
                    System.out.printf("%d tablespoons and ",tablespoons);
            }
        }
        else{
	        //Checks if value of cups is non-zero
            if(cups != 0) {
                switch(cups){
                    case 1:
                        System.out.print("1 cup");
                        break;
                    default:
                        System.out.printf("%d cups",cups);
                }
                if (tablespoons != 0 || teaspoons != 0){
                    System.out.print(" and ");
                }
            }
	        //Checks if value of tablespoons is non-zero
            if(tablespoons != 0){
                switch(tablespoons){
                    case 1:
                        System.out.print("1 tablespoon");
                        break;
                    default:
                        System.out.printf("%d tablespoons",tablespoons);
                }
                if (teaspoons != 0){
                    System.out.print(" and ");
                }
            }
        }
	    //Adds teaspoons depending on value of teaspoons variable
        switch(teaspoons){
            case 0: System.out.println(); 
                break;
            case 1:
                System.out.print("1 teaspoon\n");
                break;
            default:
                System.out.printf("%d teaspoons\n",teaspoons);
        }
    }
}
