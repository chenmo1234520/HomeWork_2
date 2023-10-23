package test2.src.pers.chenmo.myapp.Appor;

/* 2.	某公司现有java程序开发部门、C#程序开发部门、asp.net程序测试部门、前端程序开发部门四个部门。编写一个程序实现新入职的员工的部门分配，要求根据用户输入的员工姓名和应聘语言确定员工应该分配到哪个部门。
若公司没有与输入的语言匹配的部门，则进行相关提示。 */
import java.util.Scanner;

class Appor {
  String name;
  String type;
  int i;
  boolean flag;
  // String[] department = { "java程序开发部", "C#程序开发部门", "asp.net程序测试部门", "前端程序开发部"
  // };
  String[] department = { "java", "c#", "asp", "web" };
  Scanner sc = new Scanner(System.in);

  void Choice() {
    System.out.println("请输入员工姓名");
    name = sc.next();
    System.out.println("请选择要加入的部门 \n java c# asp web");
    type = sc.next();
    for (i = 0; i <= department.length - 1; i++) {
      if (type.equals(department[i])) {

        flag = true;
        Join(i);
        break;

      }
    }
    if (!flag) {

      System.out.println("公司没有与输入的语言匹配的部门,请输入正确部门");

    }
    // if (type.equals("java") || type.equals("JAVA")) {
    // type = department[0];
    // Join();
    // } else if (type.equals("c#") || type.equals("C#")) {
    // type = department[1];
    // Join();
    // } else if (type.equals("asp") || type.equals("asp.net")) {
    // type = department[2];
    // Join();
    // } else if (type.equals("Web") || type.equals("web")) {
    // type = department[3];
    // Join();
    // } else {
    // System.out.println("公司没有与输入的语言匹配的部门,请输入正确部门");
    // }

  }

  void Join(int j) {
    System.out.println("恭喜" + this.name + "加入本公司的" + department[j] + "部门");

  }

}

public class test2 {

  public static void main(String[] args) {
    Appor a = new Appor();
    a.Choice();
  }
}
