/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.shape;

import design.pattern.Shape;

/**
 *
 * @author saint
 */
public class Rectangle implements Shape{

    public Rectangle() {
        
    }

    @Override
    public void Draw() {
        System.out.println("Rectangle");
    }

 
    
}
