import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
class circle extends Frame implements ActionListener{

    Label radius, height, circlearea, cylinderarea, cylindervolume;
    Button calculate;
    JTextField radiusbox, heightbox;

    circle(){
        setLayout(null);
        radius = new Label("Enter the radius of the circle");
        radius.setBounds(50, 50, 200, 30);
        add(radius);
        radiusbox = new JTextField();
        radiusbox.setBounds(250, 50, 100, 33);
        radiusbox.setHorizontalAlignment(SwingConstants.CENTER);
        add(radiusbox);
        height = new Label("Enter the height of the cylinder");
        height.setBounds(50, 100, 200, 30);
        add(height);
        heightbox = new JTextField();
        heightbox.setBounds(250, 100, 100, 33);
        heightbox.setHorizontalAlignment(SwingConstants.CENTER);
        add(heightbox);
        circlearea = new Label("Circle Area: ");
        circlearea.setBounds(50, 150, 200, 30);
        add(circlearea);
        cylinderarea = new Label("Cylinder Area: ");
        cylinderarea.setBounds(50, 200, 200, 30);
        add(cylinderarea);
        cylindervolume = new Label("Cylinder Volume: ");
        cylindervolume.setBounds(50, 250, 200, 30);
        add(cylindervolume);
        calculate = new Button("Calculate");
        calculate.setBounds(250, 300, 100, 30);
        add(calculate);
        calculate.addActionListener(this);
    };
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calculate){
            double r = Double.parseDouble(radiusbox.getText());
            double h = Double.parseDouble(heightbox.getText());
            double area1 = 3.14*r*r;
            double area2 = (2*3.14*r*h)+(2*3.14*r*r);
            double volume = 3.14*r*r*h;
            circlearea.setText("Area of the circle is " + String.format("%.2f",area1));
            cylinderarea.setText("Area of the cylinder is " + String.format("%.2f",area2);
            cylindervolume.setText("Volume of the cylinder is " + String.format("%.2f",volume);
        }
    };
    public static void main(String args[]){
        circle c = new circle();
        c.setSize(500, 500);
        c.setVisible(true);
    };
};