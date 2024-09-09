import java.util.Scanner;

public class Login{
    public boolean yoxlama(Hesab hesab){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Istifadeci adi : ");
        String istifadeci_adi= scanner.nextLine();
        System.out.println("Parol : ");
        String parol=scanner.nextLine();

        if (hesab.getIstifadeci_adi().equals(istifadeci_adi) && hesab.getParol().equals(parol)){
            return true;
        }
        else {
            return false;
        }
    }
}
