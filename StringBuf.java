package corejava;

public class StringBuf {
	protected StringBuf() {
	}
	public static void main(final String[] args) {
		StringBuffer buf= new StringBuffer("java");
		buf.append(" guide verl/");
		buf.append(7);
		int index=5;
		buf.insert(index,"Student ");
		index=23;
		buf.setCharAt(index,'.');
		int start=24;
		int end=25;
		buf.replace(start,end,"8");
		String s=buf.toString();
		System.out.println(s);
}
}
