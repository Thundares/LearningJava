/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenzo
 */
public class MyClass extends Thread {
    public void run(){
        System.out.println("Testando");
    }
    
    public static void main(String[] args){
        MyClass thread = new MyClass();
        thread.start();
    }
}
