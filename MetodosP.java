
package com.narvasoft.pitagoras;


public class MetodosP {
    
    public static double catetoAdyacente(double h, double cO){
        
       return  Math.sqrt((h*h)-(cO*cO));
    }
    
    public static double catetoOpuesto(double h, double cA){
        
       return  Math.sqrt((h*h)-(cA*cA));
    }
    
    public static double hipoTenusa(double cA, double cO){
        
       return  Math.sqrt((cA*cA)+(cO*cO));
    }
    
}
