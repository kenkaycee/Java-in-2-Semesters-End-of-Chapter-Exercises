public class NameStackTester{
    public static void main (String[] args) {
        NameStack myStack = new NameStack();
        int choice; 
        do 
        {
            System.out.println();
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Number of names in the list");
            System.out.println("4. check if list is empty");
            System.out.println("5. Display list");
            System.out.println("6. Quit program");
            System.out.println();
            System.out.print("Enter choice 1 - 5: ");
            choice = EasyScanner.nextInt();
            switch(choice)
            {
                case 1: option1(myStack); break;
                case 2: option2(myStack); break;
                case 3: option3(myStack); break;
                case 4: option4(myStack); break;
                case 5: option5(myStack); break;
                case 6: break;
                default: System.out.println("Choose from 1 - 5 only!!!");
            }
        }while(choice != 6);
    }
    
    // push
    static void option1(NameStack stackIn){
        System.out.print("Enter name: ");
        String name = EasyScanner.nextString();
        stackIn.push(name);
    }
    
    // pop 
    static void option2(NameStack stackIn){
        System.out.println(stackIn.pop());
    }
    
    // size 
    static void option3(NameStack stackIn){
        System.out.println(stackIn.size());
    }
    
    // is empty 
    static void option4(NameStack stackIn){
        if(stackIn.isEmpty())
        {
            System.out.println("List is empty");
        }
        else 
        {
            System.out.println("List is NOT empty");
        }
    }
    
    static void option5(NameStack stackIn){
        System.out.println(stackIn);
    }
}


