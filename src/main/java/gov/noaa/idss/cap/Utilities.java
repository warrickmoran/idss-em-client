package gov.noaa.idss.cap;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class Utilities {
	public String removeHttpProtocol(String url) throws MalformedURLException {
		URL path = new URL(url);
		return path.getAuthority()+path.getFile();
	}
}
