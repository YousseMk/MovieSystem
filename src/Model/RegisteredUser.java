package Model;

import Controllers.LoginController;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisteredUser extends User {
    private Account account;
    private int memberid;

    public RegisteredUser(String name, String email, String address, Account a, int memberid){
        super(name, email, address);
        this.account = a;
        this.memberid = memberid;
    }

    public void login(){

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }
}
