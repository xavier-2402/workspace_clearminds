package com.cmc.commons.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static final  String patron="yyyy/dd/MM";
	
	public static Date convertir(String cadena) throws ParseException{
		DateFormat formato = new SimpleDateFormat(patron);
		Date fecha = formato.parse(cadena);
		return fecha;

	}

}
