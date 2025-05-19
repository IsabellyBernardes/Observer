import javax.swing.*;
import java.awt.*;

public class MainGUI {
    private static EditorDeDados editor = new EditorDeDados();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Observer Pattern Visual");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setLayout(new BorderLayout());

            JPanel checkboxPanel = new JPanel(new GridLayout(3, 1));
            JCheckBox cbJson = new JCheckBox("Salvar em JSON");
            JCheckBox cbXml = new JCheckBox("Salvar em XML");
            JCheckBox cbBd = new JCheckBox("Salvar em Banco de Dados");

            ArmazenadorJson json = new ArmazenadorJson();
            ArmazenadorXml xml = new ArmazenadorXml();
            ArmazenadorBancoDados bd = new ArmazenadorBancoDados();

            checkboxPanel.add(cbJson);
            checkboxPanel.add(cbXml);
            checkboxPanel.add(cbBd);

            JTextArea logArea = new JTextArea();
            logArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(logArea);

            JButton atualizarBtn = new JButton("Atualizar Dados");
            atualizarBtn.addActionListener(e -> {
                editor = new EditorDeDados(); // ✅ permitido agora que é atributo da classe
                if (cbJson.isSelected()) editor.adicionarArmazenador(json);
                if (cbXml.isSelected()) editor.adicionarArmazenador(xml);
                if (cbBd.isSelected()) editor.adicionarArmazenador(bd);

                editor.atualizarDados("Temperatura: " + (20 + (int)(Math.random()*10)) + "°C", logArea);
            });

            frame.add(checkboxPanel, BorderLayout.NORTH);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(atualizarBtn, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}