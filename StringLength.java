class StringLength{
  public static void main(String[] args) {
    String s="Sanjivan";
   char[] c=s.toCharArray();
   int count=0;
   for (char ch: c ) {
     count++;
   }System.out.println(count);
  }
}