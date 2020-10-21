package com.syntax.test;

import java.net.URI;

public class GetIP {
	public static void main(String[] args) {
		String url ="http://218.75.41.250:18003//oto/workorder/processResult";
		URI uri = URI.create(url);
		 String newURL =uri.getScheme()+ uri.getUserInfo()+uri.getHost()+ uri.getPort();
		System.out.println(uri.getRawPath());
		System.out.println(uri.getPath());
		System.out.println(uri.getRawSchemeSpecificPart());
		System.out.println(uri.getQuery());
		System.out.println(uri.getFragment());
	
		System.out.println(newURL);
	}
	  private static String getInternetAddress(URI uri) {
	        URI effectiveURI = null;
	        try {
	            // URI(String scheme, String userInfo, String host, int port, String
	            // path, String query,String fragment)
	            effectiveURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null);
	        } catch (Throwable var4) {
	            effectiveURI = null;
	        }
	        if(effectiveURI!=null) {
	        	return effectiveURI.toString();
	        }
	        return null;
	    }
}
