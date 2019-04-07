package design.patterns.creational.factory;

import design.patterns.creational.factory.model.Blog;
import design.patterns.creational.factory.model.Shop;
import design.patterns.creational.factory.model.Website;
import design.patterns.creational.factory.model.WebsiteType;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
			case SHOP : {
				return new Shop();
			}
			default : {
				return null;
			}
 		}
	}
	
}
