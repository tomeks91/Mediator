import java.util.ArrayList;
import java.util.List;

public class ChatMediator  {

    private List<User> users;

    public ChatMediator(){
        this.users=new ArrayList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //message should not be received by the user sending it
            if(u != user){
                u.receive(msg);
            }
        }
    }

}