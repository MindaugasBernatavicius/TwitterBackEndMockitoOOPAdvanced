package design.patterns.creational.abstractfactory;

import design.patterns.creational.abstractfactory.models.CardType;
import design.patterns.creational.abstractfactory.models.CreditCard;
import design.patterns.creational.abstractfactory.models.Validator;

//AbstractFactory
public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if(creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
