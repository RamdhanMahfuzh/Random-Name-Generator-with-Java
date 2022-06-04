package com.RandomNameGenerator;

import java.util.Random;
public class RandomNameGen {

    int a = 13;
    String Firstname [] = {"Steve","Stuart","Dave","Michael","Stan","Kurt","Harley","Harvey","Kim","Nash","Bo","Kevin","Chuck"};
    String Lastname [] = {"Nick","Bart","August","Josh","Stanley","Jack","Karl","David","Kimber","Buck","Davidson","Duke","Jean"};

    public void generateName()
    {
        Random rd = new Random();
        String Firstnames = Firstname[rd.nextInt(a)];
        String Lastnames = Lastname[rd.nextInt(a)];
        System.out.println(Firstnames + " " + Lastnames);
    }
    public static void main(String[] args) {
        RandomNameGen rg = new RandomNameGen();
        for (int i = 0; i < 5; i++) {
            rg.generateName();
            
        }
        
    }
}
