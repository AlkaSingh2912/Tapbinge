public class largestofthree {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;
            System.out.println("a: " +a+ " b: " +b+ " c: " +c);
        if(a>b && a>c){
            System.out.println(a+" is greater ");
        }
        else if(b>c && b>a) {
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+ " is greater ");
        }

    }
    
}
