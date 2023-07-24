/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.project;

/**
 *
 * @author Asus
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculatorFrame extends JFrame implements ActionListener {
    private JTextField weightField;
    private JTextField heightField;
    private JButton calculateButton;
    private JLabel resultLabel;
    
    public BMICalculatorFrame() {
        setTitle("BMI Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        add(panel);
        
        panel.add(new JLabel("Weight (kg):"));
        weightField = new JTextField(10);
        panel.add(weightField);
        
        panel.add(new JLabel("Height (m):"));
        heightField = new JTextField(10);
        panel.add(heightField);
        
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        panel.add(calculateButton);
        
        resultLabel = new JLabel("");
        panel.add(resultLabel);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            
            if (weight <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "Invalid weight or height. Please enter a valid weight and height.");
                return;
            }
            
            double bmi = calculateBMI(weight, height);
            String weightStatus = getWeightStatus(bmi);
            resultLabel.setText("BMI: " + bmi + ", Weight Status: " + weightStatus);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numbers for weight and height.");
        }
    }
    
    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    private String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Healthy weight/Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else if (bmi >= 30) {
            return "Obesity";
        }
        return null;
    }
    
   public static void main(String[] args) {
    BMICalculatorFrame frame = new BMICalculatorFrame();
    frame.setVisible(true);
}
}