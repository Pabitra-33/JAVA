package com.inheritance;

class SolarSystem {
}

class Earth extends SolarSystem {
}

class Mars extends SolarSystem {
}

public class HybridInheritance extends Earth {
    public static void main(String args[]) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);//true
        System.out.println(e instanceof Earth); //true
        System.out.println(m instanceof SolarSystem);//true
    }
}
