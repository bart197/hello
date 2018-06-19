public class HelloWorld {
    public static void main(String... args) {
        System.out.println(
            args.length == 0 ? "Hello world!" : String.join(" ", args)
        );
    }
}
