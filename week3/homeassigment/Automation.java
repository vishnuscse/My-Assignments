package week3.homeassigment;

public class Automation extends MultipleLanguage implements Language,TestTool{


	@Override
	public void Selenium() {
		System.out.println("Selenium --> This is Call from Execution Class by overriding the Unimplemented Method");
		
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java --> This is Call from Execution Class by overriding the Unimplemented Method");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby --> This is Call from Execution Class by overriding the Unimplemented Method");
		
		
	}

	
	public static void main(String[] args) {
		
		Automation aU = new Automation();
		aU.Java();
		aU.Selenium();
		aU.python();
		aU.ruby();
		
		
	}

}
