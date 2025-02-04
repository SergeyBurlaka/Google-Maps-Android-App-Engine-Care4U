package com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.manager.employee.data;

import com.quest.uni2b.appengine.gsm.demo.usertouserdemo2svn020316.gcm.constants.MessageConstant;

/**
 * Created by Operator on 17.05.2016.
 */
public class EmployeeOfM {

    private int statusFriendOrRequest,phoneNumber;
    // The fields associated to the person
    private final String /*userName,*/ userEmail;
    private boolean isSelected = false;
    public int getStatusSpy() {
        return statusSpy;
    }
    private int statusSpy = MessageConstant.NO_SPY;


    public EmployeeOfM(String email, int statusFriendOrRequest, int phoneNumber){
        this.statusFriendOrRequest = statusFriendOrRequest;
        this.phoneNumber = phoneNumber;
        userEmail = email;
    }


    public EmployeeOfM(String email){
        userEmail = email;
    }


    public EmployeeOfM(String email, int statusSpy){
        userEmail = email;
        this.statusSpy = statusSpy;
    }


    public EmployeeOfM(String email, boolean isSelected){
        this.isSelected = isSelected;
        userEmail = email;
    }


    public String getUserEmail() {
        return userEmail;
    }

    // This method allows to get the item associated to a particular id,
    // uniquely generated by the method getId defined below
    // since userName and mPhone combined are surely unique,
    // we don't need to add another id field
    public static enum Field {
        /* NAME,*/ EMAIL
    }

    public String get(Field f) {
        switch (f) {
            case EMAIL: default: return userEmail;
            //case NAME: default: return userName;
        }
    }
    // google cloud message

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}
