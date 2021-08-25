package com.vytrack.pages;

public class hayr {

    public static void main(String[] args ){

        String name= "HadiBeniÇevir";
        String reversed="";

        for ( int i= name.length()-1;  i>=0; i--){

           reversed+= name.charAt(i);



        }
        System.out.println("reversed = " + reversed);
    }




}
