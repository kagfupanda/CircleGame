import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements Runnable {
	Thread redCirc;
	Thread blueRect;

	private void commonCtorCode() {
		this.setTitle("Game");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(new GridLayout(0,1));

		pack();
		setVisible(true);
	}

	public GameFrame() {
		commonCtorCode();
	}

	public GameFrame(final Thread redCirc, final Thread blueRect) {
		// TODO Auto-generated constructor stub
		this.redCirc = redCirc;
		this.blueRect = blueRect;

		commonCtorCode();
	}

	public void paint(Graphics g){
		System.out.println("in paint method");
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.WHITE);
		g2d.fill(new Rectangle2D.Double(((Blue_Rectangle)blueRect).getPrevBlueX(), ((Blue_Rectangle)blueRect).getPrevBlueY(), 10, 10));
		g2d.fill(new Ellipse2D.Double(((Red_Circle) redCirc).getPrevRedX(), ((Red_Circle) redCirc).getPrevRedY(), 10, 10));
		g2d.setPaint(Color.GREEN);
		int counter = 0;
		for(int x = 0; x < 500; x= x + 20) {
			for(int y = 0; y < 500; y = y + 20) {
				g2d.fill(new Ellipse2D.Double(x, y, 10, 10));
				counter++;
			}
		}
		g2d.setColor(Color.RED);
		g2d.fill(new Ellipse2D.Double(((Red_Circle) redCirc).getRedX(), ((Red_Circle) redCirc).getRedY(), 10, 10));
		g2d.setColor(Color.BLUE);
		g2d.fill(new Rectangle2D.Double(((Blue_Rectangle)blueRect).getBlueX(), ((Blue_Rectangle)blueRect).getBlueY(), 10, 10));
		System.out.println(counter);

	}

	public Dimension getPreferredSize() {
		System.out.println("size method");
		return new Dimension(500, 500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red_Circle rc = new Red_Circle(0,0,0,0);
		Thread rt = new Thread(rc);
		rt.start();
		Blue_Rectangle br = new Blue_Rectangle(0,0,0,0);
		Thread bt = new Thread(br);
		bt.start();
		GameFrame gf = new GameFrame(rc, br);
		Thread t = new Thread(gf);
		t.start();


	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try { 
			System.out.println("run in frame");
			Thread.sleep(2000);
			repaint();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
