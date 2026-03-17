public static void foo(int x) throws IllegalArgumentException, NullPointerException {
 // some code
}

public static void main(String[] args) {
 try {
  foo(10);
 } catch (IllegalArgumentException | NullPointerException e) {
  System.out.println(e.getMessage());
 }
}
