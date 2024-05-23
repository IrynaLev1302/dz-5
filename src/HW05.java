import com.sun.deploy.security.SelectableSecurityManager;

public class HW05 {
    public static void main(String[] args) {
        int num01 = 4;
        int num02 = 8;
        int num03 = 2;
        int num04 = 7;
        int sum01 = num01+num02;
        int sum02 = num03+num04;
        if (sum01>sum02){
            System.out.println("true");
        }

        int ink01 = ++sum01;
        System.out.println(ink01);
        int ink02 = sum02-2;
        System.out.println(ink02);
        if (ink01>ink02){
            System.out.println("true");
        }
        if (ink01%2==0 || ink02%2==0){
            System.out.println("true");

        } else {
            System.out.println("False");
        }





    }

}
