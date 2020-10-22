import java.util.Scanner;
public class MyStack<T> {
    private Node<T> stack=new Node<T>();
    public void push(T item){
        stack=new Node<T>(item,stack);
    }
    public T top(){
        T top1= stack.item;
        return top1;
    }
    public T pop(){
        T top1=stack.item;
        if(!stack.end())
            stack=stack.next;
        return top1;
    }
    private static class Node<K> {
        K item;
        Node<K> next;
        Node() {
            item=null;
            next=null;
        }
        Node(K item, Node<K> next){
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }

    public static void main(String args[]) {
        MyStack<String> s = new MyStack<String> ();
        String ss="11";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入所需要输入的串的总个数：");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ss=sc.next();
            s.push(ss);
        }
        sc.close();
        while((ss=s.top())!=null){
            s.pop();
            System.out.println(ss);
        }

    }

}