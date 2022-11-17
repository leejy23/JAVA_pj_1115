package Card;

import java.awt.*;
import javax.swing.*;

public class GUIII {
	GameReset Game;
	public GUIII() {	
		Game=new GameReset();
		Game.randNumber();
		Game.imageFunction();
		Start();
	}
	public void Start() {
		JFrame frm=new JFrame("카드 뒤집기 게임");
		frm.setBounds(120, 120, 600, 500);
		
		JPanel bp=new JPanel();
		bp.setLayout(new GridLayout(2,5,4,4));
		cardButton[] btn=new cardButton[10];
		ActionButtonHandler action=new ActionButtonHandler(btn,this);
		for(int i=0;i<10;i++)
		{
			btn[i]=new cardButton(Integer.toString(i),Game.GetArr(i),Game.GetImage(Game.GetArr(i)),Game.GetImage(0));
			btn[i].addActionListener(action);
			bp.add(btn[i]);
		}
		
		frm.add(bp);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public int showPapUp() {
		int result;
		int Gscore = 200;
		result=JOptionPane.showConfirmDialog(null,
				"계속 하시겠습니까?","게임 클리어! "+"당신의 점수: "+Gscore,JOptionPane.YES_NO_OPTION);
		return result;
	}
	public GameReset ReturnGame() {
		return Game;
	}
}


