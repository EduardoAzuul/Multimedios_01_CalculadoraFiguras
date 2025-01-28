import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Window extends JFrame {
    
    //atributes******************
    private Calculator cal = new Calculator();

    private JPanel panel; 
    private JTextField campo1;  //Where user writes the number
    private JTextField campo2; 
    private JLabel etiqueta2 = new JLabel();
    private JLabel etiqueta4 = new JLabel();
    private JComboBox<String> combo1 = new JComboBox<>();   //Selector of the figure
    

    /*Builder*****************************************/
    public Window() {   
        this.setSize(800,400);        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
        componentes();
    }
    

    private void componentes(){
        //panel, text, selector, buttons
        panel();
        etiqueta();
        botones();
        camposTexto();
        selector();
    
    }



    public void panel(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);          
    }


    public void etiqueta(){                 //Labels
        JLabel etiqueta = new JLabel();
        etiqueta.setText("SIDE OR RADIUS");
        etiqueta.setBounds(100, 0, 200, 20);
        panel.add(etiqueta);

        etiqueta2 = new JLabel();
        etiqueta2.setText("SELECT OPERATION");
        etiqueta2.setBounds(100, 75, 200, 20);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("2nd SIDE (IF NEEDED)");
        etiqueta3.setBounds(310, 0, 200, 20);
        panel.add(etiqueta3);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("RESULTADO");
        etiqueta5.setBounds(100, 200, 200, 20);
        panel.add(etiqueta5);

        etiqueta4 = new JLabel();   //result
        etiqueta4.setText(" ");
        etiqueta4.setBounds(100, 220, 200, 20);
        panel.add(etiqueta4);

    }


    

    private void selector(){        //Selector of the figure
        combo1.setBounds(100, 100, 260, 50);
        panel.add(combo1);
        combo1.addItem("Square");
        combo1.addItem("Rectangle");
        combo1.addItem("Triangle");
        combo1.addItem("Circle");
        combo1.addItem("Regular Pentagon");
        combo1.addItem("Pentagram");
        combo1.addItem("Hexagon");
        combo1.addItem("Semicircle");       
    }


    private void camposTexto(){ //data inputs
        //Used for value1 in calculations
        campo1 = new JTextField();
        campo1.setBounds(100,25,200,50);
        campo1.setText("0");
        campo1.setEnabled(true);
        campo1.setFont(new Font("Monospaced",Font.PLAIN,14));
        panel.add(campo1);

        //Used for value2 in calculations
        campo2 = new JTextField();
        campo2.setBounds(310,25,200,50);
        campo2.setText("0");
        campo2.setEnabled(true);
        campo2.setFont(new Font("Monospaced",Font.PLAIN,14));
        panel.add(campo2);

    }

    public String getSelector(){
        if (combo1.getSelectedItem() == null) {
            return " ";  //If the user doesn't select a figure
        }
        return combo1.getSelectedItem().toString();
    }


    private void botones(){             //Buttons
        JButton Area = new JButton();
        JButton Perimeter = new JButton();

        //Area and Perimeter buttons
        Area.setBounds(100, 160, 100, 30);
        Perimeter.setBounds(210, 160, 150, 30);
        Area.setText("AREA");
        Perimeter.setText("PERIMETER");
        panel.add(Area);
        panel.add(Perimeter);

        buttonsActions(Area, Perimeter);
    }

    private void buttonsActions(JButton Area, JButton Perimeter){
        Area.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Area button action 
                //It picks the values form the text fields and the selector
                //and it calls the Area method from the Calculadora class
                String figura= getSelector();
                Double value = ValidNumber();
                Double value2 = ValidNumber2();

                Double result = 0.0;
                result= cal.Area(figura, value, value2);
                System.out.println("Area: " + result);
                etiqueta4.setText("Area: " + result);
                

                
            }
        });
        
        /********************************** */
        Perimeter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Perimeter");
                //Area button action 
                //It picks the values form the text fields and the selector
                //and it calls the Perimether method from the Calculadora class

                String figura= getSelector();
                Double value = ValidNumber();
                Double value2 = ValidNumber2();

                Double result = 0.0;
                result= cal.Perimeter(figura, value, value2);

                
                System.out.println("Perimeter: " + result);
                etiqueta4.setText("Perimeter: " + result);
            }
        });
    }

    public double ValidNumber() {   //To avoid the user puting a non valid number o letters we use a catch
        String input = campo1.getText().trim();
    
        //Verify if it's empty
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add a number");
            return 0.0;
        }
        
        try {
            double num = Double.parseDouble(input);
        
            // Negative number
            if (num < 0) {
                JOptionPane.showMessageDialog(this, "Please use a positive number");
                return 0.0;
            }
            return num;
        } catch (NumberFormatException e) {
            //In case of something different than a number
            JOptionPane.showMessageDialog(this, "Please use a valid number");
            return 0.0;
        }
        
        
    }

    public double ValidNumber2() {   //To avoid the user puting a non valid number o letters we use a catch
        String input = campo2.getText().trim();
    
        //Verify if it's empty
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add a number");
            return 0.0;
        }
        
        try {
            double num = Double.parseDouble(input);
        
            // Negative number
            if (num < 0) {
                JOptionPane.showMessageDialog(this, "Please use a positve number");
                return 0.0;
            }
            return num;

        } catch (NumberFormatException e) {
            //In case of something different than a number
            JOptionPane.showMessageDialog(this, "Please use a valid number");
            return 0.0;
        }
        
    }
}
