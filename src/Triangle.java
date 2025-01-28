public class Triangle extends Figure{
    @Override
    public double calculateArea(double value,double value2) {
        return (value*value2)/2;
    }

    @Override
    public double calculatePerimeter(double value,double value2) {
        return (value+2*value2);    //Base+ 2*Side (this makes the asumtions that the 
                                    //user will input the base and the value of sides)
    }
   
}
