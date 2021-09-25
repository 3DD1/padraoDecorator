public class Run extends TrainingDecorator{
    public Run (ITraining training){
        super(training);
    }
    public float getAmountOfWaterConsumed(){
        return 1.5f;
    }

    public String getNameStructure() {
        return "Run";
    }
}
