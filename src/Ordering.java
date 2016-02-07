public class Ordering {
    public String orderWord(String s){
        if (s == null || s == "") return "Invalid String!";
        String result="";
        int index=0;
        int l=s.length();
      for (int j=0;j<l; j++ ) {
          char tmp = s.charAt(0);
          for (int i = 0; i < s.length(); i++) {
              if (s.charAt(i)>= tmp) {
                  tmp = s.charAt(i);
                  index = i;
              }
          }
          result = tmp+result;
          if (index < s.length()) s = s.substring(0,index)+s.substring(index+1);
          System.out.println(s + " __  " + result);
      }
        System.out.println(result);
        return result;
    }
}
