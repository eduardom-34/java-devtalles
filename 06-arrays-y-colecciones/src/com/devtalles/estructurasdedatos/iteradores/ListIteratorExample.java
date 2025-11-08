package com.devtalles.estructurasdedatos.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gabriel", "Fernando", "Maria"));

        System.out.println("Names = " + names);

        addName(names, "Carlos");
        readName(names);
        updateName(names, "Ana", "Gabriel");
        removeName(names,"Maria");

        System.out.println("Names + " + names);

    }


    public static void addName(List<String> names, String newName){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.equals("Gabriel")){
                iterator.add(newName);
                break;
            }
        }
    }

    public static void updateName(List<String> names, String newName, String oldName){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(oldName)){
                iterator.set(newName);
                break;
            }
        }
    }

    public static void removeName(List<String> names, String nametoDelete){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(nametoDelete)){
                iterator.remove();
                break;
            }
        }
    }
    public static void readName(List<String> names){
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
            }
        System.out.println();
        }
    }
