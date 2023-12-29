import java.util.*;
public class NameStack{
    private List<String> stack;
    
    public NameStack(){
        stack = new ArrayList<>();
    }
    
    // add name on top 
    public void push(String name){
        stack.add(0, name);
    }
    
    // pop 
    public String pop(){
        String name = stack.remove(0);
        return name;
    }
    
    public int size(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public String toString(){
        return "(" + stack + ")";
    }
}