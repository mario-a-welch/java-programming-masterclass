package CompositionEncapsulationPolymorphism.Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    //Constructor
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "People try and escape a maze filled with monsters";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }

}

public class Main {

    public static Movie randomMovie(){
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("Random num = " + randomNum);
        switch(randomNum){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+ i + " : " + movie.getName() + " - " + movie.plot());
        }
    }
}
