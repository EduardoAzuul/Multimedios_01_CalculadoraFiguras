public class Hexagon extends Figure{
    @Override
    public double calculateArea(double value,double value2) {
        return (value*value2);
    }

    @Override
    public double calculatePerimeter(double value,double value2) {
        return (value*6);
    }
    
}
