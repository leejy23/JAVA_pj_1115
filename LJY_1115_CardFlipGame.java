import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class CardFlip extends JFrame{
	// 상단 게임제목, 점수
	public JPanel Pscore = new JPanel();
	public JLabel Lname = new JLabel("카드 뒤집기");
	public JTextField Tscore = new JTextField("1000",5);
	public JLabel Lscorename = new JLabel("점수");
	public int Gscore = 1000;
	
	// 중앙 게임파트. 버튼 및 버튼 이미지, 리스너 선언
	public JPanel Pgame = new JPanel();
	ImageIcon apple = new ImageIcon("images/apple.png");
	ImageIcon pepe = new ImageIcon("images/pepe.jpg");
	
	public JButton Bcard1 = new JButton("1");
	public JButton Bcard2 = new JButton("2");
	public JButton Bcard3 = new JButton("3");
	public JButton Bcard4 = new JButton("4");
	public JButton Bcard5 = new JButton("5");
	public JButton Bcard6 = new JButton("6");
	public JButton Bcard7 = new JButton("7");
	public JButton Bcard8 = new JButton("8");
	public JButton Bcard9 = new JButton("9");
	public JButton Bcard10 = new JButton("10");
	public JButton Bcard11 = new JButton("11");
	public JButton Bcard12 = new JButton("12");
	public JButton Bcard13 = new JButton("13");
	public JButton Bcard14 = new JButton("14");
	public JButton Bcard15 = new JButton("15");
	public JButton Bcard16 = new JButton("16");
	
	private GridLayout grid = new GridLayout(4,4);
	// 하단 게임종료, 다시시작 버튼
	public JPanel Phadan = new JPanel();
	public JButton Bexit = new JButton("종료");
	public JButton Brestart = new JButton("다시시작");
	
	private MyActionListener lis = new MyActionListener();
	// 위의 순서와 동일하게 생성자에서 구현함
	public CardFlip() {
		setTitle("카드 뒤집기 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		setVisible(true);
		// 상단 등록
		add(Pscore,BorderLayout.NORTH);
		Pscore.setBackground(Color.LIGHT_GRAY);
		Pscore.add(Lname);
		Lname.setFont(new Font("카드 뒤집기", Font.BOLD,50));
		Pscore.add(Lscorename);
		Pscore.add(Tscore);
		
		add(Pgame);
		Pgame.setLayout(grid);
		// 버튼 등록
		//------
		/*
		JButton Bcard1 = new JButton("1");
		JButton Bcard2 = new JButton("2");
		JButton Bcard3 = new JButton("3");
		JButton Bcard4 = new JButton("4");
		JButton Bcard5 = new JButton("5");
		JButton Bcard6 = new JButton("6");
		JButton Bcard7 = new JButton("7");
		JButton Bcard8 = new JButton("8");
		JButton Bcard9 = new JButton("9");
		JButton Bcard10 = new JButton("10");
		JButton Bcard11 = new JButton("11");
		JButton Bcard12 = new JButton("12");
		JButton Bcard13 = new JButton("13");
		JButton Bcard14 = new JButton("14");
		JButton Bcard15 = new JButton("15");
		JButton Bcard16 = new JButton("16");
		*/
		//----------
		Bcard1.setPressedIcon(pepe);
		Pgame.add(Bcard1);
		Pgame.add(Bcard2);
		Pgame.add(Bcard3);
		Pgame.add(Bcard4);
		Pgame.add(Bcard5);
		Pgame.add(Bcard6);
		Pgame.add(Bcard7);
		Pgame.add(Bcard8);
		Pgame.add(Bcard9);
		Pgame.add(Bcard10);
		Pgame.add(Bcard11);
		Pgame.add(Bcard12);
		Pgame.add(Bcard13);
		Pgame.add(Bcard14);
		Pgame.add(Bcard15);
		Pgame.add(Bcard16);
		
		
		// 하단 등록
		add(Phadan,BorderLayout.SOUTH);
		Phadan.setBackground(Color.YELLOW);
		Phadan.add(Bexit);
		Phadan.add(Brestart);
		
		// 액션 리스너 연동
		Bcard1.addActionListener(lis);
		Bcard2.addActionListener(lis);
		Bcard3.addActionListener(lis);
		Bcard4.addActionListener(lis);
		Bcard5.addActionListener(lis);
		Bcard6.addActionListener(lis);
		Bcard7.addActionListener(lis);
		Bcard8.addActionListener(lis);
		Bcard9.addActionListener(lis);
		Bcard10.addActionListener(lis);
		Bcard11.addActionListener(lis);
		Bcard12.addActionListener(lis);
		Bcard13.addActionListener(lis);
		Bcard14.addActionListener(lis);
		Bcard15.addActionListener(lis);
		Bcard16.addActionListener(lis);
		Bexit.addActionListener(lis);
		Brestart.addActionListener(lis);
		
	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("종료")) {
				dispose();
			}
			else if (b.getText().equals("1")) {
				//Bcard1.setIcon(pepe);
			}
		}
		
	}
	class ScoreCounter implements ActionListener{
		public void actionPerformed(ActionEvent a) {
			JButton d = (JButton)a.getSource();
			if(d.getText().equals("1")) {
				int n1 = Integer.parseInt(Tscore.getText());
				int GscoreBox=n1-100;
				Tscore.setText(Integer.toString(GscoreBox));
			}
		}
	}
}
public class LJY_1115_CardFlipGame {

	public static void main(String[] args) {
		new CardFlip();
	}

}