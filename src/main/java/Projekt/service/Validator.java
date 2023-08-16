package Projekt.service;

public class Validator {
    public static boolean isEmail(String email) {
        char [] chars = email.toCharArray();
        int p1=0, p2=0;
        
        for (int i = 0; i < chars.length; i++) {
            if((int) chars[i] == (int )'@') {
                p1=i;
            }
            
            if((int) chars[i] == (int )'.') {
                p2=i;
            }
        }
        
        
        if(p1 == 0 || p1 >= p2 || (p2-1) == p1) {
            return false;
        }
        
        
        return true;
    }
    
    public static boolean isNumber(String in) {
        char [] chars = in.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if((int)chars[i] > (int) '9' || (int)chars[i] < (int) '0') {
                return false;
            }
        }
        
        return true;
    }

    
}
