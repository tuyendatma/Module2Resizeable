public class CircleResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0]= new Circle();
        shapes[1]= new Rectangle();
        shapes[2]= new Square();
        shapes[3]= new Circle();
        shapes[4]= new Rectangle();
        for (int i = 0; i <shapes.length ; i++) {
            double percent =Math.floor(Math.random()*100);
            shapes[i].resize(percent);
        }
    }
}
