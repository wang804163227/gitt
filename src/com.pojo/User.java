public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        User u=new User();
        u.setName("月月鸟");
        System.out.println(u.getName());
        System.out.print("hello world");
    }
}
