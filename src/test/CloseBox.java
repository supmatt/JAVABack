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
//		String sentenceFormat = "%s �ڽ��������� %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
//		System.out.printf(sentenceFormat, name,kill,title);
//		//Format output2
////		System.out.format(sentenceFormat, name,kill,title);
//
//        System.out.printf("���ǻ��з�%n");
//        System.out.printf("���ǻ��з�%n");
//		int year = 2020;
//		System.out.format("%d%n", year);
//		System.out.format("%8d%n",year);
//		System.out.format("%-8d%n",year);
//		System.out.format("%05d%n",year);
//		System.out.format("%,8d%n",year*1000000);
//		System.out.format("%.2f%n", Math.PI);
//		System.out.format(Locale.CANADA,"%,.2f%n",Math.PI*10000);
		String[] input7 = new String[7];
		for(int i=0; i <7; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("Please input some word ");
			input7[i] = s.nextLine();
		}
		String content = "%s���%s,�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s���%s������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";
		System.out.format(content,input7[0],input7[1],input7[2],input7[3],input7[4],input7[5],input7[6]);
	}

}
