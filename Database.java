package com.database;



import com.model.User;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper
{
	private static final int DATABASE_VERSION=1;

	private static final String DATABASE_NAME="AEM";

	private static final String TABLE_USER="UserReg";
	private static final String DAS_ID="DAS_ID";
	private static final String USER_NAME="USER_NAME";
	private static final String PASSWORD="PASSWORD";
	private static final String MOBILE_NO="MOBILE_NO";
	private static final String EMAIL_ID="EMAIL_ID";
	private static final String DOB="DOB";
	private static final String ORG_UNIT="ORG_UNIT";
	private static final String BASE_LOC="BASE_LOC";

	private static final String TABLE_TASK="UserTask";
	private static final String TASK_ID="TASK_ID";
	private static final String TASK_NAME="TASK_NAME";
	private static final String ASSIGNED_BY="ASSIGNED_BY";
	private static final String ASSIGNEE_NAME="ASSIGNEE_NAME";
	private static final String START_DATE="START_DATE";
	private static final String END_DATE="END_DATE";
	private static final String DES="DES";
	private static final String STATUS="STATUS";
	private static final String USER_COMMENT="USER_COMMENT";






	public Database(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("drop table if exists "+TABLE_USER);
		
		String user = "CREATE TABLE " + TABLE_USER + "(" +DAS_ID  + " TEXT,"+ USER_NAME +  " TEXT," + PASSWORD + " TEXT," + MOBILE_NO + " TEXT,"
				+ EMAIL_ID  + " TEXT," + DOB + " DATE," + ORG_UNIT + " TEXT," + BASE_LOC + " TEXT," +")";
		db.execSQL(user);
		
		/*db.execSQL("drop table if exists "+ TABLE_TASK);
		
		String task = "CREATE TABLE " + TABLE_USER + "("+TASK_ID  + " TEXT," + DAS_ID  + " TEXT,"+ TASK_NAME +  " TEXT," + ASSIGNED_BY + " TEXT," + ASSIGNEE_NAME + " TEXT,"
				+START_DATE  +" DATE," + END_DATE + " DATE," + DES + " TEXT," + STATUS + " TEXT," + USER_COMMENT + " TEXT," +")";
		db.execSQL(task);
*/
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		//db.execSQL("drop table if exists "+ TABLE_TASK);
		db.execSQL("drop table if exists "+ TABLE_USER);
		onCreate(db);


	}
	
	public void register(User user)
	{
		Log.d("database",user.getmDasId());
		SQLiteDatabase db= this.getWritableDatabase();
		
		ContentValues  values= new ContentValues();
		values.put(DAS_ID,user.getmDasId());
		values.put(USER_NAME,user.getmUserName());
		values.put(PASSWORD,user.getmPassword());
		values.put(MOBILE_NO,user.getmMobileNo());
		values.put(EMAIL_ID,user.getmEmailId());
		
		db.insert(TABLE_USER, null, values);
		
		Log.d("database",DAS_ID);
		
	}

}
