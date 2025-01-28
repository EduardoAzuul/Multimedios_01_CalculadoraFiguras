
public class Circle extends Figure {
    @Override
    public double calculateArea(double value, double value2) {
        return Math.PI * value * value;
    }

    @Override
    public double calculatePerimeter(double value, double value2) {
        return 2 * Math.PI * value;
    }
    
}
