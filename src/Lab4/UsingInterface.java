package Lab4;
interface Animal{
    void sayHello();
    void eat();
}
interface Pet extends Animal{
    void play();
}
class Dog implements Pet{
    public void sayHello(){
        System.out.println("Hello!!!");
    }
    public void eat()
    {
        System.out.println("Dog is eating");
    }
    public void play()
    {
        System.out.println("Dog is playing");
    }
}
class Cat implements Pet{
    public void sayHello(){
        System.out.println("Hello!!!");
    }
    public void eat()
    {
        System.out.println("Cat is eating");
    }
    public void play()
    {
        System.out.println("Cat is playing");
    }
}
class UsingInterface{
    public static void main(String[] args) {
        Pet a=new Cat();
        Pet b=new Dog();
        a.sayHello();
        a.eat();
        a.play();
        b.sayHello();
        b.eat();
        b.play();
    }
    }



