import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAvenger {
    private JPanel Ventana;
    private JTabbedPane tabbedPane1;
    private JTextField TxTid;
    private JTextField TxTNombre;
    private JTextField TxtPagoMensual;
    private JButton btnAgregarAvenger;
    private JTextField TxTAsignarAvenger;
    private JComboBox cBoxMision;
    private JButton BtnAsignar;
    private JSpinner SpinNiveldificultad;
    private JTextArea TxTprueba;
    private JTextArea txtprueba;
    private Lista lista = new Lista();

    public VentanaAvenger(){

        btnAgregarAvenger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = TxTid.getText();
                String nombre = TxTNombre.getText();
                int pagoMensual = Integer.parseInt(TxtPagoMensual.getText());
                try {
                    lista.add(id, nombre, pagoMensual);
                    TxTprueba.setText(lista.toString());
                    System.out.println(id + " " + nombre + " " + pagoMensual + lista);
                    //setearDatos();
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, en algo hay error, pero hay un error");
                    System.out.println(ex);
                }
            }
        });
        BtnAsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = TxTAsignarAvenger.getText();
                String MisionAsignada = cBoxMision.getSelectedItem().toString();
                int NivelPeligro = Integer.parseInt(SpinNiveldificultad.getValue().toString());
                try {
                    if (NivelPeligro <= 0 || NivelPeligro > 5 ){
                        JOptionPane.showMessageDialog(null, "Nivel de peligro inválido. Debe estar entre 1 y 5.");
                    }
                    //Avengers.add(id, MisionAsignada, NivelPeligro);

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public void setearDatos(){
        TxTid.setText("");
        TxTNombre.setText("");
        TxtPagoMensual.setText("");
        TxTAsignarAvenger.setText("");
        cBoxMision.setSelectedIndex(0);
        SpinNiveldificultad.setValue(1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaAvenger");
        frame.setContentPane(new VentanaAvenger().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}