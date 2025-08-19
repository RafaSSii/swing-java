import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TelaSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exemplo Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new BorderLayout());

            JLabel label = new JLabel("Digite seu nome:", SwingConstants.CENTER);
            JTextField campoTexto = new JTextField();
            JButton botao = new JButton("Enviar");

            botao.addActionListener(e -> {
                String nome = campoTexto.getText();
                if (nome.isEmpty()) {
                    label.setText("Por favor, digite algo!");
                } else {
                    label.setText("Olá, " + nome + "!");
                }
            });

            frame.add(label, BorderLayout.NORTH);
            frame.add(campoTexto, BorderLayout.CENTER);
            frame.add(botao, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}