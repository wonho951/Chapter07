package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		
		//스레드 + 소켓통신 (소켓반복생성,다중접속?)
		
		ServerSocket serverSocket = new ServerSocket();	
		serverSocket.bind(new InetSocketAddress("183.96.42.64", 10001));
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		//*반복구간
		while(true) {		
			Socket socket = serverSocket.accept();	
			System.out.println("클라이언트가 연결 되었습니다.");
			
			//출장 --> 세팅한 후 + 메세지 주고받기.
			Thread thread = new ServerThread();
			thread.start();
		}
		
		
		
		//메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		
		//*Thread run()에서 코딩이 되는애 ***********************
		//메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
				
		//메세지 주고받기
		while(true) {
			//메세지받기
			String msg = br.readLine();
			
			
			if(msg == null) {	
				System.out.println("[클라이언트 접속 종료]");
				break;
			}
			
			System.out.println("받은 메세지:" + msg);
			
			//메세지 보내기
			bw.write(msg);	
			bw.newLine();
			bw.flush();	
		}
		//*Thread run()에서 코딩이 되는애 ***********************
		

		
		System.out.println("==============================");
		System.out.println("<서버종료>");
		
		socket.close();
		serverSocket.close();
		
		

	}

}
