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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationStarter.run("Snafu", new Arena());
    }
    
}