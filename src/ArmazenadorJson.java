import javax.swing.*;

class ArmazenadorJson implements Armazenador {
    public void salvar(String dados, JTextArea logArea) {
        logArea.append("[JSON] Salvando: " + dados + "\n");
    }
}