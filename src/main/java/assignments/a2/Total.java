package assignments.a2;

import java.io.IOException;

import utils.KeyboardReader;

/*
 * Name: Jackson Wilson
 *
 * Date: 12/23/17
 * 
 * Assignment Number: Assignment 2
 * 
 * Instructor: Todd Simeone
 */
public class Total {
    private long total;

    public Total() {
        this.total = 0;
	}
	
	public final void addToTotal(int val) {
        total += val;
	}
	
	public final void subtractFromTotal(int val) {
        total -= val;
	}
	
	public final void incrementTotal() {
        total++;
	}
	
	public final void decrementTotal() {
        --total;
	}
	
	public static final void main(String[] args) throws IOException {
		Total running = new Total();
		
		running.addToTotal(KeyboardReader.getInstance().readInt("Enter an initial value: "));
		running.subtractFromTotal(KeyboardReader.getInstance().readInt("Enter an amount to subtract from the initial value: "));
        System.out.println("Current total is " + running.total);
        System.out.println("Now incrementing total");
        running.incrementTotal();
        System.out.println("Current total is " + running.total);
        System.out.println("Now decrementing total");
        running.decrementTotal();
        System.out.println("Current total is " + running.total);
	}
}