/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatapplication;

/**
 *
 * @author Samsa
 */
public class ChatApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client c =new Client();
        Server s =new Server();
        c.setVisible(true);
        s.setVisible(true);
    }
    
}
