package com.example.minggu_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.minggu_1.model.konta_new;

import java.util.ArrayList;

public class SqliteDatabase extends SQLiteOpenHelper {

    private	static final int DATABASE_VERSION =	5;
    private	static final String	DATABASE_NAME = "contact";
    private	static final String TABLE_CONTACTS = "contacts";

    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_NAME = "contactname";
    private static final String COLUMN_NO = "phno";

    public SqliteDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String	CREATE_CONTACTS_TABLE = "CREATE	TABLE " + TABLE_CONTACTS + "(" + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_NAME + " TEXT," + COLUMN_NO + " INTEGER" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
        onCreate(db);
    }

    public ArrayList<konta_new> listContacts(){
        String sql = "select * from " + TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList<konta_new> storeContacts = new ArrayList<>();
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do{
                int id = Integer.parseInt(cursor.getString(0));
                String name = cursor.getString(1);
                String phno = cursor.getString(2);
                storeContacts.add(new konta_new(id, name, phno));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return storeContacts;
    }

    public void addContacts(konta_new contacts){
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, contacts.getName());
        values.put(COLUMN_NO, contacts.getPhno());
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(TABLE_CONTACTS, null, values);
    }

    public void updateContacts(konta_new contacts){
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, contacts.getName());
        values.put(COLUMN_NO, contacts.getPhno());
        SQLiteDatabase db = this.getWritableDatabase();
        db.update(TABLE_CONTACTS, values, COLUMN_ID	+ "	= ?", new String[] { String.valueOf(contacts.getId())});
    }

    public konta_new findContacts(String name){
        String query = "Select * FROM "	+ TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " = " + "name";
        SQLiteDatabase db = this.getWritableDatabase();
        konta_new contacts = null;
        Cursor cursor = db.rawQuery(query,	null);
        if	(cursor.moveToFirst()){
            int id = Integer.parseInt(cursor.getString(0));
            String contactsName = cursor.getString(1);
            String contactsNo = cursor.getString(2);
            contacts = new konta_new(id, contactsName, contactsNo);
        }
        cursor.close();
        return contacts;
    }

    public void deleteContact(int id){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_CONTACTS, COLUMN_ID	+ "	= ?", new String[] { String.valueOf(id)});
    }

}
