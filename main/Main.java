package main;

import hero.Hero;
import sword.Sword;
import wizard.Wizard;
import king.King;
import inn.Inn;
import matango.Matango;
import sword.Sword;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

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


// 練習用1
//
//import java.util.*;
//import java.util.function.*;
//
//// java.lang.Objectについて学ぶ
//// アウタークラス
//class Outer {
//    // アウターフィールド
//    int outerField;
//    // アウタースタティックフィールド
//    static int outerStaticField;
//    // インナーsutaicクラス
//    static class Inner {
//        void innerMethod() {
//            // インナーstaticクラスのインナーメソッド内で、アウターメソッドのアウタースタティックフィールドを使う
//            outerStaticField = 10;
//        }
//    }
//    // アウターメソッド
//    void outerMethod() {
//        Inner ic = new Inner();
//    }
//}

//public class Main {
//
//    public static int sub(int a, int b) {
//        return a - b;
//    }
//
//    public static void main(String[] args) {
//        // java.util.function APIの持つIntBinaryOperatorクラス型の変数funcに関数subを代入
//        IntBinaryOperator func = Main::sub;
//        int x = func.applyAsInt(5, 3);
//        System.out.println(x);
//
//        // MyFunctionインターフェース型の変数functionにMyFunctionの持つ関数subを代入
//        MyFunction function = Main::sub;
//        int a = function.call(10, 9);
//        System.out.println(a);
//
//
//        Outer.Inner ic = new Outer.Inner();
//        System.out.println(ic);
//        ic.innerMethod();
//
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
//    }
//}

// 復習用20210607
public class Main {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        String s4 = "";

        System.out.println(s1.length());
        if (s2.equals(s3)) {
            System.out.println("s2=s3");
        }
        if(s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はequalsIgnoreCaseで等しいと判断される");
        }
        if (s4.isEmpty()) { // trueを返す
            System.out.println("s4は空文字");
        }
        System.out.println(s1.contains("J")); // true
        System.out.println(s1.contains("j")); // false
        if (s1.contains("J")) { // trueを返す
            System.out.println("s1はJを含む");
        }

        // indexOf(), charAt(), substring()では　対象となる String s1 = "スッキリJava"; の数え方に注意
        // 0  1  2 3  4 5 6 7 8 (先頭位置=先頭文字のインデックス番号ではなく、先頭文字の前。行間に線を引いて数える)
        // |ス|ッ|キ|リ|J|a|v|a|
        // indexOf("文字列") 文字列の位置を「先頭位置を0からはじめる整数」で返す。含まれていない文字を指定した場合は-1を返す
        System.out.println(s1.indexOf("J")); // 4
        System.out.println(s1.indexOf("a")); // 5 (s1の中に "a" は5と7の二箇所に含まれるが、indexOfの戻り値は 5 だけ)
        System.out.println(s1.indexOf("j")); // -1 ( j は存在しない文字)
        // charAt(int) 引数に指定した「先頭位置を0からはじめる整数」の文字を戻す
        System.out.println(s1.charAt(1)); // ッ
        // substring(int) 引数に指定した「先頭位置を0からはじめる整数」以降の文字列全てを返す
        System.out.println(s1.substring(1)); // ッキリJava
        // substring(int, int) 引数に指定した「先頭位置を0からはじめる整数」の範囲の文字列を返す
        // インデックス番号で数えると ッキリ と勘違いして誤るので要注意！
        System.out.println(s1.substring(1, 3)); // ッキ
        System.out.println(s1.toLowerCase()); // スッキリJava
        System.out.println(s1.toUpperCase()); // スッキリJAVA
        System.out.println(s1.replace("v", "J")); // スッキリJaJa

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Java");
        }
        // sb.append によってsbのバッファ内部に後ろから連結して蓄積されている
        // 文字列連結のtoStringメソッドを用いて、連結済の文字列を取り出す
        String s5 = sb.toString();
        System.out.println(s5); // JavaJavaJavaJavaJavaJavaJavaJavaJavaJava

        StringBuffer sbu = new StringBuffer();
        for (int i = 0; i <10; i++) {
            sbu.append("まの");
        }
        // 文字列連結のtoStringメソッドを用いて、連結済の文字列を取り出す
        String s6 = sbu.toString();
        System.out.println(s6); // まのまのまのまのまのまのまのまのまのまの

        // toCharArray() Stringインスタンスをchar配列に変換
        char[] data1 = s1.toCharArray();
        for (char c : data1) {
            System.out.println(c);
            //ス
            //ッ
            //キ
            //リ
            //J
            //a
            //v
            //a
        }

        // getBytes() Stringインスタンスをbyte配列に変換 (デフォルトの文字コードを利用)
        byte[] data2 = s1.getBytes();
        System.out.println(data2[15]);
        for (byte b : data2 ) {
            System.out.println(b);
            //-29
            //-126
            //-71
            //-29
            //-125
            //-125
            //-29
            //-126
            //-83
            //-29
            //-125
            //-86
            //74
            //97
            //118
            //97
        }

    }
}