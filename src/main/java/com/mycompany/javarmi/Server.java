/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.javarmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Server implements Calculadora{
    public Server(){}
    
    @Override
    public float add(float value1, float value2){
        return value1 + value2;
    }

    @Override
    public float sub(float value1, float value2){
        return value1 - value2;
    }

    @Override
    public float mul(float value1, float value2){
        return value1 * value2;
    }

    @Override
    public float div(float value1, float value2){
        return value1 / value2;
    }
    public static void main(String[] args) {
        Server obj = new Server();
        try{
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(obj, 0);            
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("stringue", stub);
            
            System.err.println("Server ready");
        }            
        catch (AlreadyBoundException | RemoteException e){
            System.err.println("Server Exception: " + e.getMessage());
            //e.printStackTrace();
        }               
            new Scanner(System.in).nextInt();
    }    
    
}
