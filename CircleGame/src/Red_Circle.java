
public class Red_Circle extends Thread implements Runnable {
	private int redX;
	private int redY;
	private int prevRedX;
	private int prevRedY;

	public Red_Circle(int redX, int redY, int prevRedX, int prevRedY) {
		// TODO Auto-generated constructor stub
		this.redX = redX;
		this.redY = redY;
		this.prevRedX = prevRedX;
		this.prevRedY = prevRedY;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
				System.out.println("Print in run method in red circle");
				prevRedX = redX;
				prevRedY = redY;
				redX = (int)(Math.random() * 500);
				redY = (int)(Math.random() * 500);
				System.out.println("redX: " + redX);
				System.out.println("redY: " + redY);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}	
	}

	/**
	 * @return the redX
	 */
	public int getRedX() {
		System.out.println("in red getX");
		return this.redX;
	}

	/**
	 * @param redX the redX to set
	 */
	public void setRedX(int redX) {
		System.out.println("in red setx");
		this.redX = redX;
	}

	/**
	 * @return the redY
	 */
	public int getRedY() {
		System.out.println("in red gety");
		return this.redY;
	}

	/**
	 * @param redY the redY to set
	 */
	public void setRedY(int redY) {
		System.out.println("in red sety");
		this.redY = redY;
	}

	/**
	 * @return the prevRedX
	 */
	public int getPrevRedX() {
		System.out.println("in get red prevx");
		return this.prevRedX;
	}

	/**
	 * @param prevRedX the prevRedX to set
	 */
	public void setPrevRedX(int prevRedX) {
		System.out.println("in set red prevredx");
		this.prevRedX = prevRedX;
	}

	/**
	 * @return the prevRedY
	 */
	public int getPrevRedY() {
		System.out.println("in get red prevy");
		return this.prevRedY;
	}

	/**
	 * @param prevRedY the prevRedY to set
	 */
	public void setPrevRedY(int prevRedY) {
		System.out.println("in set red prevy");
		this.prevRedY = prevRedY;
	}
	
	

}
