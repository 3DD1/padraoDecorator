public class Sportsperson implements ITraining {
    private float amountOfWater;

    public Sportsperson(){

    }
    public Sportsperson(float amountOfWater){
        this.amountOfWater = amountOfWater;
    }
    public float getAmountOfWater() {
        return amountOfWater;
    }
    public String getStructure() {
        return "Student training sheet: Edmilson";
    }
}
