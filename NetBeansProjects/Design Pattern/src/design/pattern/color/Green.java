/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.color;

import design.pattern.Color;

/**
 *
 * @author saint
 */
public class Green implements Color{

    public Green() {
    }
    

    @Override
    public void fill() {
        System.out.println("Green");
    }
    
}
