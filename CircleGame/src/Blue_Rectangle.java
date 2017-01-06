import java.util.concurrent.SynchronousQueue;

public class Blue_Rectangle extends Thread implements Runnable{
	private int blueX;
	private int blueY;
	private int prevBlueX;
	private int prevBlueY;

	public Blue_Rectangle(int blueX, int blueY, int prevBlueX, int prevBlueY) {
		// TODO Auto-generated constructor stub
		this.blueX = blueX;
		this.blueY = blueY;
		this.prevBlueX = prevBlueX;
		this.prevBlueY = prevBlueY;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
				System.out.println("Print in run method blue rectangle");
				prevBlueX = blueX;
				prevBlueY = blueY;
				blueX = (int)(Math.random() * 500);
				blueY = (int)(Math.random() * 500);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

	/**
	 * @return the blueX
	 */
	public int getBlueX() {
		System.out.println("in get bluex");
		return this.blueX;
	}

	/**
	 * @param blueX the blueX to set
	 */
	public void setBlueX(int blueX) {
		System.out.println("in set bluex");
		this.blueX = blueX;
	}

	/**
	 * @return the blueY
	 */
	public int getBlueY() {
		System.out.println("in get bluey");
		return this.blueY;
	}

	/**
	 * @param blueY the blueY to set
	 */
	public void setBlueY(int blueY) {
		System.out.println("in set blue y");
		this.blueY = blueY;
	}

	/**
	 * @return the prevBlueX
	 */
	public int getPrevBlueX() {
		System.out.println("in get prevBluex");
		return this.prevBlueX;
	}

	/**
	 * @param prevBlueX the prevBlueX to set
	 */
	public void setPrevBlueX(int prevBlueX) {
		System.out.println("in set prev blue x");
		this.prevBlueX = prevBlueX;
	}

	/**
	 * @return the prevBlueY
	 */
	public int getPrevBlueY() {
		System.out.println("in get prev blue y");
		return this.prevBlueY;
	}

	/**
	 * @param prevBlueY the prevBlueY to set
	 */
	public void setPrevBlueY(int prevBlueY) {
		System.out.println("in prev blue y");
		this.prevBlueY = prevBlueY;
	}
	
	

}
