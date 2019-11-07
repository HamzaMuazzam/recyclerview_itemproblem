package com.example.new_recyclerview;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    SQLiteDatabase  sqLiteDatabase;


public static final String DATABASE_NAME="mydatabase";
public static final int DATABASE_VERSION=1;

public static final String TAG="mytag";
public static final String TABLE_NAME="my_table";
public static final String COL_ID="id";
public static final String COL_NAME="name";
public static final String COL_AGE="age";
public static final String COL_DETAILS="details";


public static final String CREATE_TABLE=
        "CREATE TABLE "+ TABLE_NAME + " (" +
        COL_ID + " INTEGER PRIMARY KEY," +
                COL_NAME + " TEXT," +
                COL_AGE + " TEXT," +
                COL_DETAILS + " TEXT);";



    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public boolean insertnewdata(String str_name, String str_age, String str_details) {
        sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, str_name);
        contentValues.put(COL_AGE, str_age);
        contentValues.put(COL_DETAILS, str_details);
        long insert = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        if (insert == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Cursor getAllData() {
        sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return cursor;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Log.d(TAG, "onCreate: Data base created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
