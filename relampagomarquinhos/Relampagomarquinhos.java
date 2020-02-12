package relampagomarquinhos;
import javax.swing.JOptionPane;
public class Relampagomarquinhos {
    public static void main(String[] args) {
        String primeironumero =
               JOptionPane.showInputDialog("Insira um valor:");
        String segundonumero =
               JOptionPane.showInputDialog("Insira um segundo valor:");
        
        int numeroum = Integer.parseInt(primeironumero);
        int numerodois = Integer.parseInt(segundonumero);
        
        int soma = numeroum + numerodois;
        JOptionPane.showMessageDialog(null,"A soma dos numeros é:"+ soma);
    
   }
    
}
