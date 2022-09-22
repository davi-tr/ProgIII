package br.edu.femass.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GuiAutenti {
    private JPasswordField txtSenha;
    private JButton btnConfirmar;
    private JPanel cSenha;

    public GuiAutenti() {
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] input = txtSenha.getPassword();
                if (isPasswordCorrect(input)){
                    JOptionPane.showMessageDialog(null,"Senha Correta");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null,"Senha invalida");
                }
            }
        });
    }

    private static boolean isPasswordCorrect (char[] input){
        boolean isCorrect = true;
        char[] senha = {'1','2','3','4'};

        if (input.length != senha.length){
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(input, senha);
        }

        Arrays.fill(senha,'0');

        return isCorrect;
    }

    public static void main(String[] args) {
        GuiAutenti guiAutenti = new GuiAutenti();
        JFrame frame = new JFrame("TESTE");
        frame.setContentPane(guiAutenti.cSenha);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);

    }
}

