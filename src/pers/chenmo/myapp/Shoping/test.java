package pers.chenmo.myapp.Shoping;

/* 
1.编写一个智能购物计算小程序，在一家商店有书本、铅笔、橡皮、可乐、零食五种商品，商品价格如下表所示。
商品名称	价格
书本	12元
铅笔	1元
橡皮	2元
可乐	3元
零食	5元
假如你带了20元，且必须购买一本书，剩余的钱还可以购买哪种商品，可以购买几件，购买完后又能剩余多少钱？

 */
class Shoping {
  String[] item = { "书本", "铅笔", "橡皮", "可乐", "零食" };
  int[] price = { 12, 1, 2, 3, 5 };
  int init = 20;
  int i;
  int a;
  int b;

  public Shoping() {

  }

  void BuyOne() {
    this.init = init - price[0];

    System.out.println("买书花费" + price[0] + "元");

  }

  void Buy() {

    for (i = 0; i <= price.length - 1; i++) {

      if (price[i] <= this.init) {
        a = this.init / price[i];
        b = this.init % price[i];
        System.out.println("或者还可以购买" + a + "个" + item[i] + "还剩" + b + "元");

      }

    }
  }
}

public class test {
  public static void main(String[] args) {
    Shoping s = new Shoping();
    s.BuyOne();
    s.Buy();
  }
}
