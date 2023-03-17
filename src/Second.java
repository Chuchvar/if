public class Second {
    public static void main(String[] args) {
        int n = 956;
        int c = (n / 100);
        int b = (n-(c * 100) ) / 10;
        int a = ((n-(c * 100) ) - (10 * b)) /1;
        if (a>b){
            if(a>c){
                System.out.println(a);
            }
        }
        if (b>a){
            if(b>c){
                System.out.println(b);
            }
        }
        if (c>a){
            if(c>b){
                System.out.println(c);
            }
        }

    }
}
