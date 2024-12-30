import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraFX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Simples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(5, 1));

        JLabel labelNumero1 = new JLabel("Digite o primeiro número");
        JTextField campoNumero1 = new JTextField();

        JLabel labelNumero2 = new JLabel("Digite o segundo número");
        JTextField campoNumero2 = new JTextField();

        JLabel resultadoLabel = new JLabel("Resultado: ");

        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new GridLayout(1, 5)); // Layout para botões

        JButton btnAdicao = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMultiplicacao = new JButton("*");
        JButton btnDivisao = new JButton("/");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");
        JMenuItem limpar = new JMenuItem("Limpar");
        JMenuItem sair = new JMenuItem("Sair");

        menu.add(limpar);
        menu.add(sair);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        limpar.addActionListener(e -> {
            campoNumero1.setText("");
            campoNumero2.setText("");
            resultadoLabel.setText("Resultado: ");
        });
        sair.addActionListener(e -> System.exit(0));

        frame.add(labelNumero1);
        frame.add(campoNumero1);
        frame.add(labelNumero2);
        frame.add(campoNumero2);
        frame.add(botoesPanel);
        botoesPanel.add(btnAdicao);
        botoesPanel.add(btnSubtracao);
        botoesPanel.add(btnMultiplicacao);
        botoesPanel.add(btnDivisao);
        frame.add(resultadoLabel);

        // Adicionando ações aos botões
        btnAdicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNumero1.getText());
                    int num2 = Integer.parseInt(campoNumero2.getText());
                    resultadoLabel.setText("Resultado: " + (num1 + num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        btnSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNumero1.getText());
                    int num2 = Integer.parseInt(campoNumero2.getText());
                    resultadoLabel.setText("Resultado: " + (num1 - num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        btnMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNumero1.getText());
                    int num2 = Integer.parseInt(campoNumero2.getText());
                    resultadoLabel.setText("Resultado: " + (num1 * num2));
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        btnDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNumero1.getText());
                    int num2 = Integer.parseInt(campoNumero2.getText());
                    if (num2 != 0) {
                        resultadoLabel.setText("Resultado: " + (num1 / num2));
                    } else {
                        resultadoLabel.setText("Erro: Divisão por zero.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        // Tornando a janela visível
        frame.setVisible(true);

    }
}
