
public class Rectangle extends Figure {
    @Override
    public double calculateArea(double value,double value2) {
        return value * value2;
    }

    @Override
    public double calculatePerimeter(double value,double value2) {
        return 2 * value + 2 * value2;
    }

    
}
