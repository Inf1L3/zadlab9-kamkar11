/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] tab = new int[100];

        /*
        for(int i=0; i<tab.length;i++)
        {
            int r = rand.nextInt(100)+1;
            tab[i] = r;
        }
        Arrays.sort(tab);
        for(int i=0; i<tab.length;i++)
        {
            System.out.println(tab[i]);
            
        }
         */
        // 2
        /*
        for(int i=0; i<tab.length;i++)
        {
            int r = rand.nextInt(100)+1;
            tab[i] = r;
        }
        
        
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for(int i=0; i<100;i++)
        {
            int r = rand.nextInt(100)+1;
            tree.add(r);
        }
        
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
	}
	System.out.println();
         */
        // 3
        /*
        ArrayList<Samochod> samochody = new ArrayList<Samochod>();
        
        
        
        
        System.out.println("Podaj ilosc samochodów do wstawienia");
        int n = input.nextInt();
        for(int i=0; i<n;i++)
        {
            System.out.println("Podaj marke");
            String marka = input.next();
            System.out.println("Podaj nazwe");
            String nazwa = input.next();
            System.out.println("Podaj cene");
            int cena = input.nextInt();
            samochody.add(new Samochod(marka, nazwa, cena));
            System.out.println();
        }
        System.out.println(samochody);
        /*
        for(int i=0;i<samochody.size();i++)
        {
            System.out.println("Auto "+i+" :"+samochody.get(i));
        }
         */
        // 4
        Map<String, String> slowa = new HashMap<>(20);
        slowa.put("pies", "dog");
        slowa.put("kot", "cat");
        slowa.put("czapka", "cap");
        slowa.put("mysz", "mouse");
        slowa.put("dom", "house");
        slowa.put("kwiat", "flower");
        slowa.put("komputer", "computer");
        slowa.put("telewizja", "TV");
        slowa.put("krzeslo", "chair");
        slowa.put("powietrze", "air");
        slowa.put("wszystko", "all");
        slowa.put("zawsze", "always");
        slowa.put("wiek", "age");
        slowa.put("rozmiar", "size");
        slowa.put("niebo", "sky");
        slowa.put("spac", "sleep");
        slowa.put("siostra", "sit");
        slowa.put("spiewac", "sing");
        slowa.put("snieg", "snow");
        slowa.put("syn", "son");

        int k = 1;

        while (k == 1) {

            System.out.println("Wpisz słowo które chcesz przetłumaczyć na angielski: "
                    + "(wpisz 'koniec' jesli chcesz zakończyć) ");

            String n = input.next();

            if ("koniec".equals(n)) 
            {
                k = 0;
            } 
            else if (n.equals(n)) 
            {
                if (slowa.get(n) == null)System.out.println("Nie ma takiego słowa w bazie");   
                 else System.out.println(slowa.get(n));
            }

        }
        /*
            if ("pies".equals(n))  System.out.println(slowa.get("pies"));   
             else if ("kot".equals(n))  System.out.println(slowa.get("kot"));   
             else if ("czapka".equals(n))  System.out.println(slowa.get("czapka"));   
             else if ("mysz".equals(n))  System.out.println(slowa.get("mysz"));   
             else if ("dom".equals(n))  System.out.println(slowa.get("dom"));   
             else if ("kwiat".equals(n))  System.out.println(slowa.get("kwiat"));   
             else if ("komputer".equals(n))  System.out.println(slowa.get("komputer"));  
             else if ("telewizja".equals(n))  System.out.println(slowa.get("telewizja"));   
             else if ("krzeslo".equals(n))  System.out.println(slowa.get("krzeslo"));   
             else if ("powietrze".equals(n))  System.out.println(slowa.get("powietrze"));  
             else if ("wszystko".equals(n))  System.out.println(slowa.get("wszystko"));   
             else if ("zawsze".equals(n))  System.out.println(slowa.get("zawsze"));  
             else if ("wiek".equals(n))  System.out.println(slowa.get("wiek"));   
             else if ("rozmiar".equals(n))  System.out.println(slowa.get("rozmiar"));   
             else if ("niebo".equals(n))  System.out.println(slowa.get("niebo"));  
             else if ("spac".equals(n))  System.out.println(slowa.get("spac"));  
             else if ("siostra".equals(n))  System.out.println(slowa.get("siostra"));  
             else if ("spiewac".equals(n))  System.out.println(slowa.get("spiewac"));   
             else if ("snieg".equals(n))  System.out.println(slowa.get("snieg"));   
             else if ("syn".equals(n))  System.out.println(slowa.get("syn"));   
             else if ("koniec".equals(n))  k = 0;  
             else  System.out.println("Nie ma takiego słowa w bazie");
         */

    }

}

}
