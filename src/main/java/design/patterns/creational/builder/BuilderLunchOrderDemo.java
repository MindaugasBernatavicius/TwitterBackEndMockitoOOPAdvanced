package design.patterns.creational.builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();

		// we could populate this from a CSV file, where some properties do not exist
		builder.bread("Wheat").dressing("Mayo").meat("Turkey");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());	
	}
}
