package orest.edu10;

import orest.edu10.my_collections.MyHashMap;
import orest.edu10.my_collections.MySet;
import orest.edu10.student.StudentService;

public class Main {
    public static void main(String[] args) {
        new StudentService().service();
        new MyHashMap().mapService();
        new MySet().setService();
    }
}
