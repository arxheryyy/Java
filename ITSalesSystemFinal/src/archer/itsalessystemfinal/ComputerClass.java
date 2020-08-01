/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archer.itsalessystemfinal;

/**
 *
 * @author Archer Chua
 */
public class ComputerClass {
       String computerID;
    double cpuSpeed;
    double ram;
    double harddisk;
    double price;
    
    //Default Constructor
    public ComputerClass(){
        this.computerID = "";
        this.cpuSpeed = 0.0;
        this.ram = 0;
        this.harddisk = 0;
        this.price = 0.0;
    }

    public void displaySpec() {
        System.out.println("ComputerID:" + this.computerID);
        System.out.println("Processor Speed:" + this.cpuSpeed + "GHz");
        if (this.ram >= 1000) {
            System.out.println("RAM:" + this.ram / 1000 + "Gb");
        } else {
            System.out.println("RAM:" + this.ram + "Mb");
        }

        if (this.harddisk >= 1000) {
            System.out.println("Harddisk:" + this.harddisk / 1000 + "Tb");
        } else {
            System.out.println("Harddisk:" + this.harddisk + "Gb");
        }
        
    }
    public void displayPrice(){
        System.out.println("");
        System.out.printf("Price :  $%.2f",this.price);
        System.out.println("");
    } 
}
