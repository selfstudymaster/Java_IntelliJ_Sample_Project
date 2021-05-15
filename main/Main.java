package main;

import hero.Hero;
import sword.Sword;
import wizard.Wizard;
import king.King;
import inn.Inn;
import matango.Matango;
import sword.Sword;

import java.nio.charset.StandardCharsets;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Hero h1;
//        h1 = new Hero("ミナト");
//        h1.name = "ミナト";
////        h1.hp = 100;
//
//        Hero h2;
//        h2 = new Hero();
////        h2.hp = 80;
//
//        Hero.setRandomMoney(); {
//            System.out.println("金:" + Hero.money);
//            System.out.println("金:" + h1.money);
//            System.out.println("金:" + h2.money);
//        }
//
//        Sword s = new Sword();
//        s.name = "破滅の剣";
//        s.damage = 10;
//
//        h1.sword = s;
//        System.out.println(h1.name);
//        System.out.println(h2.name);
//        System.out.println(h1.sword.name);
//
//        Wizard w = new Wizard();
//        w.name = "スガワラ";
//        w.hp = 50;
//        System.out.println(w.name);
//        w.heal(h1);
//        w.heal(h2);
//        h1.setName("てんさい");
//        h2.setName("ぼんさい");
//        System.out.println(h1.name);
//        System.out.println(h2.name);
//
//    }
//
//}


// 練習用

import java.util.*;
import java.util.function.*;

// java.lang.Objectについて学ぶ
// アウタークラス
class Outer {
    // アウターフィールド
    int outerField;
    // アウタースタティックフィールド
    static int outerStaticField;
    // インナーsutaicクラス
    static class Inner {
        void innerMethod() {
            // インナーstaticクラスのインナーメソッド内で、アウターメソッドのアウタースタティックフィールドを使う
            outerStaticField = 10;
        }
    }
    // アウターメソッド
    void outerMethod() {
        Inner ic = new Inner();
    }
}

public class Main {

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // java.util.function APIの持つIntBinaryOperatorクラス型の変数funcに関数subを代入
        IntBinaryOperator func = Main::sub;
        int x = func.applyAsInt(5, 3);
        System.out.println(x);

        // MyFunctionインターフェース型の変数functionにMyFunctionの持つ関数subを代入
        MyFunction function = Main::sub;
        int a = function.call(10, 9);
        System.out.println(a);


        Outer.Inner ic = new Outer.Inner();
        System.out.println(ic);
        ic.innerMethod();

//        Hero h1 = new Hero();
//        Sword s = new Sword("はやぶさの剣");
//        h1.setSword(s);
//        System.out.println(h1.getSword().getName());//
//        Hero h2 = h1.clone();
//        h2.getSword().setName("賢者の杖");
//        h1.setName("のりまいか");
//        h2.setName("ゆうあちゃん");
//        System.out.println(h1.getSword().getName() + h2.getSword().getName());//
//        System.out.println(h1.getName() + h2.getName());

//        Pocket<String> p = new Pocket<String >();
//        p.put("1192");
//        String s = p.get();
//        System.out.println(s);

    }


}



















