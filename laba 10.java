public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака","костями", "промзоне", "Алабай");
        Cat cat = new Cat("Кошка","рыбой", "доме", "9 жизней");
        Horse horse = new Horse("Лошадь","сеном", "стойле", "4 подковы");
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(dog, dog.name);
        veterinarian.treatAnimal(cat, cat.name);
        veterinarian.treatAnimal(horse, horse.name);
    }
}
class Animal {
    String name;
    String food;
    String location;

    public Animal(String name ,String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

     public void makeNoise() {
        System.out.println("Животное спит");
    }

   public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name ,String food, String location, String breed) {
        super(name,food,location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака питается " + food);
    }
}

class Cat extends Animal {
    String year;

    public Cat(String name ,String food, String location, String year) {
        super(name,food, location);
        this.year = year;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка питается " + food);
    }
}

class Horse extends Animal {
    String horseShoe;

    public Horse(String name ,String food, String location, String horseShoe) {
        super(name, food, location);
        this.horseShoe = horseShoe;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь питается " + food);
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal, String name) {
        System.out.println("Животноe " + name + " питается " + animal.food);
        System.out.println("Животное " + name + " находится в " + animal.location);
    }
}