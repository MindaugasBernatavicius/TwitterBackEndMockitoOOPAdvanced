package design.patterns.structural.proxy.TwitterSecurityProxy;

public interface TwitterService {
	public String getTimeline(String screenName);
	public void postToTimeline(String screenName, String message);
}
