package main;

import hero.Hero;
import sword.Sword;
import wizard.Wizard;
import king.King;
import inn.Inn;
import matango.Matango;

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
import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.*;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2011/08/21", f);
        System.out.println(d);

        d = d.plusDays(10000);
        System.out.println(d);

        LocalDate now = LocalDate.now();
        System.out.println(now);

    }

}



















