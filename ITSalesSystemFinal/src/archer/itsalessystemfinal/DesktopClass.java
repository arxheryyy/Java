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
public class DesktopClass extends ComputerClass {
    String monitor;
    
    public DesktopClass(){
        super();
        this.monitor = "Unknown";
    }

    /**
     *
     */
    @Override
    public void displaySpec() {
        super.displaySpec();

        System.out.println("Monitor Type:" + this.monitor);
    }
    public static boolean checkDesktopID(String inputID, List<DesktopClass> allDesktops){
    boolean isfound = false;
    for (int i=0;i<=allDesktops.size()-1;i++){
        if (inputID.equals(allDesktops.get(i).computerID)) {
            isfound = true;
            break;
        } 
    }
    return isfound;
}
}
