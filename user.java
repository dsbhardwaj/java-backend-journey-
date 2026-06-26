public class user{
    int id;
    String name;
    String email;
    int score;

public void login(){
     System.out.println( name + " logged In");
}

public user(
    int id,
    String name,
    String email,
    int score
){
    this.id = id;
    this.name = name;
    this.email = email;
    this.score = score;
}

}