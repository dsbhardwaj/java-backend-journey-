public class Main{
    public static void main(String[] args) {
        user user1 = new user(
         1,
        "drishti",
       "drishti@gmail.com",
         100 );
    
    user1.login();

    user user2 = new user(2 , "Prachi" , "prachi@gmail.com" , 99);

    user2.login();

    Question ques1 = new Question(1 , "what is 2+2 ?" , "4" , 1);
    Question ques2 = new Question(2 , "who is the pm of india?", "narendra modi" , 1);

    ques1.displayQues();
    ques2.displayQues();
    }

    
}