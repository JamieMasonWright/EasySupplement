package uk.co.jmwdesigns.easysupplement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EasySupplementDataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "easySuplement";// name of the database

    private static final int DB_VERSION = 1;

    EasySupplementDataBaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);


    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
