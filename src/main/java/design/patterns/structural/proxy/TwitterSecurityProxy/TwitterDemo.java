package design.patterns.structural.proxy.TwitterSecurityProxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		
		System.out.println(service.getTimeline("xxx"));
		
		service.postToTimeline("xxx", "Some message that shouldn't go through.");
	}
}
