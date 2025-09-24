class Test3 {
    String x;

    void hello() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Test3 o3 = new Test3();
        o3.x = "Hello";
        o3.hello();
    }
}
