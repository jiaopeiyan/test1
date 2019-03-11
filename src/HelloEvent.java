import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloEvent {
    private static JTextField text=new JTextField(10);

    public static void main(String[] args) {
        JFrame jf=new JFrame("hello text");
        jf.setLayout(new FlowLayout());
        jf.add(text);
        JButton btn=new JButton("my button");
        jf.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    HelloEvent.text.setText("click the button");
            }
        });
        showMe(jf);
    }
    private static void showMe(JFrame jf){
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,500);
        jf.setVisible(true);
    }
}
