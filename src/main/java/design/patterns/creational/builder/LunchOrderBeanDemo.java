package design.patterns.creational.builder;

public class LunchOrderBeanDemo {

public static void main(String args[]) {
		
		LunchOrderBean lunchOrderBean = new LunchOrderBean();

		// no immutability, no contract of what is a valid lunchOrder (things can be commented out)
		lunchOrderBean.setBread("Wheat");
		// lunchOrderBean.setCondiments("Lettuce");
		// lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());	
	}
	
}
