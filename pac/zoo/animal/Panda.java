package pac.zoo.animal;

public class Panda extends AbstractAnimal {
    public Panda(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("パンダの" + getName() + "は笹をゆったり食べます。");
    }
    public void sleep() {
        System.out.println("頭を垂らしてぐっすり寝ます");
    }
}
