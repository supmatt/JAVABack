package test;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CloseBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class1
//		int i = 5;
//		Integer it = new Integer(i);
//		int i2 = it.intValue();
//		int i3 = it;
//		System.out.println(i2);
//		System.out.println(it instanceof Number);
//		System.out.println(i3);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println("--------------");
//		byte b = 25;
//		Byte bb = new Byte(b);
//		byte b2 = bb.byteValue();
//		System.out.println(b2);
		//Class2
//		int i = 5;
//		String str = String.valueOf(i);
//		System.out.println(str);
//		Integer it = i;
//		String str2 = it.toString();
//		System.out.println(str2);
//		String str = "101";
//		int i = Integer.parseInt(str);
//		System.out.println(i);
//		float f = 3.14f;
//		System.out.println(f);
//		String cc = String.valueOf(f);
//		//facon2
//		Float ft = f;
//		String str2 = ft.toString();
//		System.out.println("facon 2 is: " + str2);
//		System.out.println(cc);
//		float ff = Float.parseFloat(cc);
//		System.out.println(ff);
		//class3
//		float f1 = 5.4f;
//		float f2 = 5.5f;
//		System.out.println(Math.round(f1));
//		System.out.println(Math.round(f2));
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()*10));
//		System.out.println(Math.sqrt(9));
//		System.out.println(Math.pow(2, 4));
//		System.out.println(Math.PI);
//		System.out.println(Math.E);
		//Format output
//		String name = "ManA";
//		int kill = 8;
//		String title = "Oh My God";
////		String sentence = name + " do " + kill + " time attack, and get " + title + " title.";
////		System.out.println(sentence);
//		String sentenceFormat = "%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
//		System.out.printf(sentenceFormat, name,kill,title);
//		//Format output2
////		System.out.format(sentenceFormat, name,kill,title);
//
//        System.out.printf("这是换行符%n");
//        System.out.printf("这是换行符%n");
//		int year = 2020;
//		System.out.format("%d%n", year);
//		System.out.format("%8d%n",year);
//		System.out.format("%-8d%n",year);
//		System.out.format("%05d%n",year);
//		System.out.format("%,8d%n",year*1000000);
//		System.out.format("%.2f%n", Math.PI);
//		System.out.format(Locale.CANADA,"%,.2f%n",Math.PI*10000);
//		String[] input7 = new String[7];
//		for(int i=0; i <7; i++) {
//			Scanner s = new Scanner(System.in);
//			System.out.println("Please input some word ");
//			input7[i] = s.nextLine();
//		}
//		String content = "%s最大%s,倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多的%s，现在全部只卖二十块，统统只要二十块!王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
//		System.out.format(content,input7[0],input7[1],input7[2],input7[3],input7[4],input7[5],input7[6]);
		//character
//		char c1 ='a';
//		char c2 ='1';
//		char c3 = '啦';
//		char c4 = 'b';
//		Character c = c1;
//		c1 = c;
//		System.out.println(Character.isLetter('a'));
//		System.out.println(Character.isDigit(c2));
//		System.out.println(Character.isWhitespace(' '));
//		System.out.println(Character.isUpperCase('a'));
//		System.out.println(Character.isLowerCase('a'));
//		System.out.println(Character.toUpperCase('a'));
//		System.out.println(Character.toLowerCase('A'));
//		
//		String a = 'a';
//		String a2 = Character.toString('a');
		
//		System.out.println("使用空格无法达到对齐的效果");
//        System.out.println("abc def");
//        System.out.println("ab def");
//        System.out.println("a def");
//          
//        System.out.println("使用\\t制表符可以达到对齐的效果");
//        System.out.println("abc\tdef");
//        System.out.println("ab\tdef");
//        System.out.println("a\tdef");
//         
//        System.out.println("一个\\t制表符长度是8");
//        System.out.println("12345678def");
//          
//        System.out.println("换行符 \\n");
//        System.out.println("abc\ndef");
// 
//        System.out.println("单引号 \\'");
//        System.out.println("abc\'def");
//        System.out.println("双引号 \\\"");
//        System.out.println("abc\"def");
//        System.out.println("反斜杠本身 \\");
//        System.out.println("abc\\def");
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please some word: ");
//		String str = sc.nextLine();
//		char[] cs = str.toCharArray(); 
//		for (char item : cs) {
//            if (Character.isUpperCase(item)||Character.isDigit(item)) {
//                System.out.print(item);
//            }
//        }

		
//		String name = "盖伦";
//		String teemo = new String("提莫");
//		char[] cs = new char[]{'崔','斯','特'};
//		String hero = new String(cs);
//		String hero2 = garen + teemo;
//		System.out.println(name.length());
//		String unknowHero = "";
//		System.out.println(unknowHero.length());
		
		//MyString str = new MyString(); 
		//exercise 6
		
//		char[] ran = new char[5];
//		
//		for(char item:ran) {
//			int a = (int) (Math.random()*100);
//			double b = Math.random();
//			if(a <=33) {
//				int c = (int)(b*10+48);
//				char s = (char) c;
//				System.out.print(s);
//			}else if(a<=66) {
//				int c= (int)(b*26+65);
//				char s = (char) c;
//				System.out.print(s);	
//			}else{
//				int c= (int)(b*26+97);
//				char s = (char) c;
//				System.out.print(s);	
//			}
//		}
//		char[] ch = new char[8];
		//Control string
//		String sentence1 = " aSD,f3盖伦,在进 行  ";
//		String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
//		char c = sentence.charAt(6);
//		System.out.println(c);
//		char[] cs = sentence.toCharArray();
//		System.out.println(sentence.length()== cs.length);
//		String subString1 = sentence.substring(3);
//		System.out.println(subString1);
//		String subString2 = sentence.substring(3, 6);
//		System.out.println(subString2);
		
//		String subSentences[] = sentence.split(",");
//		for(String sub:subSentences) {
//			System.out.println(sub);
//		}
		
//		System.out.println(sentence);
//		System.out.println(sentence.trim());
//		System.out.println(sentence.toLowerCase());
//		System.out.println(sentence.toUpperCase());
		
//		System.out.println(sentence.indexOf("盖伦"));
//		System.out.println(sentence2.lastIndexOf("了"));
//		System.out.println(sentence.indexOf(',',5));
//		System.out.println(sentence.contains("击杀"));
		
//		String temp = sentence.replaceAll("击杀", "被击杀");
//		temp = temp.replaceAll("超神", "超鬼");
//		System.out.println(temp);
//		temp = sentence.replaceFirst(",", "");
//		System.out.println(temp);
//		String sentence3 = "let there be light";
//		String toup = sentence3.toUpperCase();
//		System.out.println(toup);
//		String subs[] = sentence3.split(" ");
//		for(String sub:subs) {
//			for(int i=0; i<sub.length(); i++) {
//				if(i==0) {
////					sub[0] = sub[0].toUpperCase();
//				}
//				
//			}
//			System.out.println(sub);
//	}
		//compare String
//		String str1 =  "the light";
//		String str2 = new String(str1);
//		String str3 = "the light";
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		String start = "the";
//		String end = "ight";
//		System.out.println(str1.startsWith(start));
//		System.out.println(str1.endsWith(end));
		//Exercise about compare String array
		char[] two = new char[100];
		for(int i=0; i<100; i++) {
			char n = (char) (Math.random()*100);
			two[i] = n;
			
			int a = (int) (Math.random()*100);
			int b = (int) (Math.random()*100);
			System.out.println(abs(a));
//			char[] dd = new char[2] {abs(a),abs(b)};
			
//			String ab = (String) ((char)abs(a) + (char)abs(b));
//			double b = Math.random();
//			
			
//			if((i+1)%20==0) {
//				System.out.println(ab+" ");
//			}else {
//				System.out.print(ab+" ");
//			}
		}
		
	}
	public static char abs(int a) {
		double b = Math.random();
		char s;
		if(a <=33) {
			int c = (int)(b*10+48);
			s = (char) c;
		}else if(a<=66) {
			int c= (int)(b*26+65);
			s = (char) c;
		}else{
			int c= (int)(b*26+97);
			s = (char) c;
		}
		return s;
		
	}
}
