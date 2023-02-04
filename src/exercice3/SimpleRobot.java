package exercice3;

public class SimpleRobot {
	
	private int forward;
	private int right;
	private int left;
	private int back;
	
	
	//constructor widthout parameters
	
	public SimpleRobot() {
		super();
	}
	
	//getters and setters
	
	public int getForward() {
		return forward;
	}


	public void setForward(int forward) {
		this.forward = forward;
	}


	public int getRight() {
		return right;
	}


	public void setRight(int right) {
		this.right = right;
	}


	public int getLeft() {
		return left;
	}


	public void setLeft(int left) {
		this.left = left;
	}


	public int getBack() {
		return back;
	}


	public void setBack(int back) {
		this.back = back;
	}


	//constructor width parameters
	
	public SimpleRobot(int forward, int right, int left, int back) {
		super();
		this.forward = forward;
		this.right = right;
		this.left = left;
		this.back = back;
	}
	
}
