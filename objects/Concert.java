package com.example.objects;

public class Concert {
    private String bandName;
    private String venue;
    private String date;
    public Concert(String bandName,String venue, String date){
        this.bandName=bandName;
        this.venue=venue;
        this.date=date;
    }
    public String toString(){
        return "bandName: "+bandName+ "venue: " +venue+ "date: " +date;
    }
}
