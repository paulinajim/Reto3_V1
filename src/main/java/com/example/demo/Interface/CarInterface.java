/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Car;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Acer
 */
public interface CarInterface extends CrudRepository <Car, Integer> {
    
    
}
