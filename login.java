public class login {
    public static void main(String[] args) {
        
        //NESTED IF EXAMPLE

        String id = "admin";
        int password = 124;

        if(id == "admin"){
            System.out.println("user id is valid");

            if (password == 123)
            {
                System.out.println("password is valid");
                System.out.println("login successful");
            }
            else{
                System.out.println("password not valid");
                System.out.println("login unsuccessful");
            }
        }

    }
    
}
