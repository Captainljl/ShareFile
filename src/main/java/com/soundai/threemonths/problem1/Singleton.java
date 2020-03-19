package com.soundai.threemonths.problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * 8.26
 */
public class Singleton {

    //如果不加volatile使用dcl的时候会有失效问题，
    private volatile static Singleton singleton;

    private Singleton() {}

    /**
     * 双重校验方式
     * double check lock 简称 dcl
     * 要知道有一个dcl失效问题，
     * @return
     */
    public static Singleton getInstanceDoubleCheck() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    /**
                     * dcl也可能出现失效问题，
                     * 下面这条语句在jvm里面的执行分为三步：
                     *  1，在堆内存开辟内存空间，
                     *  2，在堆内存中实例化Singleton里面的各个参数，
                     *  3，把对象指向堆内存空间
                     *  由于jvm存在乱序执行（也就是重排序）功能，所以可能在2还没执行就先执行3
                     */
                    singleton = new Singleton();
                }
                return singleton;
            }
        }
        return singleton;
    }

    static {}
    static {}

    /**
     * 静态内部类方式
     * 只有在getInstance调用的时候才会去加载SingletonHolder，jvm会保证SingletonHolder只加载一个。
     * 这种方法不仅能保证线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化
     *
     *
     * 虚拟机会保证一个类的<clinit>()方法在多线程环境中被正确地加锁、同步，如果多个线程同时去初始化一个类，
     * 那么只有一个线程会执行这个类的<clinit>()方法，其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
     * 故而，可以看出INSTANCE在创建过程中是线程安全的，所以说静态内部类形式的单例可保证线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
     * 无法解决传入参数的问题，
     */
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    /**
     * 一个Java类的完整的生命周期会经历加载、连接、初始化、使用、和卸载五个阶段，当然也有在加载或者连接之后没有被初始化就直接被使用的情况
     * 一个类的初始化并不一定会执行构造方法
     * Java虚拟机在有且仅有的五种场景下会对类进行初始化
     * 1，遇到new、getstatic、setstatic或者invokestatic这4个字节码指令时，
     *  对应的Java代码场景为：
     *  new一个关键字或者一个实例化对象时候
     *  读取或者设置一个静态字段时（final修饰、已在编译期把结果放入常量池的除外）、调用一个类的静态方法时。
     * 2，使用java.lang.reflect包的方法对类进行反射调用的时候，如果类没进行初始化，需要先调用其初始化方法进行初始化。
     * 3，初始化子类会触发父类初始化
     * 4，当虚拟机启动时，用户需要指定一个要执行的主类(包含main()方法的类)，虚拟机会先初始化这个类。
     * 5，当使用JDK 1.7等动态语言支持时，如果一个java.lang.invoke.MethodHandle实例最后的解析结果REF_getStatic、REF_putStatic、REF_invokeStatic的方法句柄，并且这个方法句柄所对应的类没有进行过初始化，则需要先触发其初始化。
     *
     */
    private static class SingletonHolder {

        static {
            System.out.println("MyChild1 static block");
        }

        private SingletonHolder () {
            System.out.println("singletonholder init");
        }

        private static final Singleton instance = new Singleton();
    }


    public void print () {
        System.out.println("print something!");
    }

    public static void main(String[] args) {
        //只加载一次
        getInstance().print();
        getInstance().print();
        List set = new ArrayList<>();

    }

    /**
     * init是对象构造器方法，也就是说在程序执行new一个对象调用该对象类的contructor方法时才会执行init方法，
     * clinit是类构造器方法，也就是在jvm进行类加载的过程（加载-验证-解析-初始化），中的初始化阶段jvm会调用clinit方法。
     *
     * init is the (or one of the) constructor(s) for the instance, and non-static field initialization.
     * clinit are the static initialization blocks for the class, and static field initialization.
     * 上面这两句是Stack Overflow上的解析，很清楚init是instance实例构造器，对非静态变量解析初始化，而clinit是class类构造器对静态变量，静态代码块进行初始化
     *
     * class X {
     *
     *    static Log log = LogFactory.getLog(); // <clinit>
     *
     *    private int x = 1;   // <init>
     *
     *    X(){
     *       // <init>
     *    }
     *
     *    static {
     *       // <clinit>
     *    }
     *
     * }
     *
     */
}
