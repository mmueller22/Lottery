import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
    JPanel panel;
    JLabel lblTipp;
    JLabel lblZiehung;
    JLabel lblZusatzzahl;
    JLabel lblAusgabe;
    JLabel lblZahl1;
    JLabel lblZahl2;
    JLabel lblZahl3;
    JLabel lblZahl4;
    JLabel lblZahl5;
    JLabel lblZahl6;
    JTextField txtZahl1;
    JTextField txtZahl2;
    JTextField txtZahl3;
    JTextField txtZahl4;
    JTextField txtZahl5;
    JTextField txtZahl6;
    JButton btnZiehen;

    Spiel newSpiel;

    public GUI(int width, int height) {
        setTitle("Lottery");
        setBounds(500, 200, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
		panel = new JPanel();
        addElements();
        add(panel);
    }

    private void addElements(){
        lblTipp = new JLabel("Tipp:");
        lblZiehung = new JLabel("Ziehung:");
        lblZusatzzahl = new JLabel("Zusatzzahl:");
        lblAusgabe = new JLabel();
        lblZahl1 = new JLabel();
        lblZahl2 = new JLabel();
        lblZahl3 = new JLabel();
        lblZahl4 = new JLabel();
        lblZahl5 = new JLabel();
        lblZahl6 = new JLabel();
        txtZahl1 = new JTextField();
        txtZahl2 = new JTextField();
        txtZahl3 = new JTextField();
        txtZahl4 = new JTextField();
        txtZahl5 = new JTextField();
        txtZahl6 = new JTextField();
        btnZiehen = new JButton("Ziehen");

        lblTipp.setBounds(20, 10, 100, 40);
        txtZahl1.setBounds(80, 10, 40, 40);
        txtZahl2.setBounds(150, 10, 40, 40);
        txtZahl3.setBounds(220, 10, 40, 40);
        txtZahl4.setBounds(290, 10, 40, 40);
        txtZahl5.setBounds(360, 10, 40, 40);
        txtZahl6.setBounds(430, 10, 40, 40);

        lblZiehung.setBounds(20, 60, 100, 40);
        lblZahl1.setBounds(90, 60, 50, 40);
        lblZahl2.setBounds(160, 60, 50, 40);
        lblZahl3.setBounds(230, 60, 50, 40);
        lblZahl4.setBounds(300, 60, 50, 40);
        lblZahl5.setBounds(370, 60, 50, 40);
        lblZahl6.setBounds(440, 60, 50, 40);

        lblZusatzzahl.setBounds(370, 140, 100, 40);
        lblAusgabe.setBounds(120, 200, 250, 40);
        btnZiehen.setBounds(370, 200, 100, 40);

        btnZiehen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int T1 = Integer.parseInt(txtZahl1.getText());
                int T2 = Integer.parseInt(txtZahl2.getText());
                int T3 = Integer.parseInt(txtZahl3.getText());
                int T4 = Integer.parseInt(txtZahl4.getText());
                int T5 = Integer.parseInt(txtZahl5.getText());
                int T6 = Integer.parseInt(txtZahl6.getText());

                newSpiel = new Spiel(T1, T2, T3, T4, T5, T6);
            }
        });

        add(lblTipp);
        add(lblZiehung);
        add(lblZusatzzahl);
        add(lblAusgabe);
        add(lblZahl1);
        add(lblZahl2);
        add(lblZahl3);
        add(lblZahl4);
        add(lblZahl5);
        add(lblZahl6);
        add(txtZahl1);
        add(txtZahl2);
        add(txtZahl3);
        add(txtZahl4);
        add(txtZahl5);
        add(txtZahl6);
        add(btnZiehen);
    }

    public static void main(String[] args) {
        new GUI(500, 500).setVisible(true);
    }
}