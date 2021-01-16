package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmFacturados extends JDialog{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton buscarButton;
    private JTable tablaFacturados;
    private JButton aceptarButton;
    private JButton cancelarButton;
    DefaultTableModel model;
    private FrmFacturados self;

    public FrmFacturados (Window owner, String titulo){
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
        model.addColumn("Teléfono");
        model.addColumn("Estado");
        LoadTabla();


        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {dispose();}
        });
    }
    private void LoadTabla() {

        tablaFacturados.setModel(model);
    }
}

