/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleroutingprotocol;

public class SimpleRoutingProtocol {
    
    public static void main(String[] args) {
        RoutingProtocol routingProtocol = new RoutingProtocol(3);

        Packet packet1 = new Packet("Hello, Packet 1".getBytes());
        Packet packet2 = new Packet("Hello, Packet 2".getBytes());
        Packet packet3 = new Packet("Hello, Packet 3".getBytes());
        Packet packet4 = new Packet("Hello, Packet 4".getBytes()); 

        routingProtocol.receive(packet1);
        routingProtocol.receive(packet2);
        routingProtocol.receive(packet3);
        routingProtocol.receive(packet4); 

        routingProtocol.forward();
        routingProtocol.forward();
        routingProtocol.forward();
        routingProtocol.forward(); 
    }
    
}
