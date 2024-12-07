/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleroutingprotocol;


import java.util.LinkedList;
import java.util.Queue;



class RoutingProtocol {
    private ProtocolStateEnum protocolState;
    private PacketQueue packetQueue;

    
    public RoutingProtocol(int maxQueueLength) {
        this.protocolState = ProtocolStateEnum.STATE_IDLE;
        this.packetQueue = new PacketQueue(maxQueueLength);
    }

    public void receive(Packet p) {
        System.out.println("Receiving packet...");
        protocolState = ProtocolStateEnum.STATE_ON_RECEIVE;
        boolean added = packetQueue.enqueue(p);
        if (added) {
            System.out.println("Packet received and added to the queue.");
        } else {
            System.out.println("Queue is full. Packet dropped.");
        }
        protocolState = ProtocolStateEnum.STATE_IDLE;
    }

    public void forward() {
        System.out.println("Forwarding packet...");
        protocolState = ProtocolStateEnum.STATE_ON_FORWARD;
        Packet packet = packetQueue.dequeue();
        if (packet != null) {
            System.out.println("Forwarded message: " + new String(packet.getMessage()));
        } else {
            System.out.println("Queue is empty. No packets to forward.");
        }
        protocolState = ProtocolStateEnum.STATE_IDLE;
    }
}

