    /*
 * To change this license header, choose License Headers in Project Properties.e
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snafu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Alex Parks
 */
public class Tron {
    
    //to do:
    //body, location, cell size, movement speed, color of the tron.
    private Color bodycolor;
    private ArrayList<Point> body;
    private CellDataProviderIntf cellData;
    public static int headPosition=0;
    
    
    public Point getHead(){
        return body.get (headPosition);
  
    }
    
    public ArrayList<Point> getBody(){
        return body;
    }
    
    public void setBody(ArrayList<Point> body) {
        this.body = body;
    }
    
    public ArrayList<Point> getBodyCopy(){
        return (ArrayList<Point>) body.clone();
    }
    
    
}
