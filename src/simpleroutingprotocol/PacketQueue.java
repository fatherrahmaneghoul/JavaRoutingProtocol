/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleroutingprotocol;

import java.util.LinkedList;
import java.util.Queue;


public class PacketQueue {
    private Queue<Packet> PacketQueue;
    private int maxQueueLength;
    private int queueLength;

    public PacketQueue(int maxQueueLength) {
        this.PacketQueue = new LinkedList<>();
        this.maxQueueLength = maxQueueLength;
        this.queueLength=0;
    }
    public boolean enqueue(Packet p){
        if (queueLength<maxQueueLength) {
            PacketQueue.add(p);
            queueLength++;
            return true;
        }
        return false;
    }
    public Packet dequeue(){
        if (queueLength>0) {
            queueLength--;
            return PacketQueue.poll();
        }
        return null;
    }
    
    
}
