package me.xdark.shell;

public class Debugger {

    private static int x1;

    public static void main(String[] args) {
        int i = 20000;
        while (i-- > 0) test();
        ShellcodeRunner.inject(Debugger.class, "test", "()V", new byte[]{(byte) 0xCC});
        test();
    }

    public static void test() {
        x1++;
    }
}
