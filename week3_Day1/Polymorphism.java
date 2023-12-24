package week3_Day1;

public class Polymorphism {

	public void reportStep(String msg, String status) {
		System.out.println(msg+ " "+status);

		}
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println(msg+" "+status+" "+snap);
	}
	public static void main(String[] args) {
		Polymorphism pol=new Polymorphism();
		pol.reportStep("Hello", "Completed");
		pol.reportStep("welcome", "Inprogress", false);

	}

}
