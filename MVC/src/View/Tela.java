package View;
import javax.swing.JFrame;

public class Tela {
	JFrame janela = new JFrame();
	
	public static void main(String args[]){
		new JFrame();
	}
	
	private Tela(){
		janela.setTitle("Calcula Rendimento");
		janela.setSize(350,150);
		janela.setLocation(50,50);
		//define que ao fechar a janela, encerre a aplicação
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

}
