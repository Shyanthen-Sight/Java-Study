public static void main(String[] args) {
    int aInt = 20;
    long bLong = 50L;
    double cDouble = 4.8;

    //低优先级类型数据 + 高优先级类型数据 ——> 结果会自动转换为高优先级数据
    long sum = aInt + bLong;

    //long -> int 需要强制类型转换
    int d = (int) bLong;
    //double -> int 需要强制类型转换
    int e = (int) cDouble;

    System.out.println("自动类型转换 int—>long:  " + sum);
    System.out.println("强制类型转换 long—>int:  " + d);
    System.out.println("强制类型转换 double—>int:  " + e);
    System.out.println();


    //int 和 byte 转换
    byte fByte = (byte) aInt;  //高转低，强转
    int gInt = fByte;          //低转高，自动
    System.out.println("高转低-强转，int->byte:  " + fByte);
    System.out.println("低转高-自动，byte->int:  " + gInt);
    System.out.println();

    //int 和 char 转换
    char hChar = 'a';
    int iInt = hChar;
    char j = (char) iInt;
    System.out.println("低转高-自动，char->int:  " + iInt);
    System.out.println("高转低-强转，int->char:  " + j);
    System.out.println();

    //int 和 String 转换
    //int转String： 1）使用String的ValueOf方法   2）直接使用 String类+ (即字符串拼接)，任意字符串和其他类型"+" 都会把其他类型转为字符串
    String str1 = String.valueOf(aInt);
    String str2 = "" + aInt;
    System.out.println("int转String： " + str1 + ",  " + str2);
    //String转int：调用包装类的Integer.parseInt方法，当字符串中包含非数字时会出错
    String str3 = "18";
    int k = Integer.parseInt(str3);
    System.out.println("String转int： " + k);
    System.out.println();

    //byte 和 char 互转
    byte m = (byte) hChar;
    char n = (char) m;
    System.out.println("char->byte，强转：  " + m);
    System.out.println("byte->char，强转：  " + n);
}
