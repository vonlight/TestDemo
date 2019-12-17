public class TestDemo {
  private static class Test {
    public void print() {
      System.out.println("你好世界");
    }
  }
  public static void main(String[] args) {
    Test test = new Test();
    test.print();
    System.out.println("Hello World!");
  }
}
