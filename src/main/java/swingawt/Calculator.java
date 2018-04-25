package swingawt;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: luoweifu
 * Date: 15-5-5
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    /**
     * 主窗口的宽度
     */
    public static final int WIDTH = 500;
    /**
     * 主窗口的高度
     */
    public static final int HEIGHT = 100;

    private JFrame frameCalculator;
    private JEditorPane editAddend1;
    private JEditorPane editAddend2;
    private JEditorPane editResult;
    private JLabel labelPlus;
    private JButton btEqual;
    public Calculator() {
        frameCalculator = new JFrame();
    }

    public void launchFrame() {
        frameCalculator.setSize(WIDTH, HEIGHT);
        frameCalculator.setLocationRelativeTo(null);
        frameCalculator.setTitle("加法计算");

        Container container = frameCalculator.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        editAddend1 = new JEditorPane();
        editAddend1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        editAddend2 = new JEditorPane();
        editAddend2.setBorder(new BevelBorder(BevelBorder.LOWERED));
        labelPlus = new JLabel("+");
        btEqual = new JButton("=");
        editResult = new JEditorPane();
        editResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
        editResult.setEditable(false);
        container.add(editAddend1);
        container.add(labelPlus);
        container.add(editAddend2);
        container.add(btEqual);
        container.add(editResult);
        frameCalculator.setVisible(true);
        //frameCalculator.setDefaultCloseOperation(EXIT_ON_CLOSE);

        class AdditionCalculate implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                int add1 = Integer.parseInt(editAddend1.getText());
                int add2 = Integer.parseInt(editAddend2.getText());
                int result = add1 + add2;
                editResult.setText(result + "");
            }
        }

        AdditionCalculate additionCalculate = new AdditionCalculate();
        btEqual.addActionListener(additionCalculate);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.launchFrame();
    }
}
