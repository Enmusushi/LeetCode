package com.syntax.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

import org.json.JSONObject;

public class TestCallInterface {
	public static void main(String[] args) {
		//String pathUrl = "http://localhost:8080/bpm/rest/gdzctest/merchantsOperatingTest";
		String pathUrl = "http://218.75.41.250:18003//oto/workorder/processResult";
		OutputStreamWriter out = null;
		String result = "result=";
		PrintWriter outPrint = null;
		try {
			URL url = new URL(pathUrl);
			// 打开和url之间的连接
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 请求方式
			conn.setRequestMethod("POST");
			// conn.setRequestMethod("GET");
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0;Windows NT 5.1; SV1)");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			// DoOutput设置是否向httpUrlConnection输出，DoInput设置是否从httpUrlConnection读入，此外发送post请求必须设置这两个
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			

			
			outPrint = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8")); // 发送请求参数
			//System.out.println("流程结束发送的数据：" + data);
			//JSONObject jsonObj = new JSONObject();
			
			//jsonObj.put("data","%7B%22workOrderNum%22%3A%228e4f759a53654a91a6495aa5aa0a97d0%22%2C%22processHistory%22%3A%5B%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%B7%E8%8D%89%22%2C%22processTime%22%3A%222020-09-25+13%3A33%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A05%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%E5%A4%84%E7%90%86%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E5%88%86%E7%AE%A1%E9%A2%86%E5%AF%BC%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A29%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%5D%2C%22processResult%22%3A%220%22%2C%22processEndTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processNum%22%3A%2280027%22%7D");
			
			outPrint.print("data=%7B%22workOrderNum%22%3A%228e4f759a53654a91a6495aa5aa0a97d0%22%2C%22processHistory%22%3A%5B%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%B7%E8%8D%89%22%2C%22processTime%22%3A%222020-09-25+13%3A33%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A05%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E8%B5%84%E4%BA%A7%E8%BF%90%E8%90%A5%E4%B8%80%E9%83%A8%E3%80%81%E4%BA%8C%E9%83%A8%E5%A4%84%E7%90%86%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%2C%7B%22approver%22%3A%22Admin%22%2C%22processNode%22%3A%22%E5%88%86%E7%AE%A1%E9%A2%86%E5%AF%BC%22%2C%22processTime%22%3A%222020-09-25+13%3A34%3A29%22%2C%22processOpinion%22%3A%22%E5%90%8C%E6%84%8F%22%7D%5D%2C%22processResult%22%3A%220%22%2C%22processEndTime%22%3A%222020-09-25+13%3A34%3A37%22%2C%22processNum%22%3A%2280027%22%7D");		
			outPrint.flush();
			System.out.println(conn.getResponseCode());
			System.out.println(conn.getResponseMessage());
			System.out.println(conn.getContent());
//			System.out.println(URLDecoder.decode(jsonObj.toString(),"utf-8"));
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			System.out.println(result);
			// 关闭流
			in.close();
			// 断开连接，disconnect是在底层tcp socket链接空闲时才切断，如果正在被其他线程使用就不切断。
			conn.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (outPrint != null) {
					outPrint.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
