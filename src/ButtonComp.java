import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;


public class ButtonComp extends JButton implements MouseListener {

	private static final long serialVersionUID = 1L;
	private TTT game;
	int row, col, flag;

	public ButtonComp(int row, int col, TTT game) {
		this.row = row; this.col = col; this.game = game;
		flag = 0;
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if (this.isEnabled()) {
			game.buttonClicked(this);
			this.setEnabled(false);
			int response = game.checkIfWon(game.gameState);
			if (response != 0) {
				game.gameOver(response);
			} 
			if (game.total == 9) {
				game.gameOver(0);
			}
			if (game.turn== 1 && game.vsComputer) {
				game.computerTurn();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}