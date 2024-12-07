/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleroutingprotocol;

public class Packet {
    byte[] message;

    public Packet(byte[] message) {
        this.message = message;
    }
    
    public byte[] getMessage(){
        return message;
    }
    
}
