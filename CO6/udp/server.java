import java.io.*;
import java.net.*;
public class server{
public static void main(String[] args) throws IOException {
DatagramSocket server=new DatagramSocket(4220);
//InetAddress add=InetAddress.getByName("localhost");
//String str="Ping from Client!!!";
byte[] buf=new byte[256];
DatagramPacket packet=new DatagramPacket(buf,buf.length);
server.receive(packet);
String response=new String(packet.getData());
System.out.println("Server:"+response);
server.close();
}
}
	