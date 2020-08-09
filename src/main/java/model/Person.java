package model;

public class Person {
    private int id;
    private String userName ;
    private int age ;
    private String mobilePhone ;
    public  Person(){}
    public Person(int id,String userName, int age, String mobilePhone) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.mobilePhone = mobilePhone;
    }

    public String getUserName() {
        return userName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", mobilePhone='" + mobilePhone + '\'' +
                '}';
    }
}
