/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dio.desafio.design.pattern.factory;

/**
 *
 * @author izabe
 */
public class PolygonFactory {
    public static Polygon createPolygon(int numberOfSides){
        if (numberOfSides == 3){
            return new Triangle();
        }else if (numberOfSides == 4){
            return new Square();
        }else if (numberOfSides == 5){
            return new Square();
        }
        return null;
    }
         
}
