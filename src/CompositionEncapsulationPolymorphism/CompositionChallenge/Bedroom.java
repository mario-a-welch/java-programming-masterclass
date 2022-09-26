package CompositionEncapsulationPolymorphism.CompositionChallenge;

public class Bedroom {

    private String name;
    private RoomWall wall1;
    private RoomWall wall2;
    private RoomWall wall3;
    private RoomWall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, RoomWall wall1, RoomWall wall2, RoomWall wall3, RoomWall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
