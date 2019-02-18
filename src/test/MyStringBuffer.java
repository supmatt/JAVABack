package test;

public class MyStringBuffer implements IStringBuffer{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	 private char[] ca = null;
	  private int index = 0;
	  public MyStringBuffer() {
	    ca = new char[20];
	  }
	  public String toString() {
	    return new String(ca);
	  }
	  public void append(String str) {
	    // TODO Auto-generated method stub
	    char[] cb = str.toCharArray();
	    if(ca == null) {
	      index = 0;
	      ca = new char[str.length() * 2];
	       
	      for(int i=0; i<str.length(); i++) {
	        ca[i] = cb[i];
	        index++;
	      }
	    } else {
	      int newLen = index + str.length();
	      if(newLen > ca.length*3/4) {
	        expand(newLen);
	      }
	      for(int i=0; i<str.length(); i++) {
	        ca[index] = cb[i];
	        index++;
	      }
	    }
	  }
	  private void expand(int len) {
	    if(ca == null) return;
	     
	    int newlen = len * 2;
	    char[] newc = new char[newlen];
	    for (int i = 0; i < ca.length; i++) {
	      newc[i] = ca[i];
	    }
	    ca = newc;
	  }
	   
	  public void append(char c) {
	    // TODO Auto-generated method stub
	    int newLen = index + 1;
	    if(newLen > ca.length*3/4) {
	      expand(newLen);
	    }
	      ca[index] = c;
	      index++;
	  }
	 
	  public void insert(int pos, char b) {
	    // TODO Auto-generated method stub
	    int newLen = index + 1;
	    if(newLen > ca.length*3/4) {
	      expand(newLen);
	    }
	    int len = index-pos;
	    char[] ct = new char[len];
	      for(int i=0; i<len; i++) {
	        ct[i] = ca[pos+i];
	      }
	      ca[pos] = b;
	      index = pos + 1;
	      for(int i=0; i<len; i++) {
	        ca[index] = ct[i];
	        index++;
	      }
	       
	  }
	 
	  public void insert(int pos, String b) {
	    // TODO Auto-generated method stub
	    char[] cs = b.toCharArray();
	     
	    int newLen = index + b.length();
	    if(newLen > ca.length*3/4) {
	      expand(newLen);
	    }
	    int len = index-pos;
	    char[] ct = new char[len];
	      for(int i=0; i<len; i++) {
	        ct[i] = ca[pos+i];
	      }
	      index = pos;
	      for(int i=0; i<b.length(); i++) {
	        ca[index] = cs[i];
	        index++;
	      }
	      for(int i=0; i<len; i++) {
	        ca[index] = ct[i];
	        index++;
	      }
	  }
	 
	  public void delete(int start) {
	    // TODO Auto-generated method stub
	    for(; index>start; index--) {
	      ca[index] = '\u0000';
	    }
	    ca[index] = '\u0000';
	  }
	 
	  public void delete(int start, int end) {
	    // TODO Auto-generated method stub
	    int len = index - end;
	    char[] ct = new char[len];
	    for(int i=0; i<len; i++) {
	      ct[i] = ca[end+i];
	    }
	    this.delete(start);
	    String str = new String(ct);
	    this.append(str);
	  }
	 
	  public void reverse() {
	    // TODO Auto-generated method stub
	    char[] nc = new char[ca.length];
	    int index_t = index;
	    for(int i=0; i<index; i++) {
	      nc[i] = ca[--index_t];
	    }
	    ca = nc;
	  }
	 
	  public int length() {
	    // TODO Auto-generated method stub
	    return index;
	  }
	   
	  public static void main(String[] args) {
	    MyStringBuffer msb = new MyStringBuffer();
	    String s = "gagagaga";
	    msb.append(s);
	    System.out.println("wa");
	    System.out.println(msb.toString());
	    char c = 'w';
	    msb.append(c);
	    System.out.println(msb.toString());
	    msb.insert(2, "!asdfasdfasdfasdf!");
	    System.out.println(msb.toString());
	    msb.delete(2, 5);
	    System.out.println(msb.toString());
	    System.out.println(msb.length());
	    msb.reverse();
	    System.out.println(msb.toString());
	  }
}
