package com.syntax.class19;

public class USA {
	//create variables to hold state and capital
		String state,stateCapital;
		public USA(String state,String stateCapital) {
			this.state=state;
			this.stateCapital=stateCapital;
			
		}
		public void displayState() {
			System.out.println(state);
		}
		public void displayStateCapital() {
			System.out.println(stateCapital);
		}
		//can I call one method inside another method?--yes
		public void displayInfo() {
			displayState();
			displayStateCapital();
			
		}
		//create method to display state and stateCapital
		public static void main(String[] args) {
			USA state1=new USA("Texas","Austin");
			//state1.displayState();
			//state1.displayStateCapital();

		state1.displayInfo();
		
		state1=new USA("Georgia","Atlanta");
		state1.displayInfo();

}
}
