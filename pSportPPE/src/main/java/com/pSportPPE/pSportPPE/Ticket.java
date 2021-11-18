package com.pSportPPE.pSportPPE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;


public class Ticket {
	
	 Connection conn = null;
	 PreparedStatement pst = null;
	   	
	 static Date date = Calendar.getInstance().getTime();  
	 static SimpleDateFormat day = new SimpleDateFormat("dd/MM/yyyy");
	 static String currentDay = day.format(date);  

	 static long hours = Calendar.getInstance().getTimeInMillis();  
	 static SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
	 static String currentHour = hour.format(hours);	
}
