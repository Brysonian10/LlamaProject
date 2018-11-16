package controller;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import llama.model.Llama;

public class llamaController
{
	private Llama[] llamaArray;
	private ImageIcon [] icons;
	
	public void start()
	{
		
		
	}
	
	public llamaController()
	{
		icons = new ImageIcon[6];
		
		icons[0] = new ImageIcon(getClass().getResource("/llama/view/images/anotherLlama.JPG"));
		icons[1] = new ImageIcon(getClass().getResource("/llama/view/images/funnyLlama.jpg"));
		icons[2] = new ImageIcon(getClass().getResource("/llama/view/images/happyLlama.jpg"));
		icons[3] = new ImageIcon(getClass().getResource("/llama/view/images/llama.jpg"));
		icons[4] = new ImageIcon(getClass().getResource("/llama.view/images/llamaGlama.jpg"));
		icons[5] = new ImageIcon(getClass().getResource("/llama.view/images/sadLlama.jpg"));
	
		llamaArray = new Llama[10];
	}
	
	private void arrayInitialization()
	
	{
		JOptionPane.showMessageDialog(null, "When you initialize an array of objects, \nit is filled with a bunch of nulls", "Array", JOptionPane.INFORMATION_MESSAGE, icons[1]);
		JOptionPane.showMessageDialog(null, "If you try to use them it will crash", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[2]);
		
		JOptionPane.showMessageDialog(null,  "But if you fill the array with values its allll good");
		
		for (int index = 0; index < llamaArray.length; index += 1)
		{
			llamaArray[index] = new Llama();
		}
			
	}
	
	
}
