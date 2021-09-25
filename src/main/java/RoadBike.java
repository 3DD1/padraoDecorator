public class RoadBike extends TrainingDecorator{
    public RoadBike (ITraining training){
        super(training);
    }
    public float getAmountOfWaterConsumed(){
        return 2.3f;
    }

    public String getNameStructure() {
        return "Road Bike";
    }
}
