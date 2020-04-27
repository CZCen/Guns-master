package cn.stylefeng.guns.lambda;

import cn.stylefeng.guns.service.TestDemo;

public class test {


    public static void main(String[] args) {


        //Lambda
        //单个参数
        //TestDemo param = name -> name;
        //TestDemo param2 = name -> {
        //    if(name.equals("grils")){
        //        return "hei,boys";
        //    }
        //    return name;
        //};
        //System.out.println(param.hi("grils"));
        //System.out.println(param2.hi("hei, grils2"));
        //param.dosomething();

        //TestDemo param = name -> String.valueOf(name.length());
        //System.out.println(param.hi("222222222"));

        test.sout1((str,str2)-> String.valueOf(str.length())+String.valueOf(str2.length()));
    }


    public static  void sout1(TestDemo param){
        System.out.println(param.hi("111","222"));
    }
}
