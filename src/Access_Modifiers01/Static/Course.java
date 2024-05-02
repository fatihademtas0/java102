package Access_Modifiers01.Static;

public class Course {
    public  String name;
    public String code;
    public int note;

    public Course(String name, String code, int note) {
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcaverage(int[] arr){
        double avg =0 , sum =0;
        for (int i : arr){
            sum +=i;
        }
        avg= sum/arr.length;
        System.out.println("Average = "+avg);
    }
}
