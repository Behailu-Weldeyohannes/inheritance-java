package myAlbum;

public class fry extends fauna {
    private int gills;
    private int eyes;
    private int fins;

    public fry(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    // method
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
       moveMuscles();
       moveBackFin();
       super.move(speed);
    }
}
