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
		
		/*
		// 소켓 프로그래밍
		ServerSocket serverSocket = new ServerSocket();	//메모리에 올림
		serverSocket.bind(new InetSocketAddress("183.96.42.64", 10001));	//IP 포트번호 /바인딩 세팅함.
		//포트는 항구라고 생각.
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		Socket socket = serverSocket.accept();	//서버랑 클라이언트랑 서로 연결고리임
		//클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
		
		
		System.out.println("클라이언트가 연결 되었습니다.");
		
		
		//메세지 받기용 스트림	(클라이언트에서 서버로 받음)
		InputStream is = socket.getInputStream();	// 주스트림--> 걍 달라고함.(처음 빨대 꽂고)
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");	//중간빨대랑 처음 빨대 연결해줌.
		BufferedReader br = new BufferedReader(isr);	//제일 큰 빨대에 연결해서 공차 먹듯이ㅇㅇ
		
		//메세지 보내기용 스트림	(서버에서 클라이언트로)
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
				
				
				
		//실제 메세지 받기
		String msg = br.readLine();
		System.out.println("받은 메세지:" + msg);
		
		
		
		
		
		//메세지 보내기.
		bw.write(msg);	//쓰는거지 보내는 의미는 아님.
		bw.newLine();
		bw.flush();	//강제로 보냄.
		
		
		
		
		//생략가능.
		//br.close();
		//bw.close();
		socket.close();
		serverSocket.close();// 얘도 닫아줘야함.
		*/
		
		
		
		/*
		//반복문 만들자
		// 소켓 프로그래밍
		ServerSocket serverSocket = new ServerSocket();	//메모리에 올림
		serverSocket.bind(new InetSocketAddress("183.96.42.64", 10001));	//IP 포트번호 /바인딩 세팅함.
		//포트는 항구라고 생각.
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		Socket socket = serverSocket.accept();	//서버랑 클라이언트랑 서로 연결고리임
		//클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
		
		
		System.out.println("클라이언트가 연결 되었습니다.");
		
		
		//메세지 받기용 스트림	(클라이언트에서 서버로 받음)
		InputStream is = socket.getInputStream();	// 주스트림--> 걍 달라고함.(처음 빨대 꽂고)
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");	//중간빨대랑 처음 빨대 연결해줌.
		BufferedReader br = new BufferedReader(isr);	//제일 큰 빨대에 연결해서 공차 먹듯이ㅇㅇ
		
		//메세지 보내기용 스트림	(서버에서 클라이언트로)
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
				
		
		while(true) {
			
			//실제 메세지 받기
			String msg = br.readLine();
			
			
			if(msg == null) {	//null은 주소비교이기 때문에 == 이걸로 함. equals() 안씀.ㅇㅋ?
				System.out.println("[클라이언트 접속 종료]");
				break;
			}
			
			System.out.println("받은 메세지:" + msg);
			
			//메세지 보내기.
			bw.write(msg);	//쓰는거지 보내는 의미는 아님.
			bw.newLine();
			bw.flush();	//강제로 보냄.
		}
				
		System.out.println("==============================");
		System.out.println("<서버종료>");
		
		
		//생략가능.
		//br.close();
		//bw.close();
		socket.close();
		serverSocket.close();// 얘도 닫아줘야함.
		*/
		
		
		//	흉내내기
		// 소켓 프로그래밍
		ServerSocket serverSocket = new ServerSocket();	//메모리에 올림
		serverSocket.bind(new InetSocketAddress("183.96.42.64", 10001));	//IP 포트번호 /바인딩 세팅함.
		//포트는 항구라고 생각.
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		Socket socket = serverSocket.accept();	//서버랑 클라이언트랑 서로 연결고리임
		//클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
		
		
		System.out.println("클라이언트가 연결 되었습니다.");
		
		
		//메세지 받기용 스트림	(클라이언트에서 서버로 받음)
		InputStream is = socket.getInputStream();	// 주스트림--> 걍 달라고함.(처음 빨대 꽂고)
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");	//중간빨대랑 처음 빨대 연결해줌.
		BufferedReader br = new BufferedReader(isr);	//제일 큰 빨대에 연결해서 공차 먹듯이ㅇㅇ
		
		//메세지 보내기용 스트림	(서버에서 클라이언트로)
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
				
		
		while(true) {
			
			//실제 메세지 받기
			String msg = br.readLine();
			
			
			if(msg == null) {	//null은 주소비교이기 때문에 == 이걸로 함. equals() 안씀.ㅇㅋ?
				System.out.println("[클라이언트 접속 종료]");
				break;
			}
			
			System.out.println("받은 메세지:" + msg);
			
			//메세지 보내기.
			bw.write(msg);	//쓰는거지 보내는 의미는 아님.
			bw.newLine();
			bw.flush();	//강제로 보냄.
		}
				
		System.out.println("==============================");
		System.out.println("<서버종료>");
		
		
		//생략가능.
		//br.close();
		//bw.close();
		socket.close();
		serverSocket.close();// 얘도 닫아줘야함.
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		 * ServerSocket serverSocket = new ServerSocket(); serverSocket.(new
		 * InetSocketAddress("192.168.0.133", 10001)); // IP 포트번호
		 * 
		 * System.out.println("<서버시작>");
		 * System.out.println("================================");
		 * System.out.println("[연결을 기다리고 있습니다.]");
		 * 
		 * Socket socket = serverSocket.accept(); // 클라이언트 누군가 오면 어쎕트()안에 new socket이
		 * 만들어져서 socket에 담긴다.
		 * 
		 * System.out.println("클라이언트가 연결 되었습니다.");
		 * 
		 * 
		 * socket.close();
		 * serverSocket.close();//얘도 닫아줘야함.
		 */
	}

}
