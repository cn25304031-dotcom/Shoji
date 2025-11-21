package pac;

import pac.zoo.TamaZoo;
import pac.zoo.animal.*;

public class ZooTest {
    public static void main(String[] args) {
        TamaZoo zoo = new TamaZoo();
        zoo.addAnimal(new Lion("じょうじ"));
        zoo.addAnimal(new Tiger("WaWa"));
        zoo.addAnimal(new Snake("TokeToke"));
        zoo.meal();
    }
}