/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammadHossein
 */
public class MainClass {

    public static void main() {
        BigIntClass obj1 = new BigIntClass("72176237387");
        BigIntClass obj2 = new BigIntClass();
        obj2.setBigInt(obj1);
        BigIntClass obj3 = new BigIntClass();
        obj3.setSumBigInt(obj1, obj2);
        System.out.print(obj3.getBigInt());
        // فقط جهت راهنمایی
    }

}
