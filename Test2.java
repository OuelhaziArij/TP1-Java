class Test2 {
    void hello(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test2 o1 = new Test2();
        o1.hello(args[0]);
    }

}
