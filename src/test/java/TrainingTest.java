import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    @Test
    void deveRetornaQuantidadeDeAgua(){
        ITraining training = new Sportsperson(8);
        assertEquals(8, training.getAmountOfWater());
    }

}