public class basic
{

    public static class student
    {
        String name;
        int roll;
        double per;
    }
    public static void main(String[] args) 
    {
        student s1 = new student();
        s1.name="aman";
        s1.roll=15;
        s1.per=68.1;

        student s2= new student();
        s2.name="raman";
        s2.roll=65;
        s2.per=58.1;
        System.out.println(s2.name);
        System.out.println(s1.name);
        System.out.println(s2.per);
        System.out.println(s2.roll);
        System.out.println(s1.per);
        System.out.println(s1.roll);

        
    }
}