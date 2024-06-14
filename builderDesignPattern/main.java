package main.designPattern.builderDesignPattern;

public class main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                    .setUserId(11)
                    .setUsername("yash")
                    .build();
    }
}
