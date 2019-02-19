package character;
 
public class MyStringBuffer implements IStringBuffer{
 
//    int capacity = 16;
//    int length = 0;
//    char[] value;
//    public MyStringBuffer(){
//        value = new char[capacity];
//    }
//     
//    //�вι��췽��
//    public MyStringBuffer(String str){
//        this();
//        if(null==str)
//            return;
//         
//        if(capacity<str.length()){
//            capacity  = value.length*2;
//            value=new char[capacity];
//        }
//         
//        if(capacity>=str.length())
//            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
//         
//        length = str.length();
//         
//    }
//     
//    @Override
//    public void append(String str) {
// 
//        insert(length,str);
//    }
// 
//    @Override
//    public void append(char c) {
//        append(String.valueOf(c));
//         
//    }
// 
//    @Override
//    public void insert(int pos, char b) {
//        insert(pos,String.valueOf(b));
//    }
// 
//    @Override
//    public void delete(int start) {
//         
//        delete(start,length);
//    }
// 
//    @Override
//    public void delete(int start, int end) {
//        //�߽������ж�
//        if(start<0)
//            return;
//         
//        if(start>length)
//            return;
//         
//        if(end<0)
//            return;
//         
//        if(end>length)
//            return;
//         
//        if(start>=end)
//            return;
//         
//        System.arraycopy(value, end, value, start, length- end);
//        length-=end-start;
//         
//    }
// 
//    @Override
//    public void reverse() {
// 
//        for (int i = 0; i < length/2; i++) {
//             
//            char temp = value[i];
//            value[i] = value[length-i-1];
//            value[length-i-1] = temp;
//        }
//         
//    }
// 
//    @Override
//    public int length() {
//        // TODO Auto-generated method stub
//        return length;
//    }
// 
//    @Override
//    public void insert(int pos, String b) {
// 
//        //�߽������ж�
//        if(pos<0)
//            return;
//         
//        if(pos>length)
//            return;
//         
//        if(null==b)
//            return;
//         
//        //����
//        while(length+b.length()>capacity){
//            capacity = (int) ((length+b.length())*1.5f);
//            char[] newValue = new char[capacity];
//            System.arraycopy(value, 0, newValue, 0, length);
//            value = newValue;
//        }
//         
//        char[] cs = b.toCharArray();
//         
//        //�Ȱ��Ѿ����ڵ�����������
//         
//        System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
//        //��Ҫ��������ݲ��뵽ָ��λ��
//        System.arraycopy(cs, 0, value, pos, cs.length);
//         
//        length = length+cs.length;
//         
//    }
//     
//    public String toString(){
//         
//        char[] realValue = new char[length];
// 
//        System.arraycopy(value, 0, realValue, 0, length);
//         
//        return new String(realValue);
//         
//    }
//     
//    public static void main(String[] args) {
//        MyStringBuffer sb = new MyStringBuffer("there light");
//        System.out.println(sb);
//        sb.insert(0, "let ");
//        System.out.println(sb);
// 
//        sb.insert(10, "be ");
//        System.out.println(sb);
//        sb.insert(0, "God Say:");
//        System.out.println(sb);
//        sb.append("!");
//        System.out.println(sb);
//        sb.append('?');
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//         
//        sb.reverse();
//        System.out.println(sb);
//         
//        sb.delete(0,4);
//        System.out.println(sb);
//        sb.delete(4);
//        System.out.println(sb);
// 
//    }
	int capacity = 16; //StringBuffer is 16
	int length = 0;   //Ĭ�ϸ�������
	char[] value;   // create a char array name is value
	
	public MyStringBuffer() {
		value = new char[capacity];    // value get a char number16
	}
	public MyStringBuffer(String str) { //constracter with value
//		if(null!=str)                  //if give exist value
//			value = str.toCharArray();  //we transfer this string to char
//		length = str.length();			//get length of str
//		if(capacity<value.length)		//if new char array is bigger
//			capacity = value.length*2;  //allow we save capacity to double char array
		
		this();
		if(null==str) return;
		if(capacity<str.length()) {
			capacity = value.length*2;
			value = new char[capacity];
		}
		if(capacity>=str.length()) {
			System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
		}
		length = str.length();
	}
	@Override
	public void append(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void append(char c) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(int pos, char b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insert(int pos, String b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int start) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		for (int i = 0; i < length / 2; i++) {
			char temp = value[i]; //create a new char which equal value[i]
			value[i] = value[length - i - 1]; // �ַ����а벿��ת����벿��
			value[length - i -1] = temp; //�������������ת���Ұ��
		}
	}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		char[] realValue = new char[length];
		System.arraycopy(value, 0, realValue, 0, length);
		return new String(realValue);
	}
	public static void main (String[] args) {
		MyStringBuffer sb = new MyStringBuffer("there light");
		sb.reverse();
		System.out.println(sb);
	}
	
}