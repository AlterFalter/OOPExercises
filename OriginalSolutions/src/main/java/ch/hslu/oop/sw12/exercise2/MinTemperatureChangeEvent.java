/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw12.exercise2;

/**
 *
 * @author yannk
 */
public class MinTemperatureChangeEvent extends TemperatureHistoryEvent {
    public MinTemperatureChangeEvent(Object source, float newValue) {
        super(source, newValue);
    }
}
