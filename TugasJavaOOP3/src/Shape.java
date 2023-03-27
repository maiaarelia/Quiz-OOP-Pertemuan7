public class Shape {
    // attribute
    private String color;
    private Boolean filled;
    // constructor
    public Shape(){
        this.color = "Red";
        this.filled = true;
    }
    public Shape(String color,Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    // method
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Boolean isFilled(){
        return this.filled;
    }
    public void setFilled(Boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "color = " + this.color + ",filled = " + this.filled;
    }

    // objek
    public static void main(String[] args) {
        square S1 = new square();
        System.out.println(S1.toString());
    }
}