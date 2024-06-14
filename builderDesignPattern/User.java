package main.designPattern.builderDesignPattern;

public class User {
    private int userId;
    private String username;

    private User(UserBuilder userBuilder){
        // initialise
        this.userId = userBuilder.userId;
        this.username = userBuilder.username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    // inner class to create object
    static class UserBuilder{
        private int userId;
        private String username;

        public  UserBuilder(){

        }

        public UserBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public  User build(){
            User user = new User(this);
            return user;
        }
    }
}
