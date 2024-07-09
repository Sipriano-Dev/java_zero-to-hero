package com.sipriano.legacy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormattingDemo {

    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        System.out.println(currentDate);//Mon Jul 08 21:55:04 BRT 2024

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//HH = 24h
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMMM/yyyy");//"dd/MMMM/yyyy HH:mm:ss" 3xM feb, 4xM february
        String formattedDate = sdf2.format(currentDate);
        System.out.println(formattedDate);


        String dateString = "14/10/1988 16:30:10";
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date newDate = sdf3.parse(dateString);
        System.out.println(newDate);



    }

}
