public class Question{
    int ques_id;
    String ques;
    String ans;
    int marks;

    public  void displayQues(){
        System.out.println( " Q"+ ques_id +" "+ ques + " "+"Marks:" + marks);

    }
    public Question(
        int ques_id,
        String ques,
        String ans,
        int marks
    ){
        this.ques_id = ques_id;
        this.ques = ques;
        this.ans = ans;
        this.marks = marks;
    }
}