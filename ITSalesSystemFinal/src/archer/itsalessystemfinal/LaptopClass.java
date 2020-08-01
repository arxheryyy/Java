/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archer.itsalessystemfinal;

import java.util.List;

/**
 *
 * @author Archer Chua
 */
public class LaptopClass extends ComputerClass{
    double weight;
    
    public LaptopClass(){
        super();
        this.weight = 0.0;
    }

    /**
     *
     */
    @Override
    public void displaySpec() {
        super.displaySpec();

        System.out.printf("Weight: %.2fKg", this.weight);
    }
    
    public static boolean checkLaptopID(String inputID, List<LaptopClass> allLaptops){
    boolean isfound = false;
    for (int i=0;i<=allLaptops.size()-1;i++){
        if (inputID.equals(allLaptops.get(i).computerID)) {
            isfound = true;
            break;
        } 
    }
    return isfound;
}
}
