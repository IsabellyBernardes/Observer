import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class EditorDeDados {
    private final List<Armazenador> armazenadores = new ArrayList<>();

    public void adicionarArmazenador(Armazenador a) {
        armazenadores.add(a);
    }

    public void removerArmazenador(Armazenador a) {
        armazenadores.remove(a);
    }

    public void atualizarDados(String dados, JTextArea logArea) {
        logArea.append("🛰️ Notificando " + armazenadores.size() + " armazenadores:\n");
        for (Armazenador a : armazenadores) {
            a.salvar(dados, logArea);
        }
        logArea.append("---------------------------\n");
    }
}
