import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum {
    public Sum() {

        JFrame frame = new JFrame();
        frame.setTitle("Sum Of Two Number");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);


        JLabel firstl = new JLabel("Enter First Number :");
        JLabel secondl = new JLabel("Enter Second Number :");
        JTextField first = new JTextField();
        JTextField second = new JTextField();
        JLabel result = new JLabel();
        JButton click = new JButton("SUM");
        click.setBounds(130 , 165 , 100 ,30);

        firstl.setBounds(30 , 40 , 200 , 40);
        first.setBounds(165 , 40 , 200 , 40);

        secondl.setBounds(30 , 90 , 200 , 40);
        second.setBounds(165 , 90 , 200 , 40);

        result.setBounds(120 , 230 , 200 , 30);

        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float a , b ;
                a = Float.parseFloat(first.getText());
                b = Float.parseFloat(second.getText());
                float c = a+b;
                result.setText("result is : "+c);
                JOptionPane.showMessageDialog(frame , "Result is : "+c);
            }
        });


        frame.add(firstl);
        frame.add(first);
        frame.add(secondl);
        frame.add(second);
        frame.add(click);
        frame.add(result);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Sum firstscreen = new Sum();
    }
}
