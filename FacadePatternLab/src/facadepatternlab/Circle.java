/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FacadePatternLab;

/**
 *
 * @author Bilal computer
 */
public class Circle implements Shape {
    @Override
    public void draw(String... args) {
        StringBuilder sb = new StringBuilder("Circle::draw()");
        for (String arg : args) {
            sb.append(" ").append(arg);
        }
        System.out.println(sb);
    }
}
