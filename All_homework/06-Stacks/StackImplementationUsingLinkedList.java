// StackImplementationUsingLinkedList
class StackImplementationUsingLinkedList {static class N{int v;N n;N(int x){v=x;}}N top;public void push(int x){N t=new N(x);t.n=top;top=t;}public int pop(){if(top==null)throw new IllegalStateException();int x=top.v;top=top.n;return x;}public int peek(){if(top==null)throw new IllegalStateException();return top.v;}public boolean isEmpty(){return top==null;}}
