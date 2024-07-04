public class matrimony {
    public static void main(String[] args) {
         
        String gender = "male";
        String gender1 = "female";
        int maleage = 20;
        int femaleage = 18;
        if (gender == "male")
        {
            if(maleage>=21)
            {
                System.out.println("Man is allow to marry");
            }
            else{
                System.out.println("man is not allowed to marry");
            }
        }
        if (gender1 == "female")
        {
            if(femaleage>=17)
            {
                System.out.println("female is allow to marry");
            }
            else{
                System.out.println("female is not allowed to marry");
            }
        }
    }
    
}
