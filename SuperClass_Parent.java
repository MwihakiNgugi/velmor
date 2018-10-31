/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dorianrestaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Mwihaki Ngugi
 */
public class SuperClass_Parent {
    public double FishSalad;
    public double BaconCheeseSquare;
      public double BeefSquare;
    public double MixGrillPlatter;
    public double ChickenBurger;
    public double PorkRibs;
    
    public double Sodas;
    public double IceCreamSundae;
    public double Juices;
    public double StillWater;
    public double Smoothies;
    public double Frappes;
    public double MilkShakes;
    
    
    
    
    
     public double Meals;
     public double Drinks;
     public double TotalofMD;
       
     
     
     public double AllTotalofMD;
    
    
    
    public double GetAmount(){
     Meals= FishSalad + BaconCheeseSquare + BeefSquare + MixGrillPlatter + ChickenBurger + PorkRibs;
     Drinks=Sodas + IceCreamSundae + Juices + StillWater + Smoothies + Frappes + MilkShakes;
     TotalofMD =Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    private JFrame frame;
    
    public void iExitSystem(){
        frame=new JFrame("Exit"); 
     if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Dorian Restaurant",
      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
         System.exit(0);
     }
    }
     
      //*******************************Price****************************
    public double pFishSalad =7.00;
    public double pBaconCheeseSquare=3.95;
    public double pBeefSquare=10.05;
    public double pMixGrillPlatter=10.65;
    public double pChickenBurger=6.75;
    public double pPorkRibs=4.75;
    
    public double pSodas=7.80;
    public double pIceCreamSundae=9.80;
    public double pJuices=5.65;
    public double pStillWater=5.0;
    public double pSmoothies=7.0;
    public double pFrappes=8.75;
    public double pMilkShakes=9.0;
     
    //*******************************Price***********************************
     
    public double mcTax=0.90;
    
    public  Double cFindTax{double cAmount}
    {
      
        double FindTax= cAmount- (cAmount*mcTax);
        return FindTax;
    }
}

