package task2;

public abstract class Dog {
    private String breed;
    private String color;
    private int age;

    public String getBreed(){
        return breed;
    }

    public String getColor(){
        return color;
    }

    public int getAge() {
        return age;
    }

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public abstract void info();
}

class Poodle extends Dog{
    private String size;
    public String getSize(){
        return size;
    }
    public Poodle(String breed, String color, int age, String size){
        super(breed,color,age);
        this.size = size;
    }
    public void info(){
        System.out.println("Порода: " + super.getBreed() + ", " + "цвет: " + super.getColor() + ", " + "возраст: " + super.getAge() + " лет, " + "размер: " + size );
    }
}

class Xaski extends Dog{
    private String eye;

    public String getEye(){
        return eye;
    }
    public Xaski(String breed, String color, int age, String eye ) {
        super(breed, color, age);
        this.eye = eye;
    }
    public void info() {
        System.out.println("Порода: " + super.getBreed() + ", " + "цвет: " + super.getColor() + ", " + "возраст: " + super.getAge() + " лет, " + "цвет глаз: " + eye);
    }
}
