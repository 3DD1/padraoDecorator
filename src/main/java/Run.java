public class Run extends TrainingDecorator{
    public Run (ITraining training){
        super(training);
    }
    public int getAmountOfWaterConsumed(){
        return 1;
    }

    public String getNameStructure() {
        return "Run";
    }
}
