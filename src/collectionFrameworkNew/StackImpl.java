package collectionFrameworkNew;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st);
        Integer peek1 = st.peek();
        System.out.println(peek1);
        System.out.println(st.search(5));


    }
}
