
public class ComboLock {

	private int[] combo;
	private int pos, num1=0, num2=0, num3=0, currentNum = 0;
	final private int MAXNUM = 39;

	/**
	 * Initializes object
	 * @param num1 first number of combo
	 * @param num2 second number of combo
	 * @param num3 third number of combo
	 */
	ComboLock(int num1, int num2, int num3){
		combo = new int[] {num1, num2, num3};
		pos = 0;
	}

	/**
	 * Resets lock
	 * @param silent
	 */
	void resetLock(boolean newInstance){
		pos = 0;
		currentNum = 0;
		num1 = 0; 
		num2 = 0; 
		num3 = 0;
		System.out.println("The lock has been reset.");	

		if (newInstance) {
			for (int i = 0; i<3; i++) {
				combo[i] += 10;
				if (combo[i] > MAXNUM) {
					combo[i] = combo[i] % (MAXNUM+1);
				}
			}
		}
	}

	/**
	 * Turns lock right
	 * @param ticks
	 */
	void turnLeft(int ticks){
		if (currentNum == 0) {
			currentNum = 1;
		}
		pos = (ticks+pos)%(MAXNUM+1);
		if (currentNum == 1) {
			num2 = pos;
		}

	}

	/**
	 * Turns lock left
	 * @param ticks
	 */
	void turnRight(int ticks){
		if (currentNum == 1) {
			currentNum = 2;
		}
		pos = (MAXNUM + 1 + (pos-ticks)) % (MAXNUM+1);
		if (currentNum == 0) {
			num1 = pos;
		}
		else if (currentNum == 2) {
			num3 = pos;
		}
	}

	/**
	 * 
	 * @return
	 */
	boolean checkNum(){
		if (num1 != combo[0] || num2 != combo[1] || num3 != combo[2]) {
			return false;
		}
		return true;
	}

	/**
	 * Gets max number
	 * @return MAXNUM constant
	 */
	int getMAXNUM() {
		return MAXNUM;
	}

	/**
	 * Gets current position
	 * @return pos integer
	 */
	int getPos() {
		return pos;
	}
}
