import java.util.Scanner;

public class ComboLockDemo {
	static Scanner scan = new Scanner(System.in);
	static ComboLock lock = new ComboLock(10,20,30);

	static void playLock () {
		String turnDirection = "";
		int ticks = 0;
		boolean validInput = true, lockOpen = false, lockRetry = true;
		do {
			s: while(true) {
				System.out.println("\nInput the direction of the turn and the number of ticks (ex. left 12) or \"open\" to try to open the lock.");
				do {
					turnDirection = scan.next().toLowerCase();
					if (turnDirection.equals("open")) {
						break s;
					}
					ticks = scan.nextInt();
					scan.nextLine();
					if (!turnDirection.equals("left") && !turnDirection.equals("right")) {
						System.out.println("Invalid input, input either \"left\" or \"right\" for the direction or \"open\" to open the lock.");
						validInput = false;
					}
				} while(!validInput);
				if(turnDirection.equals("left")) {
					lock.turnLeft(ticks);
				}
				else {
					lock.turnRight(ticks);
				}
				System.out.println("\nTurned the lock " + turnDirection + " " + ticks + " ticks.");
				System.out.println("Current Position: " + lock.getPos());
			}
			lockOpen = lock.checkNum();
			if(lockOpen) {
				System.out.println("You have opened the lock.\n");
				lockRetry = false;
			}
			else {
				System.out.println("You have not opened the lock.");
				System.out.println("Would you like to try again?");
				do {
					String yesOrNo = scan.next().toLowerCase();
					scan.nextLine();
					if (yesOrNo.equals("no")){
						lockRetry = false;
						lock.resetLock(false);
					}
					else if (yesOrNo.equals("yes")) {
					}
					else{
						System.out.println("Invalid input, input either \"yes\" or \"no\".");
						validInput = false;
					}
				} while (!validInput);
			}
		} while(lockRetry);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean replayLock = true, validInput = true;
		String yesOrNo = "";
		System.out.println("The range of the combination lock is 0-" + lock.getMAXNUM() + ".");

		while(replayLock) {
			playLock();
			System.out.println("Would you like to try a different combination?");
			do {
				yesOrNo = scan.next().toLowerCase();
				scan.nextLine();
				if (yesOrNo.equals("no")){
					replayLock = false;
				}
				else if (yesOrNo.equals("yes")) {
					lock.resetLock(true);
				}
				else{
					System.out.println("Invalid input, input either \"yes\" or \"no\".");
					validInput = false;
				}
			} while (!validInput);
		}
		System.out.println("Goodbye.");
	}
}
