package com.syntax.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TestDecodeURL {
	public static void main(String[] args) {
		String url = null;
		String url2=null;
		try {
			url = URLDecoder.decode("http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg,http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201804%2F09%2F20180409090424_8s3he.jpeg","utf-8");
			url2= URLDecoder.decode("%7B%22workOrderNum%22%3A%228e4f759a53654a91a6495aa5aa0a97d0%22%2C%22processHistory%22%3A%5B%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%B7%E8%8D%89%22%2C%22processTime%22%3A%222020-09-25+13%3A33%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A05%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%E5%A4%84%E7%90%86%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E5%88%86%E7%AE%A1%E9%A2%86%E5%AF%BC%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A29%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%5D%2C%22processResult%22%3A%220%22%2C%22processEndTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processNum%22%3A%2280027%22%7D" ,"utf-8");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(url);
		System.out.println(url2);
	}
}
