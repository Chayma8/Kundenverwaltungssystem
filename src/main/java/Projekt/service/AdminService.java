package Projekt.service;

import java.util.List;

public class AdminService {
    public boolean login(String username, String password) {
        List<String> list = IOFile.getFileContent("admin.txt");
        for(int i=0; i<list.size(); i++) {
            String [] admin = list.get(i).split(";");
            if(admin.length == 2) {
                if(admin[0].equals(username) && admin[1].equals(password)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
//Chayma;chayma