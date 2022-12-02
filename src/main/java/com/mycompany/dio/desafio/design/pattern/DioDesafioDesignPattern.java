/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dio.desafio.design.pattern;

import com.mycompany.dio.desafio.design.pattern.factory.Polygon;
import com.mycompany.dio.desafio.design.pattern.factory.PolygonFactory;

/**
 *
 *
 */
public class DioDesafioDesignPattern {

    public static void main(String[] args) {
        
        Polygon triangle = PolygonFactory.createPolygon(3);
        System.out.println(triangle.getDescription());
        
        Polygon square = PolygonFactory.createPolygon(4);
        System.out.println(square.getDescription());
        
        Polygon pentagon = PolygonFactory.createPolygon(5);
        System.out.println(pentagon.getDescription());
    }
}
