package pac.zoo.animal;

public class Penguin extends AbstractAnimal {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("ペンギンの" + getName() + "は魚を食べます。");
    }
    public void sleep() {
        System.out.println("うつ伏せで寝ます");
    }
}