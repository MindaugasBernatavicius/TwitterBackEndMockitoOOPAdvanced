package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.models.CardType;
import design.patterns.creational.abstractfactory.models.CreditCard;

public class AbstractFactoryDemo {

	public static void main(String[] args) {

	    // credit score being passed to the .getCreditCardFactory() method
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card2.getClass());
	}
}