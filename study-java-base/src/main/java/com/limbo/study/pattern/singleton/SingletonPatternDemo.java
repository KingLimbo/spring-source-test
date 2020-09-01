package com.limbo.study.pattern.singleton;

/**
 * 单例模式例子
 *
 * @author LF.LIMBO
 * @version 2019/08/19
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.equals(lazySingleton2));

        FullSingleton fullSingleton1 = FullSingleton.getInstance();
        FullSingleton fullSingleton2 = FullSingleton.getInstance();
        System.out.println(fullSingleton1.equals(fullSingleton2));

        InteriorSingleton interiorSingleton1 = InteriorSingleton.getInstance();
        InteriorSingleton interiorSingleton2 = InteriorSingleton.getInstance();
        System.out.println(interiorSingleton1.equals(interiorSingleton2));

        DCLSingleton dclSingleton1 = DCLSingleton.getInstance();
        DCLSingleton dclSingleton2 = DCLSingleton.getInstance();
        System.out.println(dclSingleton1.equals(dclSingleton2));

    }
}
