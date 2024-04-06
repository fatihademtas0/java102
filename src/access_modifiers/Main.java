package access_modifiers;

import access_modifiers.Course;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math" , "math101",60);

        Course eng = new Course("English" , "eng101",80);

        Course physic = new Course("Pyhsic" , "phy101",40);

        int[] notes ={math.note, eng.note, physic.note};

        // We called the method inside Course class without creating objects
        Course.calcaverage(notes);

    }
}
