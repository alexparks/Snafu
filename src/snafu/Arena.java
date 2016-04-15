/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snafu;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;




/**
 *
 * @author Alex Parks
 */
class Arena extends Environment implements CellDataProviderIntf {
    
    private Grid grid;

    public Arena() {
        
        this.grid = new Grid(45, 25, 50, 50, new Point(100, 100), Color.BLACK);
        // change bacckground color
        this.setBackground(Color.CYAN);
    }
    

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
        if (grid != null) {
            grid.paintComponent(graphics);
        }
        

    }

    //<editor-fold defaultstate="collapsed" desc="CellDataProviderIntf">
    @Override
    public int getCellWidth() {
        return grid.getCellWidth();
    }
    
    @Override
    public int getCellHeight() {
        return grid.getCellHeight();
    }
    
    @Override
    public int getCellLocationX(int column, int row) {
        return grid.getCellSystemCoordinate(column, row).x;
    }
    
    @Override
    public int getCellLocationY(int column, int row) {
        return grid.getCellSystemCoordinate(column, row).y;
    }
//</editor-fold>
    
}
