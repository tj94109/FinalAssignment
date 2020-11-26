package com.adv.java.network;

import java.net.*;

public interface NetworkDemo {

	static NetworkDemo newInstance(){

		return new com.adv.java.network.Hidden.NetworkImpl();
	}
	URLConnection connectUrl(String url) throws MalformedURLException;
	
}
