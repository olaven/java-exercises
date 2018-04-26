public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        Shape shape2 = factory.getShape("rectangle");
        Shape shape3 = factory.getShape("square");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    } 
}