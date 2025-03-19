package com.demo;

public class Main{
    public static void main(String[] args){
        //to make tea, call the tea()
        tea();

        //to make coffee, call the coffee()
        coffee();

        //to make tea second time, again call the tea()
        tea();

        //to make tea third time, call the tea()
        tea();

        ////to make coffee second time, call the coffee() again
        coffee();
    }

    //static method tea()
    static void tea(){
        System.out.println("Boil water tea leaves and sugar.");
        System.out.println("Add milk and boil for some minutes");
        System.out.println("Serve the milk tea");
    }

    //static method coffee()
    static void coffee(){
        System.out.println("Boil some milk.");
        System.out.println("Put some coffee in the cup");
        System.out.println("Pour the milk into the cup");
    }
}