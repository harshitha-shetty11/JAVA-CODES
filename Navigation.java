import java.util.Stack;
class Navigation{
	private final Stack <String> back= new Stack <>();
	private final Stack <String> forward=new Stack <>();
	private String current;
	public void visitpage(String page){
		if(current!=null)
			back.push(current);
		current=page;
		forward.clear();
		System.out.println("visited:"+current);
	}
	public void goback(){
		if(back.isEmpty()){
			System.out.println("No previous page");
			return;
		}
		forward.push(current);
		current=back.pop();
		System.out.println("Went back to:"+current);
	}
	public void goforward(){
		if(forward.isEmpty()){
			System.out.println("No forward page");
			return;
		}
		back.push(current);
		current =forward.pop();
		System.out.println("went forward to:"+current);
	}
	public static void main(String[] args){
		Navigation nav=new Navigation();
		nav.visitpage("page 1");
		nav.visitpage("page 2");
		nav.visitpage("page 3");
		nav.visitpage("page 4");
		nav.goback();
		nav.goforward();
		nav.goforward();
		nav.goback();
	}
}