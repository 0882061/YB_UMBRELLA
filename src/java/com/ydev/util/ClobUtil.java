package com.ydev.util;

import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialClob;

public class ClobUtil {

	public static String clobToString(Clob clob) {
		if (clob == null) {
			return null;
		}
		
		try {
			Reader inStreamDoc = clob.getCharacterStream();

			char[] tempDoc = new char[(int) clob.length()];
			inStreamDoc.read(tempDoc);
			inStreamDoc.close();
			return new String(tempDoc);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException es) {
			es.printStackTrace();
		}
		
		return null;
	}
	
	public static Clob stringToClob(String str) {
		if (null == str)
			return null;
		else {
			try {
				java.sql.Clob c = new SerialClob(str
						.toCharArray());
				return c;
			} catch (Exception e) {
				return null;
			}
		}
	}
}
