import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame("ATM");
        Dimension frameSize = new Dimension(1024,720);
        frame.setSize(frameSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(230,250,185));

        Panel mainButtons = new Panel();
        Panel panel1 = new Panel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 300));
        Panel vorudiRamz = new Panel();


        //.....choose your language panel....

        Button lang = new Button("English");
        Label label = new Label("  Choose language  ");
        Button lang2 = new Button("فارسی");
        Label label2 = new Label(" زبان خود را انتخاب کنید ");


        frame.add(panel1);
        panel1.add(lang);
        panel1.add(label);
        panel1.add(label2);
        panel1.add(lang2);

        lang2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(vorudiRamz);
                frame.revalidate();
                frame.repaint();
            }
        });

        //....vorudi ramz Panel....

        vorudiRamz.setLayout(null);
        Label passLabel = new Label("  رمز خود را وارد کنید  ");
        passLabel.setBounds(341,180,341,180);
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

        vorudiRamz.add(passLabel, BorderLayout.NORTH);
        vorudiRamz.add(textfield, BorderLayout.CENTER);
        vorudiRamz.add(button3, BorderLayout.SOUTH);

        //....mainButtons Panel....

        mainButtons.setLayout(null);

        Button bardasht = new Button("برداشت وجه نقد");
        bardasht.setBounds(0,140,256,150);

        Button ramz = new Button("تغییر رمز عبور");
        ramz.setBounds(768,140,256,150);

        Button card = new Button("کارت به کارت");
        card.setBounds(0,430,256,150);

        Button mojudi = new Button("اعلام موجودی");
        mojudi.setBounds(768,430,256,150);

        Panel bardashPanel = new Panel();
        Panel ramzPanel = new Panel();
        Panel mojudiPanel = new Panel();
        Panel cardPanel = new Panel();


        bardasht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(bardashPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        ramz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(ramzPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        card.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(mainButtons);
                frame.add(cardPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

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


        //....final panel....

        Panel finalPanel = new Panel();
        finalPanel.setLayout(null);
        Label finalLabel = new Label("عملیات با موفقیت انجام شد");
        finalLabel.setBounds(450,330,200,50);
        finalPanel.add(finalLabel);

        // .......bardash panel.......

        bardashPanel.setLayout(null);
        Label bardashtLabel = new Label("مبلغ مورد نظر را وارد کنید");
        bardashtLabel.setBounds(341,180,341,180);
        TextField bardashttextfield = new TextField();
        bardashttextfield.setBounds(341,360,341,180);
        Button confirmBardashtButton = new Button("تایید");
        confirmBardashtButton.setBounds(410,540,205,180);

        confirmBardashtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(bardashPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        bardashPanel.add(bardashtLabel);
        bardashPanel.add(bardashttextfield);
        bardashPanel.add(confirmBardashtButton);

        // ......password changer panel.......

        ramzPanel.setLayout(null);
        Label changePasslabel = new Label("رمز عبور جدید را وارد کنید");
        changePasslabel.setBounds(341,180,341,180);
        TextField changepasstextfield = new TextField();
        changepasstextfield.setBounds(341,360,341,180);
        Button passConfirmButton = new Button("تایید");
        passConfirmButton.setBounds(410,540,205,180);

        passConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(ramzPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        ramzPanel.add(changePasslabel);
        ramzPanel.add(changepasstextfield);
        ramzPanel.add(passConfirmButton);

        //......mojudi panel......

        mojudiPanel.setLayout(null);
        Label mojudii = new Label("موجودی حساب شما: 222222222 ریال");
        mojudii.setBounds(430,330,250,50);
        mojudiPanel.add(mojudii);

        //.....card Panel.....

        cardPanel.setLayout(null);
        Label amountLabel = new Label("مبلغ مورد نظر را وارد کنید:");
        amountLabel.setBounds(341,120,341,60);
        TextField amountTestField = new TextField();
        amountTestField.setBounds(341,180,341,60);
        Label shomareCardButton = new Label("شماره کارت مقصد را وارد کنید:");
        shomareCardButton.setBounds(341,360,341,60);
        TextField cardNumTextField = new TextField();
        cardNumTextField.setBounds(341,420,341,60);
        Button confirmButton = new Button("تایید");
        confirmButton.setBounds(441,540,141,60);

        cardPanel.add(amountLabel);
        cardPanel.add(amountTestField);
        cardPanel.add(shomareCardButton);
        cardPanel.add(cardNumTextField);
        cardPanel.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(cardPanel);
                frame.add(finalPanel);
                frame.revalidate();
                frame.repaint();
            }
        });


        frame.setVisible(true);
    }
}
