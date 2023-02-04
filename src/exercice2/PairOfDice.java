package exercice2;


import java.util.Random;

public class PairOfDice {

	private double die1;
	
	private double die2;



	public PairOfDice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PairOfDice(double die1, double die2) {
		super();
		this.die1 = die1;
		this.die2 = die2;
	}
	
	
	public void LanceDe(){
	
	die1 = new Random().nextInt(6);
			
	die2 = new Random().nextInt(6);
				
		}				
	
	
	
	
public static void main(String[] args) {
		
	PairOfDice lance = new PairOfDice();
	int compteur =0;
	    
		do {
			lance.LanceDe();
			
			compteur++;
			
		}while(lance.die1 + lance.die2 != 2);
		
		System.out.println("Felicitation, vous avez gagne en  " + compteur + " tentatives ");
	}
	
	
	
	

}
