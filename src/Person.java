class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello "+this.name);
    }
    public static void main(String[] args) {
        Person p1 = new Person("kyle");
        System.out.println(p1.getName());
        p1.sayHello();
        p1.setName("Jade");
        System.out.println(p1.getName());
        p1.sayHello();
    }
}
