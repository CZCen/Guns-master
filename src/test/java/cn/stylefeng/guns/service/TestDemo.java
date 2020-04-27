package cn.stylefeng.guns.service;



@FunctionalInterface
public interface TestDemo {
    String hi(String name,String name2);

    default void dosomething(){
        System.out.println("函数式接口默认方法");
    }
}
