/**
 * practice
 */

public class practice {

    public static void main(String[] args) {
        System.out.println("Hello World");
        String message = "Bogus";
        // swtich test
        switch (message) {
            case "Hello World":
                System.out.println("Hello World");
                break;
            default:
                System.out.println(message + " = Not Hello World");
                break;
        }
        // for loop test
        for (int i =0; i<=5; i++){
            System.out.println("i is equal tp" + i);
        }

        // while loop test
        int count = 7;
        while (count > 0){
            System.out.println("Count is equal to " + count);
            count--;
        }
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        String[] names = {"John", "Jane", "Joe", "Jill", "Jack", "Jenny", "Jerry", "Judy", "Jim", "Jill"};
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Number is equal to " + numbers[i] + " and name is " + names[i]);      
        }
           
        
        String name = "Fido";
        Dog myDog = new Dog();
        // myDog.bark();
        System.out.println(myDog);
        myDog.setName(name);
        System.out.println(myDog.getName());
    }
}
class Dog {
    public String name;
    public int age;
    
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void bark(){
        System.out.println("woof");
    }
}
