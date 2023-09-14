// Encapsulation
class Bank{
    private String Password;
    //to access private  use getter- setter 
    public String getPassword(){
        return this.Password;
    }
    public String setPassword(String pass){
       return this.Password=pass;
    }
}
class Encapsulation{
    public static void main(String[] args){
        Bank Obj= new Bank();
        //Obj.password="nvn12345"; // error dega kyuki password private hai or wo dusare class me use nahi hoga

        //Obj.setPassword("nvvbn");
        System.out.println(Obj.setPassword("nvn12345"));
    }
}