// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      String s = "neha";
      char ch ;
      String r = "";
      for(int i=0; i<s.length(); i++){
          ch = s.charAt(i);
          r = ch + r;
      }
      if(s.equals(r)){
         System.out.print("Plindrome");  
      }else{
          System.out.println("not palindrome");
      }
    }
}