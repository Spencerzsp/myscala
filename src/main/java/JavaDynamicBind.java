/**
 * @ Author     ：zsp
 * @ Date       ：Created in 14:36 2019/8/19
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
public class JavaDynamicBind
{
    public static void main(String[] args)
    {
        A obj = new B(); //子类对象赋值给父类引用
        System.out.println(obj.sum()); //30 //20 //30
        System.out.println(obj.sum1()); //20 //20
    }
}

class A{
    public int i = 20;
    public int sum(){
        return getI() + i;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;
//    public int sum(){
//        return i + 20;
//    }
//    public int sum1(){
//        return i + 10;
//    }
    public int getI(){
        return i;
    }
}
