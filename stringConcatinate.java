package oops_skill;

public class stringConcatinate {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.delete(0, 5);
        sb.replace(0, 4, "Hi");
        sb.reverse();
        System.out.println(sb);  // Output varies
    }
}


