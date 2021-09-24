public abstract class TrainingDecorator implements ITraining {

    private ITraining training;
    private String structure;

    public TrainingDecorator(ITraining training){
        this.training = training;
    }

    public ITraining getTraining() {
        return training;
    }

    public void setTraining(ITraining training) {
        this.training = training;
    }

    public abstract int getAmountOfWaterConsumed();

    public int getAmountOfWater() {
        return this.training.getAmountOfWater() - (this.getAmountOfWaterConsumed());
    }

    public abstract String getNameStructure();

    public String getStructure(){
        return this.training.getStructure() + "/" + this.getNameStructure();
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}
