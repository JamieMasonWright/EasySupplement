package uk.co.jmwdesigns.easysupplement;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static java.sql.Types.INTEGER;

public class EasySupplementDataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "easySuplement";// name of the database

    private static final int DB_VERSION = 1;

    EasySupplementDataBaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE SUPPLEMENT(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "RECOMMENDED_USE TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER) ;");
        insertSupplement(db, "Whey proten", "Whey Protein", R.drawable.protein_home_pic, "This is the use");
        insertSupplement(db, "Soy Protein", "Soy proten Description" , R.drawable.protein_home_pic, "This is the use");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }

    private static void insertSupplement(SQLiteDatabase db, String name, String description, int resourceId, String recommendedUse){
        ContentValues supplementValues = new ContentValues();
        supplementValues.put("NAME", name);
        supplementValues.put("DESCRIPTION", description);
        supplementValues.put("IMAGE_RESOURCE_ID", resourceId);
        supplementValues.put("RECOMMENDED_USE", recommendedUse);
        db.insert("SUPPLEMENT", null, supplementValues);

    }
}
