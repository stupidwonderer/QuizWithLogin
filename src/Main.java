
public class Main {
	
	
    public static void main(String[] args){
        IdandPasswords idandPasswords= new IdandPasswords();
    
        LoginPage loginpage= new LoginPage(idandPasswords.getLoginInfo());
    }
}
