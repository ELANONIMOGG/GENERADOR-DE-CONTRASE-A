import java.until.scanner;
import java.security.secureramdom;

public class passGenV001a {
    public static void main (string[] args){
        scanner myImput = new scanner (system.in);
        secureRamdom myramdom = new secureRamdom();
        
        string [] CharDB = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k","l","m","n","o","p","q","r","s","t","u","v","w",
        "x","y","z","A","B","C","D","E","F","G","H","I","J",
        "K","L","M","N","O","P","Q","R","S","T","U","V","W",
        "X","Y","Z","*","/","+","-","#","$","%","&","=","?",
        "O","1","2","3","4","5","6","7","8","9"};
        
    
        system.out.printin("Ingrese el numero de caracteres de su contraseña");
        int pSize = myImput.nextInt();
        String[] mypassword = new String [pSize];

        system.out.printin("Su contraseña es: ");

        for (int i = 0; i < myPassword.length; i++) {
            int k = myramdom.nextint(CharDB.length);
            mypassword[i] = charDB[k];
            
            system.out.printin(mypassword[i]);
        }
        system.out.printin();
       
    }

}