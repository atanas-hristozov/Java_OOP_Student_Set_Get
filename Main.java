public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Student k = new Student();
        s.setName("Ivan");
        s.setAge(24);
        k.setName("Katia");
        k.setAge(32);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(k.getName());
        System.out.println(k.getAge());
    }
}