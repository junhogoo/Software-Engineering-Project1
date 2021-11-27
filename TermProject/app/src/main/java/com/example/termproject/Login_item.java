package com.example.termproject;

import java.io.Serializable;

public class Login_item implements Serializable {
    String ID;
    String PWD;
    String NICKNAME;
    int POWER; // 1 : 유저  ,  2 : 관리자


    public Login_item(String ID, String PWD, String NICKNAME, int POWER) {
        this.ID = ID;
        this.PWD = PWD;
        this.NICKNAME = NICKNAME;
        this.POWER = POWER;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getNICKNAME() {
        return NICKNAME;
    }

    public void setNICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME;
    }

    public int getPOWER() {
        return POWER;
    }

    public void setPOWER(int POWER) {
        this.POWER = POWER;
    }
}
