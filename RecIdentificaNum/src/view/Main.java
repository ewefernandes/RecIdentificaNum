package view;
import javax.swing.JOptionPane;
import controller.Modulos;

public class Main {

	public static void main(String[] args) {
		Modulos m = new Modulos ();
		int num = 0;
		int n2 = 0;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Valor de 10 a 999.999:"));
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Valor de 0 a 9:"));
		} while (num < 10 || num > 999999 || n2 < 0 || n2 > 9);
		
		String vetNum[] = Integer.toString(num).split("");
		int tam = (vetNum.length)-1;
		
		int ac = 0;
		
		int retorno = m.IdNumero(vetNum, tam, n2, ac);
		System.out.println(retorno);
	}

}
