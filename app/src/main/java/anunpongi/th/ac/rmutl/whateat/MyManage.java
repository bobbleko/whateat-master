package anunpongi.th.ac.rmutl.whateat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MyManage {
    private Context context;
    private SQLiteDatabase sqLiteDatabase;

    public MyManage(Context context) {
        this.context = context;
        MyOpenHelper myOpenHelper = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();

    }

    public long addValueToSQLite(String nameString,
                                 String suranmeString,
                                 String genderString,
                                 String ageString,
                                 String statureString,
                                 String weight,
                                 String active) {


        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", nameString);
        contentValues.put("Surname", suranmeString);
        contentValues.put("Gender", genderString);
        contentValues.put("Age", ageString);
        contentValues.put("Stature", statureString);
        contentValues.put("Weight", weight);
        contentValues.put("Active", active);

        return sqLiteDatabase.insert("userTABER", null, contentValues);
    }

    public long deleteUser() {
        return sqLiteDatabase.delete("userTABER", "1", null);
    }

    public long deleteFoods() {
        return sqLiteDatabase.delete("food", "1", null);
    }

    public ArrayList<Long> addMenuToSQLite(ArrayList<FoodMenu> foodMenus) {
        ArrayList<Long> result = new ArrayList<>();
        for (FoodMenu f : foodMenus) {
            result.add(addFood(f));
        }
        return result;
    }

    public long addFood(FoodMenu foodMenu) {
        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", foodMenu.name);
        contentValues.put("Energy", foodMenu.energy);
        contentValues.put("Date", date);
        return sqLiteDatabase.insert("food", null, contentValues);
    }

    public long deleteFood(FoodMenu foodMenu) {
        return sqLiteDatabase.delete("food", "ID =" + foodMenu.id, null);
    }

    public ArrayList<String> getAllDate() {
        ArrayList<String> result = new ArrayList<>();

        Cursor cursor = sqLiteDatabase.rawQuery("SELECT DISTINCT Date FROM food", null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            result.add(cursor.getString(0));
            cursor.moveToNext();
        }

        return result;
    }

    public ArrayList<FoodMenu> getFoodByDate(String date) {
        ArrayList<FoodMenu> result = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM food WHERE Date = '" + date+"'", null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            result.add(new FoodMenu(Integer.parseInt(cursor.getString(cursor.getColumnIndex("ID"))), cursor.getString(cursor.getColumnIndex("Name")), Integer.parseInt(cursor.getString(cursor.getColumnIndex("Energy"))), date));
            cursor.moveToNext();
        }

        return result;
    }

}
