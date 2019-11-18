package com.example.db; //1.��������

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	//1.���캯����ͬ��CoolWeatherOpenHelper��
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version); //1.���ø���ͬ������
		// TODO Auto-generated constructor stub
	}

	//1.������������Ա����������ȫ��д���ַ����ͣ�ֻ��дһ�Σ�֮�����޸ģ���ÿһ������װ��һ��sql����
	
	/**
	 * Province��������
	 */
	public static final String CREATE_PROVINCE = "creat table Province ("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	
	/**
	 * City��������
	 */
	public static final String CREATE_CITY = "creat table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer)";
	
	/**
	 * County��������
	 */
	public static final String CREATE_COUNTY = "creat table County ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text, "
			+ "city_id integer)";
	
	@Override
	public void onCreate(SQLiteDatabase db){ //1.�������ݿ�,��ʼ��������ע��execSQL��ʾִ��һ��sql��䣩
		db.execSQL(CREATE_PROVINCE); //����Province��
		db.execSQL(CREATE_CITY);  //����City��
		db.execSQL(CREATE_COUNTY); //����County��
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){ //1.���ݿ���;�ĸ����޸�
		
	}
	
	

}
