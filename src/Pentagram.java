
public class Pentagram extends Figure {
    //Asumes that the triangle of the pentagram is equilateral

    public double calculateArea(double value,double value2){
        double sin72 = Math.sin(Math.toRadians(72));
        double cos36 = Math.cos(Math.toRadians(36));
        return ((value*value) * 5 * sin72 * cos36);
    }
    
    /*Asumes that value is the side */
    public double calculatePerimeter(double value,double value2){
        return value*10;
    }
    
}
