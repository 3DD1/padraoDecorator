public class Swimming extends TrainingDecorator{
    public Swimming (ITraining training){
        super(training);
    }
    public float getAmountOfWaterConsumed(){
        return 0.5f;
    }

    public String getNameStructure() {
        return "Swimming";
    }
}
