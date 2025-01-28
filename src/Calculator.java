
public class Calculator {
    Figure[] figuras = new Figure[8];

    public Calculator() {
        figuras[0] = new Square();
        figuras[1] = new Rectangle();
        figuras[2] = new Triangle();
        figuras[3] = new Circle();
        figuras[4] = new Pentagon();
        figuras[5] = new Pentagram();
        figuras[6] = new Hexagon();
        figuras[7] = new Semicircle();
    }

    public double Area(String figura, double value, double value2) {
        
        switch (figura) {
            case "Square":
                return figuras[0].calculateArea(value, value2);
            case "Rectangle":
                return figuras[1].calculateArea(value, value2);
            case "Triangle":
                return figuras[2].calculateArea(value, value2);
            case "Circle":
                return figuras[3].calculateArea(value, value2);
            case "Regular Pentagon":
                return figuras[4].calculateArea(value, value2);
            case "Pentagram":
                return figuras[5].calculateArea(value, value2);
            case "Hexagon":
                return figuras[6].calculateArea(value, value2);
            case "Semicircle":
                return figuras[7].calculateArea(value, value2);
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Please select a figure");
                return 0.0;
            
        }
        
    }

    public double Perimeter(String figura, double value, double value2) {
        switch (figura) {
            case "Square":
                return figuras[0].calculatePerimeter(value, value2);
            case "Rectangle":
                return figuras[1].calculatePerimeter(value, value2);
            case "Triangle":
                return figuras[2].calculatePerimeter(value, value2);
            case "Circle":
                return figuras[3].calculatePerimeter(value, value2);
            case "Regular Pentagon":
                return figuras[4].calculatePerimeter(value, value2);
            case "Pentagram":
                return figuras[5].calculatePerimeter(value, value2);
            case "Hexagon":
                return figuras[6].calculatePerimeter(value, value2);
            case "Semicircle":
                return figuras[7].calculatePerimeter(value, value2);

            default:
                return 0.0;
        }
    }
}
