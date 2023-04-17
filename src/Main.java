import entity.Account;
import view.MenuMain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accountArrayList =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        MenuMain menuMain=new MenuMain();
        menuMain.Menu(sc,accountArrayList);
    }
}