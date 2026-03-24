package OOPS.Inheritance.Multiple;

public class Athlete implements Swimmer,Runner{
// Overriding methods
        public void Swim() {
        System.out.println("The athlete swims");
     }
        public void Run() {
        System.out.println("The athlete runs");
     }

}
