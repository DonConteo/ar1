package com.company;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divThree = new ArrayList<>();
        ArrayList<Integer> divTwo = new ArrayList<>();
        ArrayList<Integer> another = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            String smth = reader.readLine();
            list.add(Integer.parseInt(smth));
        }

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if ((num % 3) == 0){
                divThree.add(num);
            }
            if ((num % 2) == 0){
                divTwo.add(num);
            }
            if ((num % 3) != 0 && (num % 2) != 0){
                another.add(num);
            }
        }
        printList(divThree);
        printList(divTwo);
        printList(another);
    }

    public static void printList(ArrayList<Integer> list) {
        for(Integer x : list){
            System.out.println(x);
        }
    }
}
