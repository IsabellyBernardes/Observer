import javax.swing.*;
public class ArmazenadorBancoDados implements Armazenador {
    public void salvar(String dados, JTextArea logArea) {
        logArea.append("[BD] Salvando: " + dados + "\n");
    }
}
