public class User {
    private String name;
    private String surname;
    public int age;
    public User(){

        this("NIhad", "salam");

        System.out.println("salam");

    }
    public User(int age,String name,String surname){

        this.age=age;
        this.name=name;
        this.surname=surname;
        System.out.println("User3");

    }
    public User(String name,String surname){

        System.out.println("Nihad tamamdir ");
    }

}
