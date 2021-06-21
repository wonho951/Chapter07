package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException{
		/*
		//다른 컴퓨터에서 작동할 애 --> 유저
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		
		System.out.println("<클라이언트 시작>");
		System.out.println("===================================");
		
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("183.96.42.64", 10001));	//서버 아이피 포트해서 요청함.
		System.out.println("[서버에 연결되었습니다.]");
		
		
		//메세지 보내기용 스트림	(클라이언트에서 서버로 보냄)
		OutputStream os = socket.getOutputStream();	//아웃풋 조상이 같음.
		// 기존 아웃풋 스트림 사용법
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		//메세지 받기용 스트림	(서버에서 클라이언트로 받음)
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//키보드 입력 스캐너
		Scanner sc = new Scanner(System.in);
	
		//메세지 보내기.
		//보내는 메세지 키보드 입력	
		String str = sc.nextLine();
			
		//보내기
		bw.write(str);
		bw.newLine();
		bw.flush();
		

		//메세지 받기
		String reMsg = br.readLine();		
		System.out.println("server: [" + reMsg + "]");
		
		
		sc.close();
		socket.close();
		*/
		
		
		
		
		
		
		/*
		//스캐너-스트림 이용해서 만들기
		//다른 컴퓨터에서 작동할 애 --> 유저
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		
		System.out.println("<클라이언트 시작>");
		System.out.println("===================================");
		
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("183.96.42.64", 10001));	//서버 아이피 포트해서 요청함.
		System.out.println("[서버에 연결되었습니다.]");
		
		
		//메세지 보내기용 스트림	(클라이언트에서 서버로 보냄)
		OutputStream os = socket.getOutputStream();	//아웃풋 조상이 같음.
		// 기존 아웃풋 스트림 사용법
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		//메세지 받기용 스트림	(서버에서 클라이언트로 받음)
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//키보드 입력 스캐너
		//Scanner sc = new Scanner(System.in);
	
		//스캐너-스트림 이용해서 만들기
		InputStream in = System.in;
		InputStreamReader sisr = new InputStreamReader(in);
		BufferedReader sbr = new BufferedReader(sisr);
		
		
		
		//반복시켜주자
		while (true) {
		
			//메세지 보내기.
			//보내는 메세지 키보드 입력	
			//String str = sc.nextLine();	//내부적으로 값이 들어오면 new String("안녕"); 이런식으로 생성됨.
			
			
			String str = sbr.readLine();
			if("/q".equals(str)) {	//이런식으로 사용하면 null포인트 해결할수 있음.좀더 좋은 코드임.
				System.out.println("[접속 종료되었습니다.]");
				break;
			}
				
			//보내기
			bw.write(str);
			bw.newLine();
			bw.flush();
			

			//메세지 받기
			String reMsg = br.readLine();		
			System.out.println("server: [" + reMsg + "]");
		}

		
		System.out.println("<클라이언트 종료>");
		
		
		
		sbr.close();
		//sc.close();
		socket.close();
		*/
		
		
		//스캐너-스트림 이용해서 만들기
		//다른 컴퓨터에서 작동할 애 --> 유저
		Socket socket = new Socket();	//서버소켓 말고 유저쪽은 소켓임.
		
		System.out.println("<클라이언트 시작>");
		System.out.println("===================================");
		
		
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("3.36.134.188", 10001));	//서버 아이피 포트해서 요청함.
		System.out.println("[서버에 연결되었습니다.]");
		
		
		//메세지 보내기용 스트림	(클라이언트에서 서버로 보냄)
		OutputStream os = socket.getOutputStream();	//아웃풋 조상이 같음.
		// 기존 아웃풋 스트림 사용법
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);

		//메세지 받기용 스트림	(서버에서 클라이언트로 받음)
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//키보드 입력 스캐너
		//Scanner sc = new Scanner(System.in);
	
		//스캐너-스트림 이용해서 만들기
		InputStream in = System.in;
		InputStreamReader sisr = new InputStreamReader(in);
		BufferedReader sbr = new BufferedReader(sisr);
		
				
				
		//반복시켜주자
		while (true) {
		
			//메세지 보내기.
			//보내는 메세지 키보드 입력	
			//String str = sc.nextLine();	//내부적으로 값이 들어오면 new String("안녕"); 이런식으로 생성됨.
			
			
			String str = sbr.readLine();
			if("/q".equals(str)) {	//이런식으로 사용하면 null포인트 해결할수 있음.좀더 좋은 코드임.
				System.out.println("[접속 종료되었습니다.]");
				break;
			}
				
			//보내기
			bw.write("(박진영)" + str);
			bw.newLine();
			bw.flush();
			

			//메세지 받기
			String reMsg = br.readLine();		
			System.out.println("server: [" + reMsg + "]");
		}

		//출력하는거 스트림으로 만들기
		OutputStream out = System.out;
		OutputStreamWriter sosw = new OutputStreamWriter(out);
		BufferedWriter sbw = new BufferedWriter(sosw);
		
		sbw.write("<클라이언트 종료>");
		sbw.newLine();
		sbw.flush();
		//System.out.println("<클라이언트 종료>");	<-- 이거 만든거임.
		
		
		
		sbr.close();
		//sc.close();
		socket.close();
	}

}
