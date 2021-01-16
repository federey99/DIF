package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInformar extends JDialog{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton buscarButton;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JTable tablaInformar;
    DefaultTableModel model;
    private FrmInformar self;

    public FrmInformar (Window owner, String titulo){
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(620, 570);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.self = this;


        model = new DefaultTableModel();
        model.addColumn("Nombre causa");
        model.addColumn("N° Expediente");
        model.addColumn("Estado");
        LoadTabla();

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void LoadTabla() {

        tablaInformar.setModel(model);
    }
}
