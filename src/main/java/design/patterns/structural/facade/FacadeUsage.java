package design.patterns.structural.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeUsage {

	public static void main(String args[]) throws Exception {

		URL url = new URL("http", "blog.mindaugas.cf", 80, "/category/career/");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
	}
}