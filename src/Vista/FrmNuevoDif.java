package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmNuevoDif extends JDialog {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JPanel pnlPrincipal;

    public FrmNuevoDif(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(620, 570);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
