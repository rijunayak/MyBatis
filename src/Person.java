public class Person {

    private Integer userId;
    private String name;

    @Override
    public String toString() {
        return "User [userId = " + userId + ", name = " + name + "]";
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
