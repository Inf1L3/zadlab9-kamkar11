/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;



/**
 *
 * @author maarchyl
 */
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
        for(int i=0;i<samochody.size();i++)
        {
            System.out.println("Auto "+i+" :"+samochody.get(i));
        }
        
        
	
        
    }
    
}
