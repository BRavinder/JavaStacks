import java.util.Stack;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
           //1,push Add elements in the stack
        s1.push(2);
        s1.push(9);
        s1.push(4);
        System.out.println(s1);
           //2,peek showing the top are visible elements in the stack
        int Einfo = s1.peek();
        System.out.println(Einfo);
            //System.out.println(s1.peek());

            //3, search the elements in the stack
            int indexFound = s1.search(9);
                System.out.println(indexFound);
            //System.out.println(s1.search(9));

           //4,Empty showing true are false
            boolean status = s1.empty();
                System.out.println(status);
           //System.out.println(s1.empty());

           //5, size 
            System.out.println(s1.size());

           //6,sort Re arrange the elements
            s1.sort(null);
                System.out.println(s1);

            //7,pop Removing elements
            s1.pop();
                System.out.println(s1);
    }
}