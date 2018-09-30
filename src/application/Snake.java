package application;

import java.awt.EventQueue;

import javax.swing.JFrame;

import entities.Board;

public class Snake extends JFrame{
	
	public Snake() {
		
		initUI();
	}

	private void initUI() {
		
		add(new Board());
		setResizable(false);
		pack();
		
		setTitle("Snake");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			
			JFrame ex = new Snake();
			ex.setVisible(true);
		});
	}
}
