package br.edu.femass.gui;

import br.edu.femass.dao.DaoCliente;
import br.edu.femass.model.Cliente;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

public class GuiCliente {
    private static GuiCliente guiCliente = new GuiCliente();
    private JTextField TxtNome;
    private JFormattedTextField TxtCpf;
    private JTextField TxtEndereco;
    private JButton btnSalvar;
    private JPanel jPanel;
    private JList lstCliente;

    public GuiCliente() {
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Cliente cliente = new Cliente(TxtNome.getText(), TxtCpf.getText(), TxtEndereco.getText());
                    new DaoCliente().save(cliente);
                    atualizar();
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aula PROG");
        frame.setContentPane(guiCliente.jPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            MaskFormatter mascara = new MaskFormatter("###.###.###-##");

            mascara.install(guiCliente.TxtCpf);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try{
            atualizar();
        } catch(Exception e){
            throw new RuntimeException(e);
        }

        frame.pack();

        frame.setVisible(true);
    }

    private static void atualizar() throws Exception {
        try {
            List<Cliente> cliente = new DaoCliente().getAll();
            guiCliente.lstCliente.setListData(cliente.toArray());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
