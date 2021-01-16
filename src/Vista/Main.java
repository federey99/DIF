package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel pnlPrincipal;
    private JButton ENPROCESOButton;
    private JButton PARAINFORMARButton;
    private JButton FINALIZADOSButton;
    private JButton URGENTESButton;
    private JButton FACTURADOSButton;
    private JButton BUSCARCAUSAButton;
    private JButton TESTVALORACIÓNDEVIOLENCIAButton;
    private JButton NUEVODIFButton;
    private Main self;

    public Main (String titulo) {
        super(titulo);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setContentPane(pnlPrincipal);
        this.setSize(520, 470);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Que la pantalla inicie CENTRADA
        this.setLocationRelativeTo(null);
        this.asociarEventos();
        this.self = this;

    }

    private void asociarEventos(){

        NUEVODIFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmNuevoDif frame = new FrmNuevoDif(self,"NUEVO DIF");
                frame.setVisible(true);
            }
        });
        URGENTESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmUrgentes frame = new FrmUrgentes(self,"URGENTES");
                frame.setVisible(true);
            }
        });
        ENPROCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmProceso frame = new FrmProceso(self,"EN PROCESO");
                frame.setVisible(true);
            }
        });
        PARAINFORMARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmInformar frame = new FrmInformar(self,"INFORMAR");
                frame.setVisible(true);
            }
        });
        FINALIZADOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmFinalizados frame = new FrmFinalizados(self,"FINALIZADOS");
                frame.setVisible(true);
            }
        });
        FACTURADOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmFacturados frame = new FrmFacturados(self,"FACTURADOS");
                frame.setVisible(true);
            }
        });
        BUSCARCAUSAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmBuscar frame = new FrmBuscar(self,"BUSCAR DIF");
                frame.setVisible(true);
            }
        });
        TESTVALORACIÓNDEVIOLENCIAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmTest frame = new FrmTest("TEST");
                frame.setVisible(true);
            }
        });

    }
    public static void main(String[] args) {
        Main frame = new Main("DIF");
        frame.setVisible(true);
    }
}
