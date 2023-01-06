package src.cse114;

public class Rectangle {
    private double width=1, height=1;

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getParameter(){
        return 2*(width+height);
    }

    public static void main(String[] args) {
        Rectangle r1= new Rectangle(4,40);
        Rectangle r2= new Rectangle(3.5,35.9);

        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getParameter());
        System.out.println();
        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getArea());
        System.out.println(r2.getParameter());

    }
}
