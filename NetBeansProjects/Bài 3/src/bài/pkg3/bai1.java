/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;


/**
 *
 * @author ngqph
 */
public class bai1 {
    public static void change( int a ){
        a = 12;
    }
    public static void main(String[] args) {
        Integer a = new Integer(10);
        change(a);
        System.out.println(a);
    }
}