
public class Semicircle extends Figure {
    @Override
    public double calculateArea(double value, double value2) {
        return (Math.PI * Math.pow(value, 2)) / 2;
    }

    @Override
    public double calculatePerimeter(double value, double value2) {
        return Math.PI * value + 2 * value;
    }
    
}
