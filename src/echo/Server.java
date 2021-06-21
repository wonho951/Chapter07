package echo;

/*
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
		serverSocket.bind(new InetSocketAddress("192.168.0.67", 10001));
		
		System.out.println("<서버시작>");
		System.out.println("==============================");
		System.out.println("연결을 기다리고 있습니다.");
		
		
		//*반복구간
		while(true) {		
			Socket socket = serverSocket.accept();	
			System.out.println("클라이언트가 연결 되었습니다.");
			
			//출장 --> 세팅한 후 + 메세지 주고받기.
			Thread thread = new ServerThread(socket);
			thread.start();
			
			//탈출조건이 있어야 하지만 현재상황에서는 안만들어도 된다.
		}
		

		//*Thread run()에서 코딩이 되는애 ***********************
		

		/*
		System.out.println("==============================");
		System.out.println("<서버종료>");
		
		socket.close();
		serverSocket.close();
		*/
		
	/*
	}

}
*/

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

   public static void main(String[] args) throws IOException {
      
      //반복하지않아도 되는구간(피피티 그림 이해 1번동그라미)
      ServerSocket serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress("192.168.0.67",10001));  //IP 포트번호
      
      System.out.println("<서버시작>");
      System.out.println("================================");
      System.out.println("[연결을 기다리고 있습니다.]");
      
      
      //반복구간************************************************************************
      
      while(true) {
         Socket socket = serverSocket.accept();  
         //클라이언트 누군가 오면 어쎕트()안에 new socket이 만들어져서 socket에 담긴다.
         System.out.println("[클라이언트가 연결되었습니다.]");
         
         //출장-> 세팅 + 메세지 주고받기
         Thread thread = new ServerThread(socket);
         thread.start();
         
         //탈출조건이 있어야하는데 특별히 없기때문에 넣어주지않음
      }
      
      
      
   
   
      
//      System.out.println("=====================================================");
//      System.out.println("<서버 종료>");
      
//      socket.close();
//      serverSocket.close();
      
   }

}
