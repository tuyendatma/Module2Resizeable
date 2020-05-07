public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes1 = new Shape[6];
        shapes1[5]= new Circle();
        shapes1[4]= new Rectangle();
        shapes1[3]= new Square();
        shapes1[2]= new Circle();
        shapes1[1]= new Rectangle();
        shapes1[0]= new Square();
        for (int i = 0; i <shapes1.length ; i++) {
            double percent =Math.floor(Math.random()*100);
            shapes1[i].howToColor();
        }
    }
}
