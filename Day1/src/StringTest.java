
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="hello";
   String ss=s.substring(0,2);
   String band=String.join("/", s,ss,"test");
   System.out.println(band);
   
   String a="";
   String b=null;
   System.out.println(a.equals(""));
   //System.out.println(b.equals(""));
   //当字符串为null时这种写法会报空指针
   System.out.println("".equals(a));
   //这种写法是对的
   System.out.println(a!=null&&a.length()!=0);
   //判断一个字符串是否为空，一定要先判断是否为null
   System.out.println(s.charAt(0));//获取某一位的char值
   System.out.println(s.codePointAt(0));//获取某一点的码点值
   System.out.println(s.compareTo("hel")+"last");//
	}

}
