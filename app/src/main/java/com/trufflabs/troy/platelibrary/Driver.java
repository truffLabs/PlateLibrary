package com.trufflabs.troy.platelibrary;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * Simple data structure for Driver data.
 * @author Troy
 * @version 12/22/15.
 */

public class Driver {

    private String myLicence;
    private String myName;
    public Driver(String theLicence, String theName){
        myLicence = theLicence;
        myName = theName;
        //TODO
        //add in other things like make/model, year, color...
    }


    public String getName() {
        return myName;
    }

    public String getLicence(){
        return myLicence;
    }

    public String toString() {
        return myLicence + " -  " + myName;
    }
}