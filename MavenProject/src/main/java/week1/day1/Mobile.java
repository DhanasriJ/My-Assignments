package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("mobile details");
		
		String mobileModel = "Samsung";
		float mobileWeight = 800.8f;
		
		System.out.println("Mobile model:" +mobileModel +"  "+ "Mobile weight:" +mobileWeight);
		}

		public void sendMsg() {
			
			boolean isfullcharged=true;
			int mobileCost = 2000;	
			
			System.out.println("FullCharged:" +isfullcharged +"  "+ "Mobile cost:" +mobileCost);
		}
		
	public static void main(String[] args) {
		
		Mobile dj= new Mobile();
		
		dj.makeCall();
		dj.sendMsg();
		
		System.out.println("This is my mobile");
	
	}

}
