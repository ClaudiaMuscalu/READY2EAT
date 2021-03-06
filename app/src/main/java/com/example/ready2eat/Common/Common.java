package com.example.ready2eat.Common;

import com.example.ready2eat.Model.Request;
import com.example.ready2eat.Model.User;

import java.util.Objects;

public class Common
{
    public static User currentUser; // variables that saves the current user
    public static Request currentRequest;
    public static final String UPDATE = "Actualizeaza";
    public static final String DELETE = "Sterge";
    public static final String USER_KEY = "User";
    public static final String PWD_KEY = "Password";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String status)
    {
        if(Objects.equals(status, new String("0")))
            return "Plasata";
        else if(Objects.equals(status, new String("1")))
            return "Se poate prelua";
        else
            return "Preluata";
    }

}
