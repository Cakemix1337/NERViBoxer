package NERVEDuelArena;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
/*
 * Created by JFormDesigner on Wed Jul 04 02:53:55 EEST 2012
 */
import static NERVEDuelArena.Constants.*;
import ClueScrollPackage.ID;



/**
 * @author asdw easd
 */
public class DuelArenaGUI extends JFrame {
    public DuelArenaGUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
    	
    		String BASE_STAKE =  textField1.getText();
        	String MULTIPLIER =  textField2.getText();
        	String SPAM_MESSAGE = (String) comboBox1.getSelectedItem();
        	int SPAM_SPEED =  slider1.getValue();
        	
        	userChosenAmount = Integer.parseInt(BASE_STAKE);
        	multiply = Integer.parseInt(MULTIPLIER);

            if(SPAM_MESSAGE.equals("With display name")){
            	chosenSpamMessage = 2;
            }else if(SPAM_MESSAGE.equals("Without display name")){
            	chosenSpamMessage = 1;
            }
            
            if(SPAM_SPEED == 1){
            	spamSpeedX = 3000;
            	spamSpeedY = 5000;
            }else if(SPAM_SPEED == 2){
            	spamSpeedX = 1000;
            	spamSpeedY = 3000;
            }else if(SPAM_SPEED == 3){
            	spamSpeedX = 1;
            	spamSpeedY = 3;
            }
        
    	
        
    	
    	   setVisible(false);    
    	
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - asdw easd
        scrollPane1 = new JScrollPane();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        slider1 = new JSlider();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        button1 = new JButton();
        label8 = new JLabel();
        label9 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(new Rectangle(new Point(-35, 50), scrollPane1.getPreferredSize()));

        //---- label1 ----
        label1.setText("BASE STAKE:");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(20, 25), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("MULTIPLIER:");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(20, 60), label2.getPreferredSize()));

        //---- textField1 ----
        textField1.setText("100000");
        textField1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        contentPane.add(textField1);
        textField1.setBounds(90, 20, 145, 25);

        //---- textField2 ----
        textField2.setText("2");
        contentPane.add(textField2);
        textField2.setBounds(90, 55, 145, 25);

        //---- label3 ----
        label3.setText("SPAM MESSAGE:");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(20, 135), label3.getPreferredSize()));

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel(new String[] {
            "With display name",
            "Without display name"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(new Rectangle(new Point(115, 130), comboBox1.getPreferredSize()));

        //---- label4 ----
        label4.setText("SPAM MESSAGE SPEED:");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(20, 170), label4.getPreferredSize()));

        //---- slider1 ----
        slider1.setMinimum(1);
        slider1.setMaximum(3);
        slider1.setValue(2);
        contentPane.add(slider1);
        slider1.setBounds(145, 175, slider1.getPreferredSize().width, 25);

        //---- label5 ----
        label5.setText("1");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(155, 160), label5.getPreferredSize()));

        //---- label6 ----
        label6.setText("2");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(240, 160), label6.getPreferredSize()));

        //---- label7 ----
        label7.setText("3");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(325, 160), label7.getPreferredSize()));

        //---- button1 ----
        button1.setText("START");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(135, 210, 115, 40);

        //---- label8 ----
        label8.setBorder(new TitledBorder("STAKING OPTIONS"));
        contentPane.add(label8);
        label8.setBounds(5, 5, 345, 90);

        //---- label9 ----
        label9.setBorder(new CompoundBorder(new TitledBorder("MESSAGE OPTIONS"), new EmptyBorder(5, 5, 5, 5)));
        contentPane.add(label9);
        label9.setBounds(5, 105, 345, 100);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - asdw easd
    private JScrollPane scrollPane1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JSlider slider1;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JButton button1;
    private JLabel label8;
    private JLabel label9;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
