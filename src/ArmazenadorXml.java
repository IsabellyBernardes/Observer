import javax.swing.*;

public class ArmazenadorXml implements Armazenador {
    public void salvar(String dados, JTextArea logArea) {
        logArea.append("[XML] Salvando: " + dados + "\n");
    }
}
