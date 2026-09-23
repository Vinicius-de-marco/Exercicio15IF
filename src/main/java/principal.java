
import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
        String  nome;
        int idade;
        
        nome = (JOptionPane.showInputDialog("Digite seu nome: "));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        if ((idade > 15) && (idade < 25)) {
            JOptionPane.showMessageDialog(null, "Aceito: " + nome);
        }else {
            JOptionPane.showMessageDialog(null, "NÃO ACEITA: " + nome);
        }
    }
}
