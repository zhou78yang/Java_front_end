package inter;

public class Stmt extends Node {
    public Stmt() { }
    public static Stmt Null = new Stmt();
    public void gen(int b, int a) {}    // 语句开始的标号和下条语句标号
    int after = 0;                      // 保存语句的下条指令标号
    public static Stmt Enclosing = Stmt.Null;   // 用于break语句
}
