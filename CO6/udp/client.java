import java.util.*;
import java.io.*;
import java.net.*;
public class client{
public static void main(String[] args) throws IOException {
DatagramSocket client=new DatagramSocket();
InetAddress add=InetAddress.getByName("localhost");
Scanner sc=new Scanner(System.in);
System.out.println("Message server:");
String str=sc.next();

byte[] bufBytes=str.getBytes();
DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,4220);
client.send(datagramPacket);
client.close();
}
}
	