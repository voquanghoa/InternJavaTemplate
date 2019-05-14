public class Demo {
    public int sum(int x, int y){
        return x+y;
    }

    public int sub(int x, int y){
        return x-y;
    }

    public int multiple(int x, int y){
        return x*y;
    }

    public int max(int a, int b, int c){
        if(a > b && a > c){
            return  a;
        }

        if(b>c){
            return b;
        }

        return c;
    }
}
