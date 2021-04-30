
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author gersc
 */
public class Main extends JFrame {
        public Main() {


            /// \ref T7_1 Popup will ask users to choose the number of players
            int playerChoice = getNumberOfPlayers();
            
            if(playerChoice == 1) {
                startOnePlayer();
            }
            else {
                startTwoPlayer();
            }
            
        }

        public void startOnePlayer() {
            System.out.println("TODO");
            }
        

        public void startTwoPlayer() {

            try {
                this.add( new Board());
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            //this.setSize(10000,10000);
            this.pack();
            this.setResizable(false);
            this.setTitle( "CHESS" );
            this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            this.setLocationRelativeTo( null );
        }
        
        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                Main main = new Main();
                main.setVisible(true);
            });
            
        }
        
}
