public class Sportsperson implements ITraining {
    private int amountOfWater;

    public Sportsperson(){

    }
    public Sportsperson(int amountOfWater){
        this.amountOfWater = amountOfWater;
    }
    public int getAmountOfWater() {
        return amountOfWater;
    }
    public String getStructure() {
        return "Edmilson";
    }

}
