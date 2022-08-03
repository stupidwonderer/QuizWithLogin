import java.util.HashMap;
public class IdandPasswords {
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    IdandPasswords(){
    	
        loginInfo.put("Shivanshu","8000");
        loginInfo.put("Shital","9000");
        loginInfo.put("Anjali","7000");
        
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}