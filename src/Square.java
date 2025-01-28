
public class Square extends Figure{

    @Override
    public double  calculateArea(double value,double value2) {
        
        return (value*value);
    }

    @Override
    public double calculatePerimeter(double value,double value2) {
        return (value*4);
    }
    
}
