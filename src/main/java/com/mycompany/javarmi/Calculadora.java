package com.mycompany.javarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote{
    float add(float value1, float value2) throws RemoteException; 
    float sub(float value1, float value2) throws RemoteException;
    float mul(float value1, float value2) throws RemoteException;
    float div(float value1, float value2) throws RemoteException;
}
