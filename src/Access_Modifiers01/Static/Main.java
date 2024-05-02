package Access_Modifiers01.Static;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Math" , "math101",60);

        Course eng = new Course("English" , "eng101",80);

        Course physic = new Course("Pyhsic" , "phy101",40);

        Course biology = new Course("Biology" , "bio101" ,55);

        int[] notes ={math.note, eng.note, physic.note , biology.note};

        // We called the method inside Course class without creating objects
        Course.calcaverage(notes);

    }
}
