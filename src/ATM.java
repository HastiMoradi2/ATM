import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ATM extends JFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame("ATM");
        Dimension frameSize = new Dimension(1024,720);
        frame.setSize(frameSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(230,250,185));
        Panel mainButtons = new Panel();
        mainButtons.setLayout(null);
        Panel panel1 = new Panel();
        Panel vorudiRamz = new Panel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 300));
        vorudiRamz.setLayout(null);
        // final panel
        Panel finalPanel = new Panel();
        finalPanel.setLayout(null);
        Label finalLabel = new Label("عملیات با موفقیت انجام شد");
        finalLabel.setBounds(450,330,200,50);
        finalPanel.add(finalLabel);

        // .......bardash panel.......
        Panel bardashPanel = new Panel();
        bardashPanel.setLayout(null);
        Label label5 = new Label("مبلغ مورد نظر را وارد کنید");
        label5.setBounds(341,180,341,180);
        TextField textfield3 = new TextField();
        textfield3.setBounds(341,360,341,180);
        Button button5 = new Button("تایید");
        button5.setBounds(410,540,205,180);
        bardashPanel.add(label5);
        bardashPanel.add(textfield3);
        bardashPanel.add(button5);
        // ......password changer panel.......
        Panel ramzPanel = new Panel();
        ramzPanel.setLayout(null);
        Label label4 = new Label("رمز عبور جدید را وارد کنید");
        label4.setBounds(341,180,341,180);
        TextField textfield2 = new TextField();
        textfield2.setBounds(341,360,341,180);
        Button button4 = new Button("تایید");
        button4.setBounds(410,540,205,180);
        ramzPanel.add(label4);
        ramzPanel.add(textfield2);
        ramzPanel.add(button4);
        //......mojudi panel......
        Panel mojudiPanel = new Panel();
        mojudiPanel.setLayout(null);
        Label mojudii = new Label("موجودی حساب شما: 222222222 ریال");
        mojudii.setBounds(430,330,250,50);
        mojudiPanel.add(mojudii);

        //.....card Panel.....
        Panel cardPanel = new Panel();
        cardPanel.setLayout(null);
        Label label6 = new Label("مبلغ مورد نظر را وارد کنید:");
        label6.setBounds(341,120,341,60);
        TextField textfield4 = new TextField();
        textfield4.setBounds(341,180,341,60);
        Label label7 = new Label("شماره کارت مقصد را وارد کنید:");
        label7.setBounds(341,360,341,60);
        TextField textfield5 = new TextField();
        textfield5.setBounds(341,420,341,60);
        Button button6 = new Button("تایید");
        button6.setBounds(441,540,141,60);
        cardPanel.add(label6);
        cardPanel.add(textfield4);
        cardPanel.add(label7);
        cardPanel.add(textfield5);
        cardPanel.add(button6);

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(cardPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(ramzPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(bardashPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button bardasht = new Button("برداشت وجه نقد");
        bardasht.setBounds(0,140,256,150);
        bardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(bardashPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button ramz = new Button("تغییر رمز عبور");
        ramz.setBounds(768,140,256,150);
        ramz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(ramzPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button card = new Button("کارت به کارت");
        card.setBounds(0,430,256,150);
        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(cardPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        Button mojudi = new Button("اعلام موجودی");
        mojudi.setBounds(768,430,256,150);
        mojudi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(mojudiPanel);
                frame.revalidate();
                frame.repaint();
            }
        });
        mainButtons.add(bardasht);
        mainButtons.add(ramz);
        mainButtons.add(card);
        mainButtons.add(mojudi);
        Label label3 = new Label("  رمز خود را وارد کنید  ");
        label3.setBounds(341,180,341,180);
        TextField textfield = new TextField();
        textfield.setBounds(341,360,341,180);
        Button button3 = new Button("تایید");
        button3.setBounds(410,540,205,180);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(vorudiRamz);
                frame.add(mainButtons);
                frame.revalidate();
                frame.repaint();
            }
        });
        vorudiRamz.add(label3, BorderLayout.NORTH);
        vorudiRamz.add(textfield, BorderLayout.CENTER);
        vorudiRamz.add(button3, BorderLayout.SOUTH);
        Button lang = new Button("English");
        Button lang2 = new Button("فارسی");
        lang2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(vorudiRamz);
                frame.revalidate();
                frame.repaint();
            }
        });
        Label label = new Label("  Choose language  ");
        Label label2 = new Label(" زبان خود را انتخاب کنید ");

        frame.add(panel1);
        panel1.add(lang);
        panel1.add(label);
        panel1.add(label2);
        panel1.add(lang2);
        frame.setVisible(true);

    }
}
