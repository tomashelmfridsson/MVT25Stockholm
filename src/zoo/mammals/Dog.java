package zoo.mammals;

import zoo.animals.Animal;

public class Dog extends Animal {
    public Dog(String color) {
        super(color);
    }

    @Override
    protected String mat(){
        return "ben";
    }

}
