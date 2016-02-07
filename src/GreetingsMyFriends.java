public class GreetingsMyFriends {

    public String[] greetingForAllFriends(String... friends) {
        if (friends == null ) return  null;
        if (friends.length == 0   ) return  null;
        String[] hello = new String[friends.length];
        for (int i = 0 ;i < friends.length; i ++ ) {
           hello[i] ="Hello, "+friends[i]+"!";
           }
        System.out.println(hello[0]);
        return hello;
    }
}
/*
duckfly.tw, Jabell

public class GreetingsMyFriends {

  public String[] greetingForAllFriends(String... friends) {
    if(friends==null || friends.length <=0 ) return null;
    return java.util.Arrays.stream(friends).map(i->"Hello, "+i+"!").toArray(String[]::new);
  }

}
 */