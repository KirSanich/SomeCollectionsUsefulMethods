package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>(List.of(4, 8, 0, -34, 66, -100, 61, 44, 32, 900));
        Collections.sort(integerList);
        // лист, отсортированный в естественном порядке
        System.out.println(integerList);


        var find =Collections.binarySearch(integerList,-34);
        System.out.println(find);


        // Реверс
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println(integerList);



        // Перетасовка объектов листа
        Collections.shuffle(integerList,new Random());
        System.out.println(integerList);

        Person person = new Person("Kirill",22);
        Person person1 = new Person("Kirill",77);
        Person person2 = new Person("Kirill",88);
        Person person3= new Person("Kirill",99);
        Person person4= new Person("Kirill",12);
        Person person5= new Person("Kirill",66);
        Person person6= new Person("Kirill",34);



        // Сортировка по возрасту
        var list = new ArrayList<Person>(List.of(person,person1,person2,person3,person4,person5,person6));
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(list+"\n"+"\n");



        //Замена объектов в коллекции
        var stringList = new ArrayList<String>(List.of("Kirill","Oleg","Kirill","Oleg","Oleg"));
        Collections.replaceAll(stringList,"Oleg","Kate");
        System.out.println(stringList);


        var integerList1 = new ArrayList<Integer>(List.of(1,7,0,-56,-23,77,1096,8,10,10,10));
        System.out.println("Число 10 встречается ровно:"+Collections.frequency(integerList1,10)+" раза");

        var StringList = new ArrayList<String>(List.of("Kirill","Kirill","Kirill","Kirill"));
        System.out.println("Количество вхождений строки 'Кирилл':"+Collections.frequency(StringList,"Kirill"));




        var testInt1 = new ArrayList<Integer>(List.of(6,8,1,0,9,6,2,3,11));
        var testInt2 = new ArrayList<Integer>(List.of(4,2,3,11,89));
        // Если тру, то элементов общих нет
        System.out.println(Collections.disjoint(testInt1,testInt2));


        //Удалений из 1 коллекции всех элементов, что есть во 2 коллекции
        testInt1.removeAll(testInt2);
        System.out.println(testInt1);


        // удаление из 1 коллекции всех элементов, которых нет в 2 коллекции
        testInt1.retainAll(testInt2);
        System.out.println(testInt1);














    }
}
