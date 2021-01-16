package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmTest extends JFrame{
    private JPanel pnlPrincipal;
    private JTabbedPane tabbedPane1;

    public FrmTest (String titulo){
        super(titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(700, 600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);




    }
}
