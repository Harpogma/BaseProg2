package cours_2;

import cours_2.classes.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Shoes shoes1 = new Shoes("shoes1", 49, 39);
        Shoes shoes2 = new Shoes("shoes1", 559, 29);
        Table table1 = new Table("table1", 539, 209);
        App app1 = new App("app1", 9, 1.1, "https://");
        License lic1 = new License("lic1", 39, 2.2, "https://");

       /* Set<String> monSet = new HashSet<>();
        monSet.add("aaa");
        monSet.add("aab");
        System.out.println(monSet.add("aac"));
        System.out.println(monSet.add("aac"));
        System.out.println(monSet.size());
        for(String s : monSet){
            System.out.println(s);
        }*/
     /*   Set<App> appSet = new HashSet<>();
        appSet.add(app1);
        App app2 = new App("app2", 9, 1.1, "https://");
        appSet.add(app2);
        System.out.println(appSet.size());
        App app3 = new App("app2", 9, 1.1, "https://");
        appSet.add(app3);
        System.out.println(appSet.size());
        App app4 = app3;
        appSet.add(app4);
        System.out.println(appSet.size());*/

        Set<License> licenseSet = new HashSet<>();
        licenseSet.add(lic1);
        License lic2 = new License("lic1", 39, 2.2, "https://");
        licenseSet.add(lic2);
        System.out.println(licenseSet.size());

        /*int i = 10;
        int j = 0;
        try {
            System.out.println(i/j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Catch par exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Print dans tous les cas car dans finally");
        }
        System.out.println("Hello");*/

        ReadFile fr = null;
        try {
            fr = new ReadFile("src/testfile.txt");
            System.out.println(fr.readNextLine());
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e ) {
                System.out.println(e.getMessage());
            }
        }


        /*Map<Integer, String> monMap = new TreeMap<>(new IntegerComparator());
        monMap.put(300, "aaaa");
        monMap.put(200, "aaab");
        monMap.put(400, "aaac");
        monMap.put(100, "aaac");

        //System.out.println(monMap.get(1));
        for(Map.Entry<Integer, String> entry : monMap.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }*/

       /* Map<String, String> monMap2 = new TreeMap<>(new StringComparator());
        monMap2.put("aaad", "aaaa");
        monMap2.put("aaab", "aaab");
        monMap2.put("baaa", "aaac");
        monMap2.put("aaaa", "aaac");

       // System.out.println("aaa".compareTo("zzz"));



        //System.out.println(monMap.get(1));
        for(Map.Entry<String, String> entry : monMap2.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }*/
       ProductFinder pf = new ProductFinderList();
        pf.addProduct(shoes1);
        pf.addProduct(shoes2);
        pf.addProduct(table1);
        pf.addProduct(app1);

        try {
            System.out.println(pf.findById(31));
        } catch (ExceptionProductNotFound pnf) {
            System.out.println("product not found");
        }

        /*
        for(Map.Entry<Integer, Product> entry : pf.getProds().entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }*/



    }
}