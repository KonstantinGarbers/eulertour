package Components;
import java.util.ArrayList;

public class Point {
    private int x;
    private int y;
    private int degree;
    private ArrayList<Point> neighbors;

    Point(int x, int y){
        this.x = x;
        this.y = y;
        this.degree = 0;
        neighbors = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("sdf");
    }

    // HELPER METHODS
    public boolean addNeighbor(Point p){
        if (p != null && !containsNeighbor(p)){
            neighbors.add(p);
        }
        return false;
    }

    public boolean containsNeighbor(Point p){
        if (p != null){
            for (Point neighbor: neighbors){
                if (p.equals(neighbor)) return true;
            }
        }
        return false;
    }

    public void removeAllNeighbors(){
        this.neighbors = new ArrayList<>();
    }

    public boolean equals(Point p){
        if (p != null){
            return p.getX() == this.getX() && p.getY() == this.getY();
        }
    return false;
    }

    // GETTERS AND SETTERS
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getDegree() {
        return degree;
    }
    public void setDegree(int degree) {
        this.degree = degree;
    }
    public ArrayList<Point> getNeighbors() {
        return neighbors;
    }
}