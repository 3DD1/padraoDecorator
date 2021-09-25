import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    @Test
    void mustReturnSportPerson(){
        ITraining training = new Sportsperson(8.0f);
        assertEquals(8.0f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndRun(){
        ITraining training = new Run(new Sportsperson(8.0f));
        assertEquals(6.5f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Run", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndSwimming(){
        ITraining training = new Swimming(new Sportsperson(8.0f));
        assertEquals(7.5f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Swimming", training.getStructure());
    }

    @Test
    void mustReturnSportPersonAndRoadBike(){
        ITraining training = new RoadBike(new Sportsperson(8.0f));
        assertEquals(5.7f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Road Bike", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndRunAndSwimming(){
        ITraining training = new Run(new Swimming(new Sportsperson(8.0f)));
        assertEquals(6.0f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Swimming - Training of the day: Run", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndRunAndRoadBike(){
        ITraining training = new Run(new RoadBike(new Sportsperson(8.0f)));
        assertEquals(4.2f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Road Bike - Training of the day: Run", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndSwimmingAndRoadBike(){
        ITraining training = new Swimming(new RoadBike(new Sportsperson(8.0f)));
        assertEquals(5.2f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Road Bike - Training of the day: Swimming", training.getStructure());
    }
    @Test
    void mustReturnSportPersonAndSwimmingAndRoadBikeAndRun(){
        ITraining training = new Run(new Swimming(new RoadBike(new Sportsperson(8.0f))));
        assertEquals(3.6999998f, training.getAmountOfWater());
        assertEquals("Student training sheet: Edmilson - Training of the day: Road Bike - Training of the day: Swimming - Training of the day: Run", training.getStructure());
    }
}