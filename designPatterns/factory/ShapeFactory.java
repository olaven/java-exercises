public class ShapeFactory {
    //use getShape method in demo 
    public Shape getShape(String type){
        type = type.toLowerCase(); 
        if(type.equals("circle"){
            return new Circle(); 
        } else if(type.equals("rectangle")){
            return new Rectangle(); 
        } else if(type.equals("square")){
            return new Square(); 
        }

        return null; 
    }
}