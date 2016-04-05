/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snafu;

import environment.ApplicationStarter;

/**
 *
 * @author Alex Parks
 */
public class Snafu {
//    
//    Things to do (ordered in most important to least important):
//    Angles/diagonal movement
//    Remove the tail on death
//    Powerups:
//        Change the size of the field
//        Remove someones tail
//    Make a scoring system:
//        Time
//        Somekind of item
//        Killing another player
//    Make it playable over the network?
//        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationStarter.run("Snafu", new Arena());
    }
    
}
