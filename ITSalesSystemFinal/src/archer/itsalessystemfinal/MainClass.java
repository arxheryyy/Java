/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archer.itsalessystemfinal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Archer Chua
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(Scanner myScanner = new Scanner(System.in))
        {
            int iInput = 0;
            String inputID;

            List<DesktopClass> allDesktops = new ArrayList<>();
            List<LaptopClass> allLaptops = new ArrayList<>();
            
            DesktopClass permanentDesktop0 = new DesktopClass();
            permanentDesktop0.computerID = "D001";
            permanentDesktop0.cpuSpeed = 3.2;
            permanentDesktop0.ram = 512;
            permanentDesktop0.harddisk = 80;
            permanentDesktop0.monitor = "CRT";
            permanentDesktop0.price = 999;
            allDesktops.add(permanentDesktop0);

            DesktopClass permanentDesktop1 = new DesktopClass();
            permanentDesktop1.computerID = "D002";
            permanentDesktop1.cpuSpeed = 2.4;
            permanentDesktop1.ram = 1000;
            permanentDesktop1.harddisk = 80;
            permanentDesktop1.monitor = "LCD";
            permanentDesktop1.price = 1999;
            allDesktops.add(permanentDesktop1);

            LaptopClass permanentLaptop0 = new LaptopClass();
            permanentLaptop0.computerID = "L001";
            permanentLaptop0.cpuSpeed = 1;
            permanentLaptop0.ram = 512;
            permanentLaptop0.harddisk = 40;
            permanentLaptop0.weight = 4.8;
            permanentLaptop0.price = 899;
            allLaptops.add(permanentLaptop0);

            LaptopClass permanentLaptop1 = new LaptopClass();
            permanentLaptop1.computerID = "L002";
            permanentLaptop1.cpuSpeed = 1.4;
            permanentLaptop1.ram = 512;
            permanentLaptop1.harddisk = 20;
            permanentLaptop1.weight = 3.2;
            permanentLaptop1.price = 2899;
            allLaptops.add(permanentLaptop1);

            double cpuSpeedInput ;
            int ramInput;
            int harddiskInput;
            double weightInput;
            double priceInput;
            boolean error;
            
            while (iInput != 4) {
                System.out.println("*********************** AI ArcherChua Co. *********************** ");
                System.out.println("Computer Menu:");
                System.out.println("1. Add information for new Desktop ");
                System.out.println("2. Add information for new Laptop");
                System.out.println("3. Display all computer information ");
                System.out.println("4. Quit ");
                System.out.println("**************************************************************");

                iInput = myScanner.nextInt();

                switch(iInput) {
                    case 1:

                        System.out.println("Please enter either 1 to 4: 1 ");
                        DesktopClass tempDesktop = new DesktopClass();
                        System.out.println("What is the Computer ID");
                        inputID = myScanner.next();
                        
                        boolean isfound = DesktopClass.checkDesktopID(inputID, allDesktops);
                        boolean notfourchar = fourcharcheck(inputID);
                        boolean pos0isnotd = desktopIDcheck(inputID);
                        while (isfound||notfourchar||pos0isnotd) {
                            System.out.println(
                                    "Sorry the ComputerID you've entered is not valid.");
                           if(isfound){
                               System.out.println("Please enter a computer ID that doesnt exist yet.");
                           }else if (notfourchar){
                               System.out.println("Please enter a computer ID that have 4 characters.");
                           }else if(pos0isnotd){
                               System.out.println("Please enter a computer ID that starts with the character D.");
                           }

                            inputID = myScanner.next();
                            isfound = DesktopClass.checkDesktopID(inputID, allDesktops);
                            notfourchar = fourcharcheck(inputID);
                            pos0isnotd = desktopIDcheck(inputID);

                        } tempDesktop.computerID=inputID; 
                        do{
                            try{
                                System.out.println("What is the Processor Speed");
                                cpuSpeedInput = Double.parseDouble(myScanner.next());
                                tempDesktop.cpuSpeed=cpuSpeedInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a double value for Processor Speed (0.00)");
                                error=true;
                            }                     
                        }while(error);
                        do{
                            try{
                                System.out.println("What is the RAM size (Mb)");
                                ramInput = Integer.parseInt(myScanner.next());
                                tempDesktop.ram=ramInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a Integer value for RAM size (0)");
                                error=true;
                            }
                        }while(error);                        
                        do{
                            try{
                                System.out.println("What is the Harddisk size(Gb)");
                                harddiskInput = Integer.parseInt(myScanner.next());
                                tempDesktop.harddisk=harddiskInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a Integer value for Harddisk size (0)");
                                error=true;
                            }                        
                        }while(error);                       
                        System.out.println("What is the Monitor Type");
                        tempDesktop.monitor = myScanner.next();
                        do{
                            try{
                                System.out.println("What is the Price");
                                priceInput = Double.parseDouble(myScanner.next());
                                tempDesktop.price=priceInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a double value for Price (0.00)");
                                error=true;
                            }
                        }while(error);                        
                        System.out.println("Your information has been added successfully. ");
                        allDesktops.add(tempDesktop);
                        break;
                    case 2:

                        System.out.println("Please enter either 1 to 4: 2 ");
                        LaptopClass tempLaptop = new LaptopClass();
                        System.out.println("What is the Computer ID");
                        inputID = myScanner.next();
                        
                        isfound = LaptopClass.checkLaptopID(inputID, allLaptops);
                        notfourchar = fourcharcheck(inputID);
                        boolean pos0isnotl = desktopIDcheck(inputID);
                        while (isfound||notfourchar||pos0isnotl) {
                            System.out.println(
                                    "Sorry the ComputerID you've entered is not valid.");
                           if(isfound){
                               System.out.println("Please enter a computer ID that doesnt exist yet.");
                           }else if (notfourchar){
                               System.out.println("Please enter a computer ID that have 4 characters.");
                           }else if(pos0isnotl){
                               System.out.println("Please enter a computer ID that starts with the character D.");
                           }

                            inputID = myScanner.next();
                            isfound = DesktopClass.checkDesktopID(inputID, allDesktops);
                            notfourchar = fourcharcheck(inputID);
                            pos0isnotd = desktopIDcheck(inputID);

                        }
                        tempLaptop.computerID=inputID;
                        do{
                            try{
                                System.out.println("What is the Processor Speed");
                                cpuSpeedInput = Double.parseDouble(myScanner.next());
                                tempLaptop.cpuSpeed=cpuSpeedInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a double value for Processor Speed (0.00)");
                                error=true;
                            }                     
                        }while(error);
                        do{
                            try{
                                System.out.println("What is the RAM size (Mb)");
                                ramInput = Integer.parseInt(myScanner.next());
                                tempLaptop.ram=ramInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a Integer value for RAM size (0)");
                                error=true;
                            }
                        }while(error);                        
                        do{
                            try{
                                System.out.println("What is the Harddisk size(Gb)");
                                harddiskInput = Integer.parseInt(myScanner.next());
                                tempLaptop.harddisk=harddiskInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a Integer value for Harddisk size (0)");
                                error=true;
                            }                        
                        }while(error);                       
                        
                        do{
                            try{
                                System.out.println("What is the Weight");
                                weightInput = Double.parseDouble(myScanner.next());
                                tempLaptop.weight=weightInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a double value for Weight (0.00)");
                                error=true;
                            }
                        }while(error);
                        do{
                            try{
                                System.out.println("What is the Price");
                                priceInput = Double.parseDouble(myScanner.next());
                                tempLaptop.price=priceInput;
                                error = false;
                            }catch(Exception e){
                                System.out.println("Please enter a double value for Price (0.00)");
                                error=true;
                            }
                        }while(error);                        
                        System.out.println("Your information has been added successfully. ");
                        allLaptops.add(tempLaptop);
                        
                        break;
                    case 3:
                        System.out.println("Please enter either 1 to 4: 3 ");
                        for (int i = 0; i < allDesktops.size(); i++) {
                            int iCount = i + 1;
                            System.out.println("Desktop" + iCount);
                            allDesktops.get(i).displaySpec();
                            allDesktops.get(i).displayPrice();

                        }
                        for (int i = 0; i < allLaptops.size(); i++) {
                            int iCount = i + 1;
                            System.out.println();
                            System.out.println("Laptop" + iCount);
                            allLaptops.get(i).displaySpec();
                            allLaptops.get(i).displayPrice();
                        }
                        break;
                        
                    case 4 :
                        System.out.println("Please enter either 1 to 4: 4 ");
                        System.exit(0);
                        break;
                        
                    default :
                        System.out.println("Please enter either 1 to 4: INVALID");
                        break;
                        
                    
                    
                }
            
            }
        }
    }
    public static boolean fourcharcheck(String inputID){
    boolean fourchar;
    if (inputID.length()==4){
        fourchar = false;
    }else{
        fourchar = true;
    }
    return fourchar;
}
    public static boolean desktopIDcheck (String inputID){
        boolean pos0isd;
        if(inputID.charAt(0)=='D'){
            pos0isd = false;
        }else{
            pos0isd = true;
        }
        return pos0isd;
    }
    public static boolean laptopIDcheck (String inputID){
        boolean pos0isl;
        if(inputID.charAt(0)=='L'){
            pos0isl = false;
        }else{
            pos0isl = true;
        }
        return pos0isl;
    }
}

